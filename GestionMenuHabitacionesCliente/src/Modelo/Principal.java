package Modelo;

import EntradaSalida.MyInput;
import Menus.MenuPrincipal;

public class Principal {
	public static void main(String[] args) {
        Balneario b= MyInput.deserialize("fichero.dat");
        if(b==null) b= new Balneario();
        MenuPrincipal mp= new MenuPrincipal(b);
        mp.ejecutar();
        MyInput.serialize(b, "fichero.dat");
    }
}
