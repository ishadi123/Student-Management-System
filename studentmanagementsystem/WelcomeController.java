/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class WelcomeController implements Initializable {
 @FXML
    private BorderPane borderPane;
 @FXML
private AnchorPane apane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        splash();
    }   
    
    private void splash(){
        new Thread(){
            public void run(){
                try {
                    Thread.sleep(7000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                
                Platform.runLater(new Runnable(){
                    public void run(){
                        try {
                       borderPane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                       Stage stage =new Stage();
                       Scene scene = new Scene(borderPane);
                       stage.setTitle("Welcome Student Management System");
                       stage.setScene(scene);
                       stage.setMinHeight(1000);
                       stage.setMinWidth(1600);
                       
                       stage.show();
                       apane.getScene().getWindow().hide();
                            
                            
                        } catch (IOException ex) {
                            Logger.getLogger(WelcomeController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                    }
                                    
                
                });
            
            }
        }.start();
    
    
    }
    
    }    
    

