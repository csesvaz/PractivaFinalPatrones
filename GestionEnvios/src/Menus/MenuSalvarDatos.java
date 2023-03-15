package Menus;

import EntradaSalida.MyInput;
import Modelo.GestionEnvio;

public class MenuSalvarDatos extends Menu {

	public MenuSalvarDatos(GestionEnvio ge) {
		super(ge);
	}

	@Override
	public String ejecutarOpciones() {
		  MyInput.serialize(getGestionEnvio(), "envios.dat");
	        return "n";
	    }
	}


