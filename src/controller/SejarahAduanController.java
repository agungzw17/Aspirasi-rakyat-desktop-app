package controller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import model.DataAduan;
import model.DataAduanList;
import model.DataAduanProperty;

public class SejarahAduanController implements Initializable {
    private DataAduanList dal;
    ObservableList list = FXCollections.observableArrayList();
    
    @FXML
    private TextField judulUbah;
 
    @FXML
    private ChoiceBox<String> pilihanUbah;
    
    @FXML
    private TextArea deskripsiUbah;
    
    
    @FXML
    private TableView<DataAduanProperty> tb;
    
    @FXML
    private TableColumn<DataAduanProperty, String> tb_judulAduan;
    
    @FXML
    private TableColumn<DataAduanProperty, String> tb_instansiAduan;
    
    @FXML
    private TableColumn<DataAduanProperty, String> tb_deskripsiAduan;
            
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tb.setEditable(true);
        tb_judulAduan.setCellFactory(TextFieldTableCell.forTableColumn());
        tb_instansiAduan.setCellFactory(TextFieldTableCell.forTableColumn());
        tb_deskripsiAduan.setCellFactory(TextFieldTableCell.forTableColumn());
                
        dal = new DataAduanList();
        DataAduan da = new DataAduan();
        dal.loadXMLFile();
        dal.readData();
        tb.setItems(dal.get());
        tb_judulAduan.setCellValueFactory(cellData -> cellData.getValue().judulAduan());
        tb_instansiAduan.setCellValueFactory(cellData -> cellData.getValue().instansiAduan());
        tb_deskripsiAduan.setCellValueFactory(cellData -> cellData.getValue().deskripsiAduan());
    }
    
    @FXML
    public void editJudul(TableColumn.CellEditEvent<DataAduanProperty, String>judulEdit){
        DataAduanProperty dap = tb.getSelectionModel().getSelectedItem();
        dap.setJudul(judulEdit.getNewValue());
        dal.saveXMLFile();
               //dal.saveData();
    }
    
    @FXML
    public void editInstansi(TableColumn.CellEditEvent<DataAduanProperty, String>instansiEdit){
        DataAduanProperty dap = tb.getSelectionModel().getSelectedItem();
        dap.setInstansi(instansiEdit.getNewValue());
 
        dal.saveXMLFile();
               //dal.saveData();
    }
    
    @FXML
    public void editDeskripsi(TableColumn.CellEditEvent<DataAduanProperty, String>deskripsiEdit){
        DataAduanProperty dap = tb.getSelectionModel().getSelectedItem();
        dap.setDeskripsi(deskripsiEdit.getNewValue());
        
        dal.saveXMLFile();
               //dal.saveData();
    }
    
    @FXML
    public void readData(){
        DataAduan da = new DataAduan();
        DataAduanList dal = new DataAduanList();
        Iterator<DataAduan> itr;
        List<DataAduan> data= new ArrayList();
        XStream xstream = new XStream(new StaxDriver());
        dal.getReadData();
        data = dal.getReadData();
        
        itr = data.iterator();
        while(itr.hasNext() == true){
            DataAduan da1 = itr.next();
            DataAduanProperty dap = new DataAduanProperty();
            dap.setJudul(da1.getJudul());
            dap.setInstansi(da1.getInstansi());
            dap.setDeskripsi(da1.getDeskripsi());  
        }
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
        pilihanUbah.getItems().addAll(list);
    }
    
    @FXML
    public void sejarahPengaduanOut(ActionEvent event) throws IOException {
        Parent sejarahPengaduan = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
                Scene scene = new Scene(sejarahPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    @FXML
    public void sejarahPengaduanBeranda(ActionEvent event) throws IOException {
        Parent sejarahPengaduan = FXMLLoader.load(getClass().getResource("/view/Beranda.fxml"));
                Scene scene = new Scene(sejarahPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    @FXML
    public void sejarahPengaduanSP(ActionEvent event) throws IOException {
        Parent sejarahPengaduan = FXMLLoader.load(getClass().getResource("/view/SejarahAduan.fxml"));
                Scene scene = new Scene(sejarahPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    @FXML
    public void sejarahPengaduanGT(ActionEvent event) throws IOException {
        Parent sejarahPengaduan = FXMLLoader.load(getClass().getResource("/view/statistik.fxml"));
                Scene scene = new Scene(sejarahPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    @FXML
    public void sejarahPengaduanIP(ActionEvent event) throws IOException {
        Parent sejarahPengaduan = FXMLLoader.load(getClass().getResource("/view/InstansiPemerintahan.fxml"));
                Scene scene = new Scene(sejarahPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    @FXML
    public void aduanBaru(ActionEvent event) throws IOException {
        Parent sejarahPengaduan = FXMLLoader.load(getClass().getResource("/view/AjukanPengaduan.fxml"));
                Scene scene = new Scene(sejarahPengaduan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    
    
}