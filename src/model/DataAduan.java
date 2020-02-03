package model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataAduan {
    private String judul;
    private String instansi;
    private String deskripsi;

    
    
    
    
    public DataAduan(String judul, String instansi, String deskripsi) {
        this.judul = judul;
        this.instansi = instansi;
        this.deskripsi = deskripsi;
    }
    
    public String getA(){
        String a = "Dinas Pariwisata DIY";
        return a;
    }
    
    public String getB(){
        String b = "Komisi Pemberantasan Korupsi";
        return b;
    }
    
    public String getC(){
        String c = "Dinas Pekerjaan Umum DIY";
        return c;
    }
    
    public String getD(){
        String d = "Badan Pengawas Obat dan Makanan";
        return d;
    }
    
    public String getE(){
        String e = "Kepolisian DIY";
        return e;
    }
    
    public DataAduan() {}
            
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
        
    
    
}
