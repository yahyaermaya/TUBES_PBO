package tubes_pbo;

public class Perusahaan extends Orang {
    private Lowongan lowongan = new Lowongan();
    private int jumlahLowongan;
    
    public Perusahaan(String nama) {
        super(nama);
    }

    public void setLowongan(Lowongan lowongan) {
        this.lowongan = lowongan;
    }
    
    public Lowongan getLowongan() {
        return lowongan;
    }
}
