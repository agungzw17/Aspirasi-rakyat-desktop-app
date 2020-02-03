package model;

public class DataPengguna {
    private String nama;
    private String userName;
    private String password;

    public DataPengguna(String nama, String userName, String password) {
        this.nama = nama;
        this.userName = userName;
        this.password = password;
    }
    
    public DataPengguna(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public DataPengguna() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
