package Controller;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import tubes_pbo.Aplikasi;
import view.MainMenu;

public class ControllerMainMenu implements ActionListener {

    MainMenu mainmenu;
    Aplikasi app;

    public ControllerMainMenu(Aplikasi app) {
        this.mainmenu = new MainMenu();
        this.mainmenu.setVisible(true);
        this.app= app;
        this.mainmenu.getPerusahaan().addActionListener(this);
        this.mainmenu.getPelamar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        if(x.equals(mainmenu.getPerusahaan())){
            this.mainmenu.setVisible(false);
            ControllerHalAwalPerusahaan cp = new ControllerHalAwalPerusahaan(app);
            
        }

    }

}
