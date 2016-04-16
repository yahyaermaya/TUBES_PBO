/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import view.BuatLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tubes_pbo.Aplikasi;
import tubes_pbo.Lowongan;

/**
 *
 * @author Mendex
 */
public class ControllerBuatLowongan implements ActionListener{
    BuatLowongan tl;
    Aplikasi app;
    
    public ControllerBuatLowongan(Aplikasi ap){
        this.app = ap;
        this.tl = new BuatLowongan();
        this.tl.setVisible(true);
        
        this.tl.getBtnHalAwal().addActionListener(this);
        this.tl.getBtnBuatLowongan().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object x = ae.getSource();
        if(x.equals(tl.getBtnBuatLowongan())){
            String namaLowongan = tl.getNamaLowongan().getText();
            app.getPer(0).setLowongan(new Lowongan(namaLowongan));
            JOptionPane.showMessageDialog(null, "BERHASIL!");
        }
        else if(x.equals(tl.getBtnHalAwal())){
            ControllerMainMenu cp = new ControllerMainMenu(app);
        }
    }
    
}
