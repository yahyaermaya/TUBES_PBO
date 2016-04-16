package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes_pbo.Aplikasi;
import view.HalAwalPerusahaan;

public class ControllerHalAwalPerusahaan implements ActionListener{
    
   
    HalAwalPerusahaan p;
    Aplikasi app;
    
    public ControllerHalAwalPerusahaan(Aplikasi ap){
        this.p = new HalAwalPerusahaan();
        this.p.setVisible(true);
        this.app = ap;
        this.p.getBtnTambahPerusahaan().addActionListener(this);
        this.p.getBtnBuatLowongan().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(p.getBtnTambahPerusahaan())){
            this.p.setVisible(false);
            ControllerTambahPerusahaan cp = new ControllerTambahPerusahaan(app);
        }
        
        else if(x.equals(p.getBtnBuatLowongan())){
            this.p.setVisible(false);
            ControllerBuatLowongan ctl = new ControllerBuatLowongan(app);
        }
    }
    
    
    
}
