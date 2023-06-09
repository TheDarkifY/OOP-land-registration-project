/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class MainLandregistrationLoginSceneController implements Initializable {

    @FXML
    private ComboBox<String> chooseUsertypeComboBox;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chooseUsertypeComboBox.getItems().addAll(
                // Moktar
                "Lawyer","Tax assessor","Buyer", "Seller",
                "Property Owner", "Government Official", "Surveyor",
                "Bank representative"
        );
    }
    
    @FXML
    private void handleSceneComboBoxAction(ActionEvent event) {
    
    // code to change the scene based on the selected item
    
    }

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        String selectedItem = chooseUsertypeComboBox.getSelectionModel().getSelectedItem().toString();
<<<<<<< HEAD
        switch(selectedItem){
=======
        if(selectedItem == "Lawyer"){
                String lawid = loginIDtxtF.getText();
                String lawpass = loginPasswordField.getText();
                ArrayList<String> idList = new ArrayList<String>();
                ArrayList<String> passList = new ArrayList<String>();
                File x = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;
                try {
                    
                    x = new File("lawlogin.bin");
                    fis = new FileInputStream(x);
                    ois = new ObjectInputStream(fis);
                    Lawyer l;
                    try{
                        //outputTextArea.setText("");
                        //ArrayList<String> idList = new ArrayList<String>();
                        while(true){
                        
                        //System.out.println("Printing objects.");
                        l = (Lawyer)ois.readObject();
                        String id = l.ID;
                        String pass = l.pass;
                        idList.add(id);
                        passList.add(pass);
                        //System.out.println(idList.size());
                        
                        //idList.add(id);
                        //passList.add(pass);
                        //Object obj = ois.readObject();
                        //obj.submitReport();
                        //emp.submitReport();
                        //if(lawid.equals(l.ID) && lawpass.equals(l.pass)){
                        //   System.out.println("a");
                        //}
                        //System.out.println(id + pass);
                        //System.out.println(l.pass);
                        
                        //outputTextArea.appendText(emp.toString());
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
                }if (lawid.trim().isEmpty() && lawpass.trim().isEmpty()) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }else if(idList.contains(lawid)&&passList.contains(lawpass)){
                    Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("LawyerCasesScene.fxml"));
                    Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                    Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    lawyerMenuListStage.setTitle("Welcome to Lawyer Dashboard!");
                    lawyerMenuListStage.setScene(lawyerMenuListScene);
                    lawyerMenuListStage.show();
            
                }
                else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }
            
        }
                else if(selectedItem == "UNO"){
                String unoID = loginIDtxtF.getText();
                String unoPass = loginPasswordField.getText();
                ArrayList<String> unoIDlist = new ArrayList<String>();
                ArrayList<String> unoPassList = new ArrayList<String>();
                File unoX = null;
                FileInputStream unoFis = null;      
                ObjectInputStream unoOis = null;
                try {
                    
                    unoX = new File("UNoLoginData.bin");
                    unoFis = new FileInputStream(unoX);
                    unoOis = new ObjectInputStream(unoFis);
                    UNO u;
                    try{
                        while(true){
                            u = (UNO)unoOis.readObject();
                            String id = u.ID;
                            String pass = u.pass;
                            unoIDlist.add(id);
                            unoPassList.add(pass);
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                    if(unoOis != null) unoOis.close();
                } catch (IOException ex) { }
                }if(unoID.trim().isEmpty() && unoPass.trim().isEmpty()){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login to your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                    
                }else if(unoIDlist.contains(unoID)&&unoPassList.contains(unoPass)){
                    Parent UNOdashboard_Link = FXMLLoader.load(getClass().getResource("UNodashboardScene.fxml"));
                    Scene creating_sceneofUNOdashb = new Scene(UNOdashboard_Link);
                    Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_uno.setTitle("Welcome to Upazila Nirbahi Officer Dashboard ");
                    creating_stage_for_uno.setScene(creating_sceneofUNOdashb);
                    creating_stage_for_uno.show();
                }else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }

            
        }/*else if(selectedItem == "Lawyer"){
                String lawID = loginIDtxtF.getText();
                String lawPass = loginPasswordField.getText();
                ArrayList<String> lawIDlist = new ArrayList<String>();
                ArrayList<String> lawPassList = new ArrayList<String>();
                File lawX = null;
                FileInputStream lawFis = null;      
                ObjectInputStream lawOis = null;
                try {
                    
                    lawX = new File("LawyerLoginData.bin");
                    lawFis = new FileInputStream(lawX);
                    lawOis = new ObjectInputStream(lawFis);
                    Lawyer l;
                    try{
                        while(true){
                            l = (Lawyer)lawOis.readObject();
                            String id = l.ID;
                            String pass = l.pass;
                            lawIDlist.add(id);
                            lawPassList.add(pass);
=======
    } else if(selectedItem == "GovernmentOfficial"){
                String govID = loginIDtxtF.getText();
                String govPass = loginPasswordField.getText();
                ArrayList<String> govIDlist = new ArrayList<String>();
                ArrayList<String> govPassList = new ArrayList<String>();
                File govX = null;
                FileInputStream govFis = null;      
                ObjectInputStream govOis = null;
                try {
                    
                    govX = new File("GOVLoginData.bin");
                    govFis = new FileInputStream(govX);
                    govOis = new ObjectInputStream(govFis);
                    GovernmentOfficial a;
                    try{
                        while(true){
                            a = (GovernmentOfficial)govOis.readObject();
                            String id = a.ID;
                            String pass = a.pass;
                            govIDlist.add(id);
                            govPassList.add(pass);
>>>>>>> 39a242c746e833e902f3ce7b7ee12ff691db03c6
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
<<<<<<< HEAD
                    if(lawOis != null) lawOis.close();
                } catch (IOException ex) { }
                }if(lawID.trim().isEmpty() && lawPass.trim().isEmpty()){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login to your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                    
                }else if(lawIDlist.contains(lawID)&&lawPassList.contains(lawPass)){
                    Parent lawdashboard_Link = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                    Scene  lawdashboardScene= new Scene(lawdashboard_Link);
                    Stage creating_stage_for_law  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_law.setTitle("Welcome to Lawyer Dashboard! ");
                    creating_stage_for_law.setScene(lawdashboardScene);
                    creating_stage_for_law.show();
                }else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();
=======
                if(govFis != null) govOis.close();
                } catch (IOException ex) {
                }
                
                }if(govID.trim().isEmpty() && govPass.trim().isEmpty()){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                          
                }else if(govIDlist.contains(govID)&&govPassList.contains(govPass)){
                    Parent UNOdashboard_Link = FXMLLoader.load(getClass().getResource("UNODashboardScene.fxml"));
                    Scene creating_sceneofUNOdashb = new Scene(UNOdashboard_Link);
                    Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_uno.setTitle("Welcome Upazila Nirbahi Officer Dashboard ");
                    creating_stage_for_uno.setScene(creating_sceneofUNOdashb);
                    creating_stage_for_uno.show();
>>>>>>> 39a242c746e833e902f3ce7b7ee12ff691db03c6
                }
                
         }*/else if(selectedItem == "Surveyor"){
                String survoid = loginIDtxtF.getText();
                String survopass = loginPasswordField.getText();
                ArrayList<String> idList = new ArrayList<String>();
                ArrayList<String> passList = new ArrayList<String>();
                File x = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;
                try {
                    
                    x = new File("SurveyorLoginData.bin");
                    fis = new FileInputStream(x);
                    ois = new ObjectInputStream(fis);
                    Surveyor s;
                    try{
                        while(true){
                        s = (Surveyor)ois.readObject();
                        String id = s.ID;
                        String pass = s.pass;
                        idList.add(id);
                        passList.add(pass);
                        }
                    }//end of nested try
                    catch(Exception e){
                    }             
                } catch (IOException ex) { } 
                finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
                }
                if (survoid.trim().isEmpty() && survopass.trim().isEmpty()) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Enter Login Data and Please Try Again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }else if(idList.contains(survoid)&&passList.contains(survopass)){
                    Parent SurveyorSignIn = FXMLLoader.load(getClass().getResource("SurveyorsDashboardScene.fxml"));
                    Scene SurveyorSignInScene = new Scene(SurveyorSignIn);
                    Stage SurveyorSignInStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    SurveyorSignInStage.setTitle("Welcome to Surveyor Dashboard!");
                    SurveyorSignInStage.setScene(SurveyorSignInScene);
                    SurveyorSignInStage.show();
            
                }
                else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();

                }
                 
           }else if(selectedItem == "Bank representative"){
                String bankid = loginIDtxtF.getText();
                String bankpass = loginPasswordField.getText();
                ArrayList<String> idList = new ArrayList<String>();
                ArrayList<String> passList = new ArrayList<String>();
                File x = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;
                try {
                    
                    x = new File("BankReprensentativeLoginData.bin");
                    fis = new FileInputStream(x);
                    ois = new ObjectInputStream(fis);
                    BankReprensentative b;
                    try{
                        while(true){
                        b = (BankReprensentative)ois.readObject();
                        String id = b.ID;
                        String pass = b.pass;
                        idList.add(id);
                        passList.add(pass);
                        }
                    }//end of nested try
                    catch(Exception e){
                    }             
                } catch (IOException ex) { } 
                finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
                }
                if (bankid.trim().isEmpty() && bankpass.trim().isEmpty()) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Enter Login Data and Please Try Again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }else if(idList.contains(bankid)&&passList.contains(bankpass)){
                    Parent BankSignIn = FXMLLoader.load(getClass().getResource("Bank_DashBoard.fxml"));
                    Scene BankSignInScene = new Scene(BankSignIn);
                    Stage BankSignInStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    BankSignInStage.setTitle("Welcome to Bank Reprensentative Dashboard!");
                    BankSignInStage.setScene(BankSignInScene);
                    BankSignInStage.show();
            
                }
                else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();             
                }
           } else if(selectedItem == "Government Official"){
                String govID = loginIDtxtF.getText();
                String govPass = loginPasswordField.getText();
                ArrayList<String> govIDlist = new ArrayList<String>();
                ArrayList<String> govPassList = new ArrayList<String>();
                File govX = null;
                FileInputStream govFis = null;      
                ObjectInputStream govOis = null;
                try {
                    
                    govX = new File("GovernmentOfficialsLoginData.bin");
                    govFis = new FileInputStream(govX);
                    govOis = new ObjectInputStream(govFis);
                    GOVofficials g;
                    try{
                        while(true){
                            g = (GOVofficials)govOis.readObject();
                            String id = g.ID;
                            String pass = g.pass;
                            govIDlist.add(id);
                            govPassList.add(pass);
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                    if(govOis != null) govOis.close();
                } catch (IOException ex) { }
                }if(govID.trim().isEmpty() && govPass.trim().isEmpty()){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                    
                }else if(govIDlist.contains(govID)&&govPassList.contains(govPass)){
                    Parent govdashboard_Link = FXMLLoader.load(getClass().getResource("GOVdashboard.fxml"));
                    Scene creating_sceneofgovdashb = new Scene(govdashboard_Link);
                    Stage creating_stage_for_gov  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_gov.setTitle("Welcome to Governmet Official Dashboard ");
                    creating_stage_for_gov.setScene(creating_sceneofgovdashb);
                    creating_stage_for_gov.show();
                }else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }
           }
     
    
        /*switch(selectedItem){
>>>>>>> 91d99a01d328d291ac650baee3f939d67eebb62c
            case "Lawyer":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
        /*    case "Tax assessor":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Buyer":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Seller":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Property Owner":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Government Official":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Surveyor":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Bank representative":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show(); */
                
        }
    }

    @FXML
    private void signupButtonOnClick(MouseEvent event) throws IOException {
        Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("chooseUsertypeForSignup.fxml"));
        Scene lawyerMenuListScene = new Scene(lawyerMenuList);
        Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        lawyerMenuListStage.setTitle("Lawyer");
        lawyerMenuListStage.setScene(lawyerMenuListScene);
        lawyerMenuListStage.show();
    }
    
}
