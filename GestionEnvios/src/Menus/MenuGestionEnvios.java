package Menus;

import java.time.LocalDate;

import EntradaSalida.MyInput;
import Modelo.Asegurado;
import Modelo.Certificado;
import Modelo.Envio;
import Modelo.GestionEnvio;
import Modelo.Internacional;
import Modelo.Nacional;
import Modelo.Urgente;

public class MenuGestionEnvios extends Menu {

	public MenuGestionEnvios(GestionEnvio ge) {
		super(ge);
	}public static Envio agregarCertificado(Envio e){
        System.out.print("¿Desea envío certificado? Responda con una \"s\" si quiere el envío con este servicio " );
        String respuesta=MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) e= new Certificado(e);           
        return e;
}  

    public static Envio agregarUrgente(Envio e){
        System.out.print("¿Desea envío urgente? Responda con una \"s\" si quiere el envío con este servicio " );
        String respuesta=MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) e= new Urgente(e);           
        return e;
}  

public static Envio agregarAsegurado(Envio e){
        double valor;
        System.out.print("¿Desea envío asegurado? Responda con una \"s\" si quiere el envío con este servicio " );
        String respuesta=MyInput.readString().toLowerCase();
        if (respuesta.equals("s")){
                            System.out.print("Introduzca el valor aproximado del envío " );
                            valor=MyInput.readDouble();
        e= new Asegurado(e, valor); }          
        return e;
}

public static Envio configurarEnvio(Envio e){
    return agregarAsegurado(agregarUrgente(agregarCertificado(e)));
}
	public void darAltaEnvios() {
		  String identificador=getGestionEnvio().agregarID();
	        // comprueba si existe un envio con el mismo identificador
	        System.out.print("Seleccione tipo de envío: 1. Nacional, 2. Internacional. ");
	        int opcion=MyInput.readInt();
	        System.out.print("indique el precio básico: ");
	        double coste=MyInput.readDouble();
	        LocalDate fecha=LocalDate.now();
	        Envio e=null;
	        switch(opcion){
	                case 1:{ e= new Nacional(identificador, coste, fecha);
	                         break;}
	                case 2:{ System.out.print("indique el peso del envío: ");
	                         double peso=MyInput.readDouble();
	                         e= new Internacional(identificador, coste, fecha,peso);
	                        break;}
	         }
	        // configura el env�o a trav�s de los servicios opcionales
	        e=configurarEnvio(e);
	        // da de alta el nuevo env�o configurado en la colecci�n de env�os
	       getGestionEnvio().agregar(e);
	}

	@Override
	public String ejecutarOpciones() {
		  System.out.println("");
	        System.out.println("Menú Gestion Envios.");
	        System.out.println("seleccione una opción:");
	        System.out.println("0. Volver al menu principal");
	        System.out.println("1. Dar de alta una nuevo envío");
	        System.out.println("2. Mostrar todos los envíos");
	        String s=MyInput.readString();
	        switch(s){
	                case "0": {return "n";}
	                case "1": {darAltaEnvios();return "s";}
	                case "2": {getGestionEnvio().mostrarEnvios();return "s";}  
	                default: {System.out.println("Opción no válida. Vuelva a intentarlo."); return "s";}
	            }
	    }

	  
	}

