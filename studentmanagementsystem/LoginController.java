/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LoginController implements Initializable {
    
    
    @FXML
    private AnchorPane anchorPane;
    
     @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnCancel;
    
    @FXML
    private AnchorPane pane;

    @FXML
    void handleButtonActionCancel(ActionEvent event) {
            Platform.exit();
    }

    @FXML
    void handleButtonActionLogin(ActionEvent event) {
        String uname = txtUserName.getText();
           String password = txtPassword.getText();
           
           if(uname.equals("") && password.equals(""))
           {
               JOptionPane.showMessageDialog(null, "UserName or Password empty");
           }
            Connection con =DBConnection.getConnection();
            PreparedStatement ps;
            
            try {
                   ps=con.prepareStatement("SELECT * FROM Login WHERE UserName=? and Password=? ");
                   
                   ps.setString(1,txtUserName.getText());
                   ps.setString(2, String.valueOf(txtPassword.getText()));
                   
                   ResultSet rs=ps.executeQuery();
                        if(rs.next())
                   {
                      /*JOptionPane.showMessageDialog(null, "Login Success");*/
                       try {
                           
                       pane = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
                       Stage stage =new Stage();
                       Scene scene = new Scene(pane);
                       stage.setTitle("Welcome Student Management System");
                       stage.setScene(scene);
                       stage.setMinHeight(2000);
                       stage.setMinWidth(2500);
                       stage.resizableProperty().setValue(false);
                       stage.initStyle(StageStyle.UTILITY);
                       stage.initStyle(StageStyle.UNDECORATED);
                       stage.show();
                       anchorPane.getScene().getWindow().hide();
                       
                       } catch (Exception ex) {
                           System.out.println("Can't load new window");
                       }
                       
                   }
                   
                   else
                   {
                       JOptionPane.showMessageDialog(null, "Login failed");
                       txtUserName.setText("");
                       txtPassword.setText("");
                       txtUserName.requestFocus();
                   }
            }
            
            catch (SQLException ex) {
                   Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
               }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
