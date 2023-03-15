package Principal;

import EntradaSalida.MyInput;
import Menus.MenuPrincipal;
import Modelo.GestionEnvio;

public class Principal {
	public static void main(String[] args) {
        GestionEnvio ge= MyInput.deserialize("envios.dat");
        if(ge==null) ge= new GestionEnvio();
        MenuPrincipal mp= new MenuPrincipal(ge);
        mp.ejecutar();
        MyInput.serialize(ge, "fichero.dat");
    }
}
