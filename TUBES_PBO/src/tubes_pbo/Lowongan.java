package tubes_pbo;

public class Lowongan {
    private String namaLowongan;
    private String[] syarat;
    private int jumlahSyarat;
    
    public Lowongan(String namaLowongan){
        this.namaLowongan = namaLowongan;
    }

    public Lowongan() {
        
    }
    
    public void setNamaLowongan(String namaLowongan){
        this.namaLowongan = namaLowongan;
     
    }
    
    public String getNamaLowongan(){
        return this.namaLowongan;
    }
    
    public void addSyarat(String syarat){
        this.syarat[jumlahSyarat] = syarat;
        jumlahSyarat++;
    }
    
    public String[] getSyarat(){
        return syarat;
    }
    
    public int getJumlahSyarat(){
        return this.jumlahSyarat;
    }
    
}