package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DataPenggunaProperty {
    private StringProperty nama;
    private StringProperty userName;
    private StringProperty password;

    public DataPenggunaProperty(String nama, String userName, String password) {
        this.nama = new SimpleStringProperty(nama);
        this.userName = new SimpleStringProperty(userName);
        this.password = new SimpleStringProperty(password);
    }
    
    public DataPenggunaProperty() {}

    public String getNama() {
        return this.nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getUserName() {
        return this.userName.get();
    }

    public void setUserName(String userName) {
        this.userName.set(userName);
    }

    public String getPassword() {
        return this.password.get();
    }

    public void setPasword(String password) {
        this.password.set(password);
    }
}
