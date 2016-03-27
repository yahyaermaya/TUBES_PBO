package tubes_pbo;

public class Pelamar extends Orang {
    private BerkasLamaran berkas = new BerkasLamaran();
    private int jumlahBerkas;
    
    public Pelamar(String nama) {
        super(nama);
    }
    
    public BerkasLamaran getBerkas() {
        return berkas;
    }
}
