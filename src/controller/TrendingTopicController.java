package controller;

import controller.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Frekuensi;
import model.DataAduan;
import model.DataAduanList;
import model.DataAduanProperty;
import model.DataPengguna;
import model.DataPenggunaList;

public class TrendingTopicController implements Initializable {
    
    @FXML
    private Pane paneView;

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    @FXML
    private Text modus;
    
    @FXML
    private Text total;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        DataAduan da = new DataAduan();
        DataAduanList daftar = new DataAduanList();
        daftar.readData();
        daftar.loadXMLFile();
        
//        System.out.println(daftar.getReadData());
//        System.out.println(daftar);
            
            XYChart.Series series1 = new XYChart.Series();
            Iterator<DataAduan> itr;
//            System.out.println(daftar.getArray());
            daftar.setFromArray(daftar.getArray());
//            ArrayList<DataAduan> arrayList = new ArrayList<DataAduan>(Arrays.asList(daftar.getArray()));
//            ArrayList<DataAduan> arrayList = new ArrayList<DataAduan>(Arrays.asList(getArray()));
//            List<DataAduan> arrayList = Arrays.asList(daftar.getArray());
            
            List<DataAduan> data = new ArrayList();
            data = daftar.getReadData();
//            List<DataAduanProperty> dataP= new ArrayList();
//            DataAduan[] data1 = data.toArray(new DataAduan[data.size()]); 
//            data = arrayList;
//            System.out.println(data);
            itr = data.iterator();
            int dp, kpk, dpu, bpom, kdiy;
            dp=0;
            kpk=0;
            dpu=0;
            bpom=0;
            kdiy=0;
            System.out.println(da.getJudul());
//           for(DataAduan da2 : daftar.getArray()) {
//               
//               if     (da2.getInstansi().equals(da2.getA())) dp++;
//                else if(da2.getInstansi().equals(da2.getB())) kpk++;
//                else if(da2.getInstansi().equals(da2.getC())) dpu++;
//                else if(da2.getInstansi().equals(da2.getD())) bpom++;
//                else if(da2.getInstansi().equals(da2.getE())) kdiy++;
//           }
//            String nama = mhs.getNamaMahasiswa();
//            Float ipk = mhs.getIpkMahasiswa();
//            if( ipk >= 1.0 && ipk <= 1.5 ) {
//                rangeOne++;
//            } else if(ipk >= 1.6 && ipk <= 2.0) {
//                rangeTwo++;
//            } else if( ipk >= 2.1 && ipk <= 2.5 ) {
//                rangeThree++;
//            } else if( ipk >= 2.6 && ipk <= 3.0) {
//                rangeFour++;
//            } else if( ipk >= 3.1 && ipk <= 3.5) {
//                rangeFive++;
//            } else if(ipk >= 3.6 && ipk <= 4.0) {
//                rangeSix++;
//            }
//        }
            while(itr.hasNext() == true){
            DataAduan da1 = itr.next();
                System.out.println(da1.getA());
                if     (da1.getInstansi().equals(da1.getA())) dp++;
                else if(da1.getInstansi().equals(da1.getB())) kpk++;
                else if(da1.getInstansi().equals(da1.getC())) dpu++;
                else if(da1.getInstansi().equals(da1.getD())) bpom++;
                else if(da1.getInstansi().equals(da1.getE())) kdiy++;
                
            }
XYChart.Series se1 = new XYChart.Series<>();
        se1.getData().add(new XYChart.Data("DP", dp));
        se1.getData().add(new XYChart.Data("KPK", kpk));
        se1.getData().add(new XYChart.Data("DPU", dpu));
        se1.getData().add(new XYChart.Data("BPOMn", bpom));
        se1.getData().add(new XYChart.Data("KDIY", kdiy));
    
