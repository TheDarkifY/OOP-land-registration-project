/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *                                          PropertyOwnerPropList
 * @author Hasan
 */
public class PropertyOwnerTableController implements Initializable {

    @FXML    private TableColumn<PropertyOwnerPropList, String> idCol;
    @FXML    private TableColumn<PropertyOwnerPropList, String> nameCal;
    @FXML    private TableView<PropertyOwnerPropList> proListTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idCol.setCellValueFactory(new PropertyValueFactory<PropertyOwnerPropList,String>("id"));
        nameCal.setCellValueFactory(new PropertyValueFactory<PropertyOwnerPropList,String>("name"));
       
    }    
    
}
