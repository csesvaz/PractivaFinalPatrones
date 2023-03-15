package Menus;

import EntradaSalida.MyInput;
import Modelo.Balneario;
import Modelo.Habitacion;

public class MenuGestionHabitacion extends Menu{
    
    public MenuGestionHabitacion(Balneario balneario){
        super(balneario);
    }
    
    public void darAltaHabitacion(){
     System.out.println("Introduzca el número de la habitación");
     String numero=MyInput.readString();
     boolean verificacion=getBalneario().darAltaHabitacion(new Habitacion(numero));
     if (verificacion)
        System.out.println("Se dió de alta la habitacion");
     else
        System.out.println("No se dió de alta la habitacion porque ya existía"); 
    } 
     
    public String ejecutarOpciones(){
        System.out.println("");
        System.out.println("Menú Gestion habitaciones.");
        System.out.println("seleccione una opción:");
        System.out.println("0. Volver al menu principal");
        System.out.println("1. Dar de alta una nueva habitación");
        System.out.println("2. Mostrar todas las habitaciones");
        String s=MyInput.readString();
        switch(s){
                case "0": {return "n";}
                case "1": {darAltaHabitacion();return "s";}
                case "2": {getBalneario().mostrarHabitaciones();return "s";}  
                default: {System.out.println("Opción no válida. Vuelva a intentarlo."); return "s";}
            }
    }     
}
