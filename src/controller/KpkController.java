/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

/**
 *
 * @author
 */
public class KpkController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    public void grafikp(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/statistik.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    @FXML
    private void berita1(ActionEvent event) throws IOException {
                Parent login = FXMLLoader.load(getClass().getResource("/view/KpkBerita1.fxml"));
                Scene scene = new Scene(login);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    @FXML
    private void berita2(ActionEvent event) throws IOException {
                Parent login = FXMLLoader.load(getClass().getResource("/view/KpkBerita2.fxml"));
                Scene scene = new Scene(login);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    private void berita3(ActionEvent event) throws IOException {
                Parent login = FXMLLoader.load(getClass().getResource("/view/KpkBerita3.fxml"));
                Scene scene = new Scene(login);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    private void berita4(ActionEvent event) throws IOException {
                Parent login = FXMLLoader.load(getClass().getResource("/view/KpkBerita4.fxml"));
                Scene scene = new Scene(login);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    private void berita5(ActionEvent event) throws IOException {
                Parent login = FXMLLoader.load(getClass().getResource("/view/KpkBerita5.fxml"));
                Scene scene = new Scene(login);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    public void instansiPemerintahan(ActionEvent event) throws IOException {
        Parent instansiPemerintahan = FXMLLoader.load(getClass().getResource("/view/InstansiPemerintahan.fxml"));
                Scene scene = new Scene(instansiPemerintahan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    public void instansiPemerintahanBeranda(ActionEvent event) throws IOException {
        Parent instansiPemerintahan = FXMLLoader.load(getClass().getResource("/view/Beranda.fxml"));
                Scene scene = new Scene(instansiPemerintahan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    public void backLogin(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    public void insatansiPemerintahanSejarahPengaduan(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/SejarahAduan.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
     @FXML
    public void profil(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Profil.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
