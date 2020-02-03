/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author PIJE
 */
public class ProfilController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Text nama;
    
     @FXML
    private Text username;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void profilOut(ActionEvent event) throws IOException {
         Parent profil = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
                Scene scene = new Scene(profil);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        
    }
    
    @FXML
    public void profilBeranda(ActionEvent event) throws IOException {
         Parent profil = FXMLLoader.load(getClass().getResource("view/Beranda.fxml"));
                Scene scene = new Scene(profil);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        
    }

    
    @FXML
    public void profilDelete(ActionEvent event) throws IOException {
        Parent profil = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
                Scene scene = new Scene(profil);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        
    }
    
        
    
}
