package Menus;

import EntradaSalida.MyInput;
import Modelo.Balneario;
import Modelo.Habitacion;

public class MenuGestionHabitacion extends Menu{
    
    public MenuGestionHabitacion(Balneario balneario){
        super(balneario);
    }
    
    public void darAltaHabitacion(){
     System.out.println("Introduzca el n�mero de la habitaci�n");
     String numero=MyInput.readString();
     boolean verificacion=getBalneario().darAltaHabitacion(new Habitacion(numero));
     if (verificacion)
        System.out.println("Se di� de alta la habitacion");
     else
        System.out.println("No se di� de alta la habitacion porque ya exist�a"); 
    } 
     
    public String ejecutarOpciones(){
        System.out.println("");
        System.out.println("Men� Gestion habitaciones.");
        System.out.println("seleccione una opci�n:");
        System.out.println("0. Volver al menu principal");
        System.out.println("1. Dar de alta una nueva habitaci�n");
        System.out.println("2. Mostrar todas las habitaciones");
        String s=MyInput.readString();
        switch(s){
                case "0": {return "n";}
                case "1": {darAltaHabitacion();return "s";}
                case "2": {getBalneario().mostrarHabitaciones();return "s";}  
                default: {System.out.println("Opci�n no v�lida. Vuelva a intentarlo."); return "s";}
            }
    }     
}
