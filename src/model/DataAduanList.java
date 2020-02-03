package model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DataAduanList {

    private ObservableList<DataAduanProperty> list;
    private String extFile;
    
    public DataAduanList() {
        list = FXCollections.observableArrayList();
        extFile = "dataAduanAR.xml";
    }
    
    public ObservableList<DataAduanProperty> get() {
        return list;
    }
    
    
    public void saveData(){
        List<DataAduan> data= new ArrayList();
        XStream xstream = new XStream(new StaxDriver());
        
        String xml = xstream.toXML(data);

        FileOutputStream coba = null;
           try {
            coba = new FileOutputStream("dataAduan.xml");
            byte[] bytes = xml.getBytes("UTF-8");
           coba.write(bytes);
            coba.close();
         } catch (Exception e){
             System.err.println("Perhatian: "+e.getMessage());
         }
    }
    
    public void readData(){
        List<DataAduan> data= new ArrayList();
        
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream cobi = null;
        try {
            cobi = new FileInputStream("dataAduan.xml");

            int isi;
            char charnya;
            String stringnya;

            stringnya ="";
            while ((isi = cobi.read()) != -1) {
                charnya= (char) isi;
                stringnya = stringnya + charnya;
            }    

          data = (List<DataAduan>) xstream.fromXML(stringnya);
          //this.setFromArray(data);
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
    
    public void addData(String judul, String instansiTujuan, String deskripsi){
        readData();
        loadXMLFile();
        ArrayList<DataAduan> arrayList = new ArrayList<DataAduan>(Arrays.asList(getArray()));
        List<DataAduan> data= new ArrayList();
        data = arrayList;
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream cobi = null;
        try {
            cobi = new FileInputStream("dataAduan.xml");

            int isi;
            char charnya;
            String stringnya;

            stringnya ="";
            while ((isi = cobi.read()) != -1) {
                charnya= (char) isi;
                stringnya = stringnya + charnya;
            }    

          data = (List<DataAduan>) xstream.fromXML(stringnya);
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
     
        data.add(new DataAduan(judul, instansiTujuan, deskripsi));
        DataAduan[] array = data.toArray(new DataAduan[data.size()]);  

        for(int i = 0; i < list.size(); i++) {
            String judulA = list.get(i).getJudul();
            String instansiA = list.get(i).getInstansi();
            String deskripsiA = list.get(i).getDeskripsi();
            array[i] = new DataAduan(judulA, instansiA, deskripsiA);
        }
        
        XStream xs = new XStream(new StaxDriver());
        String xml1 = xs.toXML(array);

        try{
            FileOutputStream output = new FileOutputStream(extFile);
            byte[] bytes = xml1.getBytes();
            output.write(bytes);
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        String xml = xstream.toXML(data);
        FileOutputStream coba = null;
        try {
        coba = new FileOutputStream("dataAduan.xml");
        byte[] bytes = xml.getBytes("UTF-8");
        coba.write(bytes);
        coba.flush();
        coba.close();
         } catch (Exception e){
               System.err.println("Perhatian: "+e.getMessage());
           }

    }
    
    public List<DataAduan> getReadData(){
        ArrayList<DataAduan> arrayList = new ArrayList<DataAduan>(Arrays.asList(getArray()));
        List<DataAduan> data= new ArrayList();
        data = arrayList;
        XStream xstream = new XStream(new StaxDriver());
        FileInputStream cobi = null;
        try {
            cobi = new FileInputStream("dataAduan.xml");

            int isi;
            char charnya;
            String stringnya;

            stringnya ="";
            while ((isi = cobi.read()) != -1) {
                charnya= (char) isi;
                stringnya = stringnya + charnya;
            }    
            data = (List<DataAduan>) xstream.fromXML(stringnya);
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
    
    public void setFromArrayL(List<DataAduan> array) {
        list = FXCollections.observableArrayList();
//        Iterator<DataAduan> itr;
        DataAduanList dal = new DataAduanList();
        List<DataAduan> data = new ArrayList();
//        List<DataAduanProperty> dataP= new ArrayList();
//        data = (dal.getReadData());
//        itr = data.iterator();
//        while(itr.hasNext() == true){
//            DataAduan da = new DataAduan();
//            list.add(new DataAduanProperty(da.getJudul(), da.getInstansi(), da.getDeskripsi()));
//        }
        for(DataAduan da : array) {
            list.add(new DataAduanProperty(da.getJudul(), da.getInstansi(), da.getDeskripsi()));
        }
    }
    
    
    ///////////////////////////////GANTI ARRAAY/////////////////////////////////
    
    
    public void setFromArray(DataAduan[] array) {
        list = FXCollections.observableArrayList();
        

        for(DataAduan da : array) {
            list.add(new DataAduanProperty(da.getJudul(), da.getInstansi(), da.getDeskripsi()));
        }
    }

    public void loadXMLFile() {
        //readData();
        try {
            XStream xs = new XStream(new StaxDriver());
            FileInputStream in = new FileInputStream(extFile);
            String s = "";
            int c = in.read();
            while (c != -1) {
                s += (char) c;
                c = in.read();
            }
           
            DataAduan[] array = (DataAduan[]) xs.fromXML(s);
            this.setFromArray(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }

    public DataAduan[] getArray() {
        DataAduan[] array = new DataAduan[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String judul = list.get(i).getJudul();
            String instansi = list.get(i).getInstansi();
            String deskripsi = list.get(i).getDeskripsi();
            array[i] = new DataAduan(judul, instansi, deskripsi);
        }
        

        return array;
    }

    public void saveXMLFile() {
        readData();
        DataAduan[] array = this.getArray();
        XStream xs = new XStream(new StaxDriver());
        String xml = xs.toXML(array);
        ArrayList<DataAduan> arrayList = new ArrayList<DataAduan>(Arrays.asList(array));

        try{
            FileOutputStream output = new FileOutputStream(extFile);
            byte[] bytes = xml.getBytes();
            output.write(bytes);
            output.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        String xml1 = xs.toXML(arrayList);

        FileOutputStream coba = null;
           try {
            coba = new FileOutputStream("dataAduan.xml");
            byte[] bytes = xml.getBytes("UTF-8");
           coba.write(bytes);
            coba.close();
         } catch (Exception e){
             System.err.println("Perhatian: "+e.getMessage());
         }
        
        
    }
    

    

}


