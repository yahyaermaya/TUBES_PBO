package tubes_pbo;

public class BerkasLamaran {
    private String namaBerkas;
    private String namaPelamar;
    private String[] syarat;
    private int jumlahSyarat;
    
    public BerkasLamaran(String namaBerkas, String namaPelamar){
        this.namaBerkas = namaBerkas;
        this.namaPelamar = namaPelamar;
    }
    public BerkasLamaran(String namaBerkas){
        this.namaBerkas = namaBerkas;
    }
    public BerkasLamaran(){
        
    }
    public void setNamaBerkas(String namaBerkas){
        this.namaBerkas = namaBerkas;
    }
    public String getNamaBerkas(){
        return namaBerkas;
    }
    public void setNamaPelamar(String namaPelamar){
        this.namaPelamar = namaPelamar;
    }
    public String getNamaPelamar(){
        return namaPelamar;
    }
    public void setSyarat(String syarat){
        this.syarat[jumlahSyarat] = syarat;
        jumlahSyarat++;
    }
    public String getSyarat(int n){
        return syarat[n];
    }
    public int getJumlahSyarat(int n){
        return jumlahSyarat;
    }
           
}

