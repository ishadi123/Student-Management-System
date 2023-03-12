/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DeleteRecordController implements Initializable {

    @FXML
    private TableColumn<?, ?> col_regNo;
    @FXML
    private TableColumn<?, ?> col_Name;
    @FXML
    private TableColumn<?, ?> col_Grade;
    @FXML
    private TableColumn<?, ?> col_Sex;
    @FXML
    private TableColumn<?, ?> col_Birthday;
    @FXML
    private TableColumn<?, ?> col_Address;
    @FXML
    private ToggleGroup gender;
    @FXML
    private Button btnAdd1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
}
