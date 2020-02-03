package controller;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileOutputStream;
import model.DataPengguna;
import model.DataPenggunaList;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;

import java.lang.reflect.Array;
import java.util.Arrays;
import model.DataAduan;


public class LoginController implements Initializable {
    
    
    @FXML
    private TextField uName = new TextField();
    
    @FXML
    private PasswordField pass = new PasswordField();
    
    @FXML
    private TextField uName1 = new TextField();
    
    @FXML
    private TextField nama = new TextField();
    
    @FXML
    private PasswordField pass1 = new PasswordField();
    
    @FXML
    private Label text = new Label();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    public void loginButton(ActionEvent event) throws IOException {
        Parent login = FXMLLoader.load(getClass().getResource("/view/Beranda.fxml"));
        Iterator<DataPengguna> itr;
        DataPengguna dp = new DataPengguna();
        DataPenggunaList dpl = new DataPenggunaList();
        List<DataPengguna> data= new ArrayList();
//        data.add(new DataPengguna(uName.getText(), pass.getText()));
        System.out.println(uName.getText());
        dpl.getReadData();
        data = (dpl.getReadData());
        itr = data.iterator();

        while(itr.hasNext() == true){
            DataPengguna dp1 = itr.next();
            if(uName.getText().equals(dp1.getUserName()) && pass.getText().equals(dp1.getPassword())){
                //DataAduan[] array = this.getArray();
        XStream xs = new XStream(new StaxDriver());
//        String xml = xs.toXML(array);
//        ArrayList<DataAduan> arrayList = new ArrayList<DataAduan>(Arrays.asList(array));

        try{
            FileOutputStream output = new FileOutputStream("Akun.xml");
           // byte[] bytes = xml.getBytes();
            //output.write(bytes);
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
       // String xml1 = xs.toXML(arrayList);

        FileOutputStream coba = null;
           try {
            coba = new FileOutputStream("dataAduan.xml");
           // byte[] bytes = xml.getBytes("UTF-8");
           //coba.write(bytes);
            coba.close();
         } catch (Exception e){
             System.err.println("Perhatian: "+e.getMessage());
         }
                
                Scene scene = new Scene(login);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.initModality(Modality.APPLICATION_MODAL);
                window.initStyle(StageStyle.UNDECORATED);
                window.show();
        }
    }
    }
      
    @FXML
    public void signUpButton(ActionEvent event) throws IOException{
        DataPengguna dp = new DataPengguna();
        DataPenggunaList dpl = new DataPenggunaList();
        dp.setUserName(uName1.getText());
        dp.setPassword(pass1.getText());
        dpl.addData(uName1.getText(), pass1.getText());
        
        text.setText("Akun anda berhasil terdaftar!");
    }
     
}
