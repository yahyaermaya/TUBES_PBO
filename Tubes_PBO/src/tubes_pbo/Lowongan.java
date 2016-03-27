/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_pbo;

/**
 *
 * @author Fauzan Ramadhan
 */
public class Lowongan {
    public String namaLowongan;
    public String namaPerusahaan;
    public String[] syarat;
    public int jumlahSyarat;
    
    public Lowongan(String namaLowongan, String namaPerusahaan){
        this.namaLowongan = namaLowongan;
        this.namaPerusahaan = namaPerusahaan;
    }
    
    public void setNamaLowongan(String namaLowongan){
        this.namaLowongan = namaLowongan;
     
    }
    
    public String getNamaLowongan(){
        return this.namaLowongan;
    }
    
    public void setNamaPerusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }
    
    public String getNamaPerusahaan(){
        return this.namaPerusahaan;
    }
    
    public void addSyarat(String syarat){
        this.syarat[jumlahSyarat] = syarat;
        jumlahSyarat++;
    }
    
    public String[] getSyarat(){
        return syarat;
    }
    
    public void setJumlahSyarat(int jumlahSyarat){
        this.jumlahSyarat = jumlahSyarat;
    }
    
    public int getJumlahSyarat(){
        return this.jumlahSyarat;
    }
    
}