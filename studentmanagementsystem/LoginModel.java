/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginModel {
    Connection connection;
    public LoginModel(){
        
        connection =DBConnection.getConnection();
        if(connection == null) {
            System.out.println("Connection not succesful");
        
        }System.exit(1);
    
    }
    
    public boolean isDbConnected(){
        
        try {
            return !connection.isClosed();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    
    }
    
    public boolean isLogin(String user, String pass) throws SQLException{
        PreparedStatement ps=null;
        ResultSet rs=null;
        String query = "SELECT * FROM Login WHERE UserName=? and Password=?";
        
        try {
            ps=connection.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pass);
            
            rs=ps.executeQuery();
            if(rs.next()){
                return true;
            }
            else{
                return false;
            }
                   
        } catch (SQLException ex) {
            return false;
        }
        
        finally{
            ps.close();
            rs.close();
        }
    
    }
    
}
