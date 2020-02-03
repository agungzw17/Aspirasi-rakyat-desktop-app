package model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DataAduanProperty {
    private StringProperty judul;
    private StringProperty instansi;
    private StringProperty deskripsi;

    public DataAduanProperty(String judul, String instansi, String deskripsi) {
        this.judul = new SimpleStringProperty(judul);
        this.instansi = new SimpleStringProperty(instansi);
        this.deskripsi = new SimpleStringProperty(deskripsi);
    }
    
    public DataAduanProperty() {
        this("","","");
    }
    public StringProperty judulAduan() {
        return judul;
    }
    
    public StringProperty instansiAduan() {
        return instansi;
    }
    
    public StringProperty deskripsiAduan() {
        return deskripsi;
    }

   

    public String getJudul() {
        return this.judul.get();
    }

    public void setJudul(String judul) {
        this.judul.set(judul);
    }

    public String getInstansi() {
        return this.instansi.get();
    }

    public void setInstansi(String instansi) {
        this.instansi.set(instansi);
    }

    public String getDeskripsi() {
        return this.deskripsi.get();
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi.set(deskripsi);
    }
    
    
    
}
