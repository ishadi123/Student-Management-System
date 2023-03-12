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
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DashboardController implements Initializable {

    
           @FXML
    private BorderPane borderPane;

    @FXML
    private Button btnNewRecord;

    @FXML
    private Button btnDsiplay;

    @FXML
    private Button btnModify;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnDelete;

    @FXML
    private Button exit;

    @FXML
    void clear(MouseEvent event) {
            Stage stage = (Stage) borderPane.getScene().getWindow();
            stage.close();
    }
    
    
    
    /* @FXML
    void handleButtonAction(ActionEvent event) {

    
        if(event.getSource() == btnNewRecord){
            pane_1.toFront();
        }
        else if(event.getSource() == btnDisplay){
            pane_2.toFront();
        }
        else if(event.getSource() == btnModify){
            pane_3.toFront();
        }
        else if(event.getSource() == btnSearch){
            pane_4.toFront();
        }
        else if(event.getSource() == btnDelete){
            pane_5.toFront();
        }
        
    }*/
    
    @FXML
    void displayRedord(MouseEvent event) {
        loadPage("DisplayRecord");
    }
    
    @FXML
    void newRecord(MouseEvent event) {
        loadPage("NewRecords");
    }
    
      @FXML
    void deleteRecord(MouseEvent event) {
        loadPage("DeleteRecord");
    }

   @FXML
    void searchRecord(MouseEvent event) {
        loadPage("SearchRecord");
    }
    
    @FXML
    void modifyRecord(MouseEvent event) {
        loadPage("ModifyRecord");
    }
    
    

    @FXML
    void handleButtonAction(ActionEvent event) {

    }

    

    
    public void initialize(URL url, ResourceBundle rb) {
        
    } 
    
    private void loadPage(String page){
        Parent root = null;
        
        
               try {
                   root = FXMLLoader.load(getClass().getResource(page+".fxml"));
               } catch (IOException ex) {
                   Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
               }
               
          borderPane.setCenter(root);
               
    }
    
    
}
    

