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
import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author User
 */
public class NewRecordsController implements Initializable {
    
   

    @FXML
    private TextField txt_name;

    @FXML
    private TextField txt_grade;

    @FXML
    private DatePicker date;

    @FXML
    private TextArea txt_address;

     @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;



    
    @FXML
    private Button btnAdd;
    
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
     ;

    @FXML
    void handleButtonAction(ActionEvent event) {
        
       
        
    }
}
