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
    
    public void daftarkanPerusahaan() {
        System.out.print("Masukan Nama Perusahaan : ");
        per[nPerusahaan].setNama(s2.nextLine());
        System.out.print("Masukan alamat perusahaan : ");
        per[nPerusahaan].setAlamat(s2.nextLine());
        System.out.print("Masukan nomor telefon perusahaan : ");
        per[nPerusahaan].setNomorTelefon(s1.nextInt());
    }
    
    public void buatLowongan() {
        System.out.print("Nama pekerjaan : ");
        per[nPerusahaan].getLowongan().setNamaLowongan(s2.nextLine());
        System.out.print("Detail Pekerjaan : ");
        per[nPerusahaan].getLowongan().addSyarat(s2.nextLine());
    }
    
    public void buatBerkasLamaran() {
        System.out.print("Masukan judul");
        pel[nPelamar].getBerkas().setNamaBerkas(s2.nextLine());
        System.out.println("Masukan detail data diri ");
        System.out.print("    Nama :");
        pel[nPelamar].getBerkas().setNamaPelamar(s2.nextLine());
    }
    
    public void perusahaan() {
        System.out.println("Perusahaan");
        System.out.println("1.Daftarkan Perushaan");
	System.out.println("2.Lihat Perushaan");
        System.out.println("Masukan pilihan :");
        pil = s1.nextInt();
                switch(pil){
                    case 1 :
                        daftarkanPerusahaan();
                        break;
                    case 2 :
                        buatLowongan();
                        break;
                }
    }
    
    public void pelamar() {
        System.out.println("Pelamar");
        System.out.println("1.Cari pekerjaan berdasarkan perusahaan");
        System.out.println("2.Buat berkas lamaran");
        pil = s1.nextInt();
        switch(pil){
            case 1 :
                buatBerkasLamaran();
                break;
        }
    }
    
    public void mainMenu() {
        System.out.println("MAIN MENU");
        System.out.println("1.Perusahaan");
        System.out.println("2.Pelamar");
        System.out.println("Masukan Pilihan");
        pil = s1.nextInt();
        switch(pil) {
            case 1 :
                perusahaan();
                break;
            case 2 :
                pelamar();
                break;
        }
    }
}
