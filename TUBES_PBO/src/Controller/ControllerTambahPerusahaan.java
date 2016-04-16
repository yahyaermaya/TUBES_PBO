package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes_pbo.Aplikasi;
import tubes_pbo.Perusahaan;
import view.TambahPerusahaan;
import javax.swing.JOptionPane;

public class ControllerTambahPerusahaan implements ActionListener {

    TambahPerusahaan tambahperusahaan;
    Aplikasi app;
    
    public ControllerTambahPerusahaan(Aplikasi app) {
        this.app= app;            
        this.tambahperusahaan = new TambahPerusahaan();
        this.tambahperusahaan.setVisible(true);
        this.tambahperusahaan.getTambahButton().addActionListener(this);
        this.tambahperusahaan.getBackButtonMainMenu().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();

        if (x.equals(tambahperusahaan.getTambahButton())) {
            String namaPerusahaan = tambahperusahaan.getNamaPerusahaan().getText();
            app.setPer(new Perusahaan(namaPerusahaan));
        } else if(x.equals(tambahperusahaan.getBackButtonMainMenu())){
                this.tambahperusahaan.setVisible(false);
                ControllerMainMenu cmm = new ControllerMainMenu(app);
        }
    }
}
