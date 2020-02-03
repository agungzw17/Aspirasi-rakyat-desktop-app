/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

/**
 *
 * @author
 */
public class InstansiPemerintahanController implements Initializable {

    @FXML
    private Button B_AP;
    @FXML
    private Button B_SP;
    @FXML
    private Button B_GT;
    
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
    public void backLogin(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
                Scene scene = new Scene(beranda);
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
    
    public void insatansiPemerintahanSejarahPengaduan(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/SejarahAduan.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
//    public void insatansiPemerintahanGrafikPermasalahan(ActionEvent event) throws IOException {
//        Parent beranda = FXMLLoader.load(getClass().getResource(""));
//                Scene scene = new Scene(usecase4);
//                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//                window.setScene(scene);
//                window.initModality(Modality.APPLICATION_MODAL);
//                window.initStyle(StageStyle.UNDECORATED);
//                window.show();
//    }
    
    public void insatansiPemerintahanDinasPariwisata(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Pariwisata.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    public void insatansiPemerintahanDinasPekerjaanUmum(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Pupr.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    public void insatansiPemerintahanBpom(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Bpom.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    public void beritaKPK(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Kpk.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
    @FXML
    public void insatansiPemerintahanKepolisian(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Polisi.fxml"));
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
