package tubes_pbo;

import java.util.Scanner;

public class Aplikasi {
    private int pil;
    private Perusahaan[] per;
    private Pelamar[] pel;
    private int nPerusahaan;
    private int nPelamar;
    
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    
    public Aplikasi() {
        
    }

    public Perusahaan[] getListPer() {
        return per;
    }
    
    public Perusahaan getPer(int x) {
        return per[x];
    }

    public Pelamar[] getListPel() {
        return pel;
    }
    
    public Pelamar getPel(int x) {
        return pel[x];
    }

    public void setPer(Perusahaan per) {
        this.per[nPerusahaan] = per;
        nPerusahaan++;
    }

    public void setPel(Pelamar pel) {
        this.pel[nPelamar] = pel;
        nPelamar++;
    }
}
