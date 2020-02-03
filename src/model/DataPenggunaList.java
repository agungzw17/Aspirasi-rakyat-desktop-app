package model;

import model.DataPengguna;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataPenggunaList {
    
    private String nama;
    private String uName;
    private String password;
    private String email;
    private String alamat;

    
    public DataPenggunaList(String uName, String password) {
        this.uName = uName;
        this.password = password;  
    }

    public DataPenggunaList() {}
    
    public void saveData(){
        List<DataPengguna> data= new ArrayList();
        XStream xstream = new XStream(new StaxDriver());
        String xml = xstream.toXML(data);
        FileOutputStream coba = null;
           try {
            coba = new FileOutputStream("dataPengguna.xml");
            byte[] bytes = xml.getBytes("UTF-8");
           coba.write(bytes);
            coba.close();
         } catch (Exception e){
             System.err.println("Perhatian: "+e.getMessage());
         }
    }
    
    public void readData(){
      List<DataPengguna> data= new ArrayList();
      XStream xstream = new XStream(new StaxDriver());
      FileInputStream cobi = null;
      try {
          cobi = new FileInputStream("dataPengguna.xml");
          int isi;
          char charnya;
          String stringnya;
          stringnya ="";
          while ((isi = cobi.read()) != -1) {
              charnya= (char) isi;
              stringnya = stringnya + charnya;
          }    
        data = (List<DataPengguna>) xstream.fromXML(stringnya);
      }
      catch (Exception e){
          System.err.println("test: "+e.getMessage());
      }
      finally{
        if(cobi == null){
            try{
                cobi.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }      
      }
    }
    
    public  void addData(String uName1, String pass1){
        readData();
        List<DataPengguna> data= new ArrayList();
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream cobi = null;
        try {
            cobi = new FileInputStream("dataPengguna.xml");

            int isi;
            char charnya;
            String stringnya;

            stringnya ="";
            while ((isi = cobi.read()) != -1) {
                charnya= (char) isi;
                stringnya = stringnya + charnya;
            }    

          data = (List<DataPengguna>) xstream.fromXML(stringnya);
        }
        catch (Exception e){
            System.err.println("test: "+e.getMessage());
        }
        finally{
          if(cobi == null){
              try{
                  cobi.close();
              }catch (IOException e) {
                  e.printStackTrace();
              }
          }      
        }
        data.add(new DataPengguna(uName1, pass1));
        String xml = xstream.toXML(data);

        FileOutputStream coba = null;
        try {
        coba = new FileOutputStream("dataPengguna.xml");
        byte[] bytes = xml.getBytes("UTF-8");
        coba.write(bytes);
        coba.close();
         } catch (Exception e){
               System.err.println("Perhatian: "+e.getMessage());
           }
    }
    
    public List<DataPengguna> getReadData(){
      List<DataPengguna> data= new ArrayList();
      XStream xstream = new XStream(new StaxDriver());
      FileInputStream cobi = null;
      try {
          cobi = new FileInputStream("dataPengguna.xml");
          
          int isi;
          char charnya;
          String stringnya;

          stringnya ="";
          while ((isi = cobi.read()) != -1) {
              charnya= (char) isi;
              stringnya = stringnya + charnya;
          }    
        data = (List<DataPengguna>) xstream.fromXML(stringnya);      
      }
      catch (Exception e){
          System.err.println("test: "+e.getMessage());
      }
      finally{
        if(cobi == null){
            try{
                cobi.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }      
      }
        return data;
    }     
}
