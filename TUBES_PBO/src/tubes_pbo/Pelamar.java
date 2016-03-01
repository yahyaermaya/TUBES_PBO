package tubes_pbo;

public class Pelamar extends Orang {
    private BerkasLamaran[] berkas;
    private int jumlahBerkas;
    
    public Pelamar(String nama) {
        super(nama);
    }
    
    public void setBerkas(BerkasLamaran berkas) {
        this.berkas[jumlahBerkas] = berkas;
    }
    
    public BerkasLamaran getBerkas(int n) {
        return berkas[n];
    }
}
