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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import model.DataAduan;
import model.DataAduanList;

/**
 *
 * @author ASUS
 */
public class AjukanPengaduanController implements Initializable {
    ObservableList list = FXCollections.observableArrayList();
    
    @FXML
    private ChoiceBox<String> pilihTujuan;
    @FXML
    private TextField judulAduan;
    @FXML
    private TextArea deskripsiAduan;
    @FXML
    private Label berhasil = new Label();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
    }    

    @FXML
    public void ajukanPengaduanOut(ActionEvent event) throws IOException {
        Parent ajukanPengaduan = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
                Scene scene = new Scene(ajukanPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    
    @FXML
    public void ajukanPengaduanBeranda(ActionEvent event) throws IOException {
        Parent ajukanPengaduan = FXMLLoader.load(getClass().getResource("/view/Beranda.fxml"));
                Scene scene = new Scene(ajukanPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    @FXML
    public void loadData() {
        list.removeAll(list);
        String a = "Dinas Pariwisata DIY";
        String b = "Komisi Pemberantasan Korupsi";
        String c = "Dinas Pekerjaan Umum DIY";
        String d = "Badan Pengawas Obat dan Makanan";
        String e = "Kepolisian DIY";
        list.addAll(a,b,c,d,e);
        pilihTujuan.getItems().addAll(list);
    }
    
    @FXML
    public String instansiTujuan() {
        loadData();
        return pilihTujuan.getSelectionModel().getSelectedItem().toString();
    }
    
    @FXML
    public void kirimAduan(ActionEvent event) throws IOException {
        DataAduan da = new DataAduan();
        DataAduanList dal = new DataAduanList();
        da.setJudul(judulAduan.getText());
        da.setInstansi(instansiTujuan());
        da.setDeskripsi(deskripsiAduan.getText());
        dal.addData(judulAduan.getText(), instansiTujuan(), deskripsiAduan.getText()); 
        berhasil.setText("Aduan terkirim!");  
    }
    
    @FXML
    public void berandaIP(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/InstansiPemerintahan.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
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
    public void sp(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/SejarahAduan.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
}

