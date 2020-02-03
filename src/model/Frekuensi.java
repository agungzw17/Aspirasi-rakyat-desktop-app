/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.*;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author arap
 */
public class Frekuensi {
    private final  SimpleIntegerProperty batasAtas;
    private final  SimpleIntegerProperty batasBawah;
    private final  SimpleIntegerProperty frekuensi;
    
    public Frekuensi(int b,int a){
        batasAtas = new SimpleIntegerProperty(a);
        batasBawah = new SimpleIntegerProperty(b);
        frekuensi = new SimpleIntegerProperty(0);
    }
    public int getBatasAtas() {
        return batasAtas.get();
    }

    public void setBatasAtas(int batasAtas) {
        this.batasAtas.set(batasAtas);
    }

    public int getBatasBawah() {
        return batasBawah.get();
    }

    public void setBatasBawah(int batasBawah) {
        this.batasBawah.set (batasBawah);
    }

    public int getFrekuensi() {
        return frekuensi.get();
    }

    public void setFrekuensi(int frekuensi) {
        this.frekuensi.set (frekuensi);
    
   
    }
    public SimpleStringProperty intervalProperty() {
        String s = Integer.toString(batasBawah.get()) + " - " + Integer.toString(batasAtas.get());
        return new SimpleStringProperty(s);
    }
    
    public SimpleIntegerProperty frekuensiProperty(){
        return frekuensi;
    }
    
    
}