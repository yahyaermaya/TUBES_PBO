package tubes_pbo;

public class Perusahaan extends Orang {
    private Lowongan[] lowongan;
    private int jumlahLowongan;
    
    public Perusahaan(String nama) {
        super(nama);
    }
    
    public void setLowongan(Lowongan lowongan) {
        this.lowongan[jumlahLowongan] = lowongan;
    }
    
    public Lowongan getLowongan(int n) {
        return lowongan[n];
    }
}
