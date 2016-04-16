package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tubes_pbo.Aplikasi;
import tubes_pbo.Pelamar;
import view.TambahPelamar;

public class ControllerTambahPelamar implements ActionListener {

    TambahPelamar tambahpelamar;
    Aplikasi app;
    
    public ControllerTambahPelamar(Aplikasi app) {
        this.app= app;            
        this.tambahpelamar = new TambahPelamar();
        this.tambahpelamar.setVisible(true);
        this.tambahpelamar.getTambahButton().addActionListener(this);
        this.tambahpelamar.getBackButtonMainMenu().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();

        if (x.equals(tambahpelamar.getTambahButton())) {
            String namaPelamar = tambahpelamar.getNamaPelamar().getText();
            app.setPel(new Pelamar(namaPelamar));
        } else if(x.equals(tambahpelamar.getBackButtonMainMenu())){
                this.tambahpelamar.setVisible(false);
                ControllerMainMenu cmm = new ControllerMainMenu(app);
        }
    }
}
