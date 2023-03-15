package Menus;

import EntradaSalida.MyInput;
import Modelo.GestionEnvio;

public class MenuGestionEconomica extends Menu {

	public MenuGestionEconomica(GestionEnvio ge) {
		super(ge);
	}
	public void mostrarIngresos() {
		System.out.println("Ingresos totales de los envios= "+getGestionEnvio().calcularIngresos());
	}
	@Override
	public String ejecutarOpciones() {
		  System.out.println("");
	        System.out.println("Menú Gestion Económica.");
	        System.out.println("seleccione una opción:");
	        System.out.println("0. Volver al menu principal");
	        System.out.println("1. Mostrar ingresos totales");
	        String s=MyInput.readString();
	        switch(s){
	                case "0": {return "n";}
	                case "1": {mostrarIngresos();; return "s";} 
	                default: {System.out.println("Opción no válida. Vuelva a intentarlo."); return "s";}
	            }
	    }

}
