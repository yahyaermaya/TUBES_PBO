package tubes_pbo;

import Controller.ControllerMainMenu;

public class Driver {
    public static void main(String[] args) {
        Aplikasi app= new Aplikasi();
        ControllerMainMenu cmm = new ControllerMainMenu(app);
    }
}
