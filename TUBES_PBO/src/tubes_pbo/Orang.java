package tubes_pbo;

public class Orang {
    private String nama;
    private String username;
    private String password;
    
    public Orang(String nama) {
        this.nama = nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public int login(String username, String password) {
        if(username == this.username && password == this.password) {
            System.out.println("Login berhasil");
            return 1;
        } else {
            System.out.println("Username atau Password salah");
            return 0;
        }
    }
}