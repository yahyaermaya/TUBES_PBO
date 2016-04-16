package tubes_pbo;

public class Pelamar extends Orang {
    private BerkasLamaran berkas = new BerkasLamaran();
    
    public Pelamar(String nama) {
        super(nama);
    }

    public void setBerkas(BerkasLamaran berkas) {
        this.berkas = berkas;
    }
    
    public BerkasLamaran getBerkas() {
        return berkas;
    }
}
