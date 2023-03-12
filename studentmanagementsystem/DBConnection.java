/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection con =null;
        
        try {
            Class.forName("org.sqlite.JDBC");
            con =DriverManager.getConnection("jdbc:sqlite:DataBase.db");
            JOptionPane.showMessageDialog(null, "Connection establishd");
            return con;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
       
    
    }
    
   /* public static ObservableList<users> getDatausers(){
    
        Connection con = getConnection();
        ObservableList<users> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("select * from Student");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new users(Integer.parseInt(rs.getString("RegistrationNumber")), rs.getString("StudentName"), rs.getString("Grade"), rs.getString("Sex"), Integer.parseInt(rs.getString("Birthday")), rs.getString("Address")));
                
            }
        } catch (Exception e) {
            
        }
        
        return list;
        
    }*/
    
}