    barChart.getData().addAll(se1);
    if(dp>kpk&&dp>dpu&&dp>bpom&&dp>kdiy){
        modus.setText("Dinas Pariwisata DIY");
    } else if(kpk>dp&&kpk>dpu&&kpk>bpom&&kpk>kdiy){
        modus.setText("Komisi Pemberantasan Korupsi");
    } else if(dpu>dp&&dpu>kpk&&dpu>bpom&&dpu>kdiy){
        modus.setText("Dinas Pekerjaan Umum DIY");
    } else if(bpom>dp&&bpom>kpk&&bpom>kpk&&bpom>kdiy){
        modus.setText("Badan Pengawas Obat dan Makanan");
    } else if(bpom>dp&&bpom>kpk&&bpom>kpk&&bpom>kdiy){
        modus.setText("Dinas Pekerjaan Umum DIY");
    }
    int tot = dp+kpk+dpu+bpom+kdiy;
    String tots = new Integer(tot).toString();
    total.setText(tots);
    }       
    
    public void loadStatistik() {
//        MahasiswaList mahasiswa = new MahasiswaList();
//
//        mahasiswa.loadXMLFile();
//        int rangeOne = 0;
//        int rangeTwo = 0;
//        int rangeThree = 0;
//        int rangeFour = 0;
//        int rangeFive = 0;
//        int rangeSix = 0;
//        for(Mahasiswa mhs : mahasiswa.get()) {
//            String nama = mhs.getNamaMahasiswa();
//            Float ipk = mhs.getIpkMahasiswa();
//            if( ipk >= 1.0 && ipk <= 1.5 ) {
//                rangeOne++;
//            } else if(ipk >= 1.6 && ipk <= 2.0) {
//                rangeTwo++;
//            } else if( ipk >= 2.1 && ipk <= 2.5 ) {
//                rangeThree++;
//            } else if( ipk >= 2.6 && ipk <= 3.0) {
//                rangeFour++;
//            } else if( ipk >= 3.1 && ipk <= 3.5) {
//                rangeFive++;
//            } else if(ipk >= 3.6 && ipk <= 4.0) {
//                rangeSix++;
//            }
//        }
//
//        xAxis.setLabel("Range Nilai");
//
//        XYChart.Series<String, Integer> series = new XYChart.Series<>();
//        series.setName("IPK");
//
//        series.getData().add(new XYChart.Data("1.0 - 1.5", rangeOne));
//        series.getData().add(new XYChart.Data("1.6 - 2.0", rangeTwo));
//        series.getData().add(new XYChart.Data("2.1 - 2.5", rangeThree));
//        series.getData().add(new XYChart.Data("2.6 - 3.0", rangeFour));
//        series.getData().add(new XYChart.Data("3.1 - 3.5", rangeFive));
//        series.getData().add(new XYChart.Data("3.6 - 4.0", rangeSix));
//
//        barChart.getData().add(series);
//
//        float nilaiTengah1 = (1.0f + 1.5f) / 2;
//        float nilaiTengah2 = (1.6f + 2.0f) / 2;
//        float nilaiTengah3 = (2.1f + 2.5f) / 2;
//        float nilaiTengah4 = (2.6f + 3.0f) / 2;
//        float nilaiTengah5 = (3.1f + 3.5f) / 2;
//        float nilaiTengah6 = (3.6f + 4.0f) / 2;
//
//        float meanTot = ((rangeOne * nilaiTengah1) + (rangeTwo * nilaiTengah2) + (rangeThree * nilaiTengah3) + (rangeFour * nilaiTengah4) + (rangeFive *nilaiTengah5) + (rangeSix * nilaiTengah6)) / (rangeOne + rangeTwo + rangeThree + rangeFour + rangeFive + rangeSix);
//
//        mean.setText(Float.toString(meanTot));
//            DataAduan da = new DataAduan();
//            
//            DataAduanProperty dap = new DataAduanProperty();
//            daftar.getReadData();
//            BarChart barChart = new BarChart(xAxis,yAxis);
//            XYChart.Series series1 = new XYChart.Series();
//            Iterator<DataAduan> itr;
//            List<DataAduan> data = new ArrayList();
//            List<DataAduanProperty> dataP= new ArrayList();
//            data = (daftar.getReadData());
//            itr = data.iterator();
//            
//            while(itr.hasNext() == true){
//            DataAduan da1 = itr.next();
//            series1.getData().add(new XYChart.Data(dap.getInstansi(),1));
//            }
//            
//            barChart.getData().add(series1);

//           BarChart barChart = new BarChart(xAxis,yAxis);
//            XYChart.Series dataSeries1 = new XYChart.Series();
//            dataSeries1.setName("2014");
//
//            dataSeries1.getData().add(new XYChart.Data("Desktop", 178));
//            dataSeries1.getData().add(new XYChart.Data("Phone"  , 65));
//            dataSeries1.getData().add(new XYChart.Data("Tablet"  , 23));
//
//
//            barChart.getData().add(dataSeries1);
        
          
    
   
//    @FXML
//    public void loadDataPembayaran(){
        //        PembayaranList daftar = new PembayaranList();
//        Pembayaran pemb;
//        daftar.loadXMLFile();
//        paneView.getChildren().clear();
//        xAxis = new CategoryAxis();
//        NumberAxis yAxis = new NumberAxis();
//        Map<String, Integer> hitungNama = new HashMap<>();
//        for(Pembayaran pp : daftar.get()){
//            String nama = pp.getWakaf().getJenisWakaf();
////            Integer jumlah = hitungNama.get(nama);
////            if(jumlah == null) jumlah = 0;
////            hitungNama.put(nama, jumlah+1);
////        }
////        
////        BarChart barChart = new BarChart(xAxis,yAxis);
////        XYChart.Series<String, Integer> series = new XYChart.Series<>();
////        for(Pembayaran pp: daftar.get()){
////            String wakaf = pp.getWakaf().getJenisWakaf();
////            series.getData().add(new XYChart.Data<>(wakaf, hitungNama.get(wakaf)));
////        }                
////        
////        barChart.getData().add(series);
////        paneView.getChildren().add(barChart);
////        jenisWakaf.setCellValueFactory(cellData -> cellData.getValue().wakafProperty());
//
//          
////           xAxis = new CategoryAxis(); 
////           NumberAxis yAxis= new NumberAxis();
////           Map<String, Integer> hitungNama = new HashMap<>();
////           for(){
////               
////           }
////            DataAduanList daftar = new DataAduanList();
//            DataAduan da = new DataAduan();
//            
//            DataAduanProperty dap = new DataAduanProperty();
//            daftar.getReadData();
//            BarChart barChart = new BarChart(xAxis,yAxis);
//            XYChart.Series series1 = new XYChart.Series();
//            Iterator<DataAduan> itr;
//            List<DataAduan> data = new ArrayList();
//            List<DataAduanProperty> dataP= new ArrayList();
//            data = (daftar.getReadData());
//            itr = data.iterator();
//            
//            while(itr.hasNext() == true){
//            DataAduan da1 = itr.next();
//            series1.getData().add(new XYChart.Data(dap.getInstansi(),1));
//            }
//            BarChart barChart = new BarChart(xAxis,yAxis);
//            XYChart.Series dataSeries1 = new XYChart.Series();
//            dataSeries1.setName("2014");
//
//            dataSeries1.getData().add(new XYChart.Data("Desktop", 178));
//            dataSeries1.getData().add(new XYChart.Data("Phone"  , 65));
//            dataSeries1.getData().add(new XYChart.Data("Tablet"  , 23));
//

//            barChart.getData().add(dataSeries1);
////            series1.getData().add(new XYChart.Data("b",2));
////            
////            series1.getData().add(new XYChart.Data("f",3));
////            
////            series1.getData().add(new XYChart.Data("e",4));
////            
////            series1.getData().add(new XYChart.Data("d",5));
////            
////            series1.getData().add(new XYChart.Data("c",6));
//            
//            

    }
    
