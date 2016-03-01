package tubes_pbo;

public class Pelamar extends Orang {
    private Berkas[] berkas;
    
    public Pelamar(String nama) {
        super(nama);
    }
    
    public void setBerkas(Berkas berkas) {
        this.berkas = berkas;
    }
    
    public Berkas getBerkas() {
        return berkas;
    }
}
