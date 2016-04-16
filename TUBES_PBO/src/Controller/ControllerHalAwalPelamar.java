package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes_pbo.Aplikasi;
import view.HalAwalPelamar;

public class ControllerHalAwalPelamar implements ActionListener{
    
   
    HalAwalPelamar p;
    Aplikasi app;
    
    public ControllerHalAwalPelamar(Aplikasi ap){
        this.p = new HalAwalPelamar();
        this.p.setVisible(true);
        this.app = ap;
        this.p.getBtnTambahPelamar().addActionListener(this);
        this.p.getBtnBuatBerkas().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(p.getBtnTambahPelamar())){
            this.p.setVisible(false);
            ControllerTambahPelamar cp = new ControllerTambahPelamar(app);
        }
        
        else if(x.equals(p.getBtnBuatBerkas())){
            this.p.setVisible(false);
            ControllerBuatBerkas ctl = new ControllerBuatBerkas(app);
        }
    }
}