//    @FXML
//    public void meanResult(){
////        PembayaranList daftar = new PembayaranList();
////        daftar.loadXMLFile();
////        Map<String, Integer> hitungNama = new HashMap<>();
////        for(Pembayaran pp : daftar.get()){
////            String nama = pp.getJamaah().getNamaJamaah();
////            Integer jumlah = hitungNama.get(nama);
////            if(jumlah == null) jumlah = 0;
////            hitungNama.put(nama, jumlah+1);
////        }
////        
////        int totalNama = 0;
////        for(Pembayaran p :daftar.get()){
////            String nama = p.getJamaah().getNamaJamaah();
////            totalNama += hitungNama.get(nama);
////        }
////        
////        Map<String, Integer> hitungWakaf = new HashMap<>();
////        for(Pembayaran bayar: daftar.get()){
////            String jWakaf = bayar.getWakaf().getJenisWakaf();
////            Integer jml = hitungWakaf.get(jWakaf);
////            if(jml == null) jml = 0;
////            hitungWakaf.put(jWakaf, jml+1);
////        }
////        
////        int totalWakaf = 0;
////        for(Pembayaran byr : daftar.get()){
////            String wakafj = byr.getWakaf().getJenisWakaf();
////            totalWakaf += hitungWakaf.get(wakafj);
////        }
////        double rataRata = (double) totalNama/hitungWakaf.size();
////        meanLabel.setText(Double.toString(rataRata));
//    }
//    
//    @FXML
//    public void modusResult(){
////        PembayaranList daftar = new PembayaranList();
////        daftar.loadXMLFile();
////        Map<String, Integer> hitungWakaf = new HashMap<>();
////        for(Pembayaran bayar: daftar.get()){
////            String jWakaf = bayar.getWakaf().getJenisWakaf();
////            Integer jml = hitungWakaf.get(jWakaf);
////            if(jml == null) jml = 0;
////            hitungWakaf.put(jWakaf, jml+1);
////        }
        
//}

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
    public void kembali(ActionEvent event) throws IOException {
        Parent beranda = FXMLLoader.load(getClass().getResource("/view/Pariwisata.fxml"));
                Scene scene = new Scene(beranda);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    public void instansiPemerintahan(ActionEvent event) throws IOException {
        Parent instansiPemerintahan = FXMLLoader.load(getClass().getResource("/view/InstansiPemerintahan.fxml"));
                Scene scene = new Scene(instansiPemerintahan);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
    }
    
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
    
}