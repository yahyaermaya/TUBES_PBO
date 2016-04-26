package Controller;

import View.BuatBerkas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes_pbo.Aplikasi;
import tubes_pbo.BerkasLamaran;

public class ControllerBuatBerkas implements ActionListener{
    BuatBerkas tl;
    Aplikasi app;
    
    public ControllerBuatBerkas(Aplikasi ap){
        this.app = ap;
        this.tl = new BuatBerkas();
        this.tl.setVisible(true);
        
        this.tl.getBtnHalAwal().addActionListener(this);
        this.tl.getBtnBuatBerkas().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(tl.getBtnBuatBerkas())){
            this.tl.setVisible(false);
            String namaBerkas = tl.getNamaBerkas().getText();
            app.getPel(0).setBerkas(new BerkasLamaran(namaBerkas));
            JOptionPane.showMessageDialog(null, "BERHASIL!");
        }
        else if(x.equals(tl.getBtnHalAwal())){
            this.tl.setVisible(false);
            ControllerMainMenu cp = new ControllerMainMenu(app);
        }
    }
    
}
