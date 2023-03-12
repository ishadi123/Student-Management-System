/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DisplayRecordController implements Initializable {

    
  
    @FXML
    private TextField txt_id;
    @FXML
    private TextField txt_name;
    @FXML
    private TextField txt_grade;
    @FXML
    private RadioButton radioMale;
    @FXML
    private ToggleGroup gender;
    @FXML
    private RadioButton radioFemale;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextArea txt_address;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
   /* private void loadData(){
        list.removeAll(list);
        list.addAll(new Details(Integer.parseInt("RegistrationNumber"),"StudentName","Grade","Sex","Birthday","Address"));

    }
   public static class Details{
        private final SimpleStringProperty num;
        private final SimpleStringProperty name;
        private final SimpleStringProperty grade;
        private final SimpleStringProperty se;
        private final SimpleStringProperty birthday;
        private final SimpleStringProperty address;
        
    
        public Details(Integer num, String name, String grade, String se, String birthday,String address) {
            this.num = SimpleIntegerProperty(num);
            this.name = SimpleStringProperty(name);
            this.grade = SimpleStringProperty(grade);
            this.se = SimpleStringProperty(se);
            this.birthday = SimpleStringProperty(birthday);
            this.address = SimpleStringProperty(address);
        }

        private Details(String registrationNumber) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public String getNum() {
            return num.get();
        }

        public String getName() {
            return name.get();
        }

        public String getGrade() {
            return grade.get();
        }

        public String getSe() {
            return se.get();
        }

        public String getBirthday() {
            return birthday.get();
        }

        public String getAddress() {
            return address.get();
        }

        private SimpleStringProperty SimpleStringProperty(String num) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private SimpleStringProperty SimpleIntegerProperty(Integer num) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }*/
    
}
