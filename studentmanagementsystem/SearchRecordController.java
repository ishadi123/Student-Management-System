/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author User
 */
public class SearchRecordController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
