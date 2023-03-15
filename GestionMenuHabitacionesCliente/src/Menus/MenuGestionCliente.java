package Menus;

import EntradaSalida.MyInput;
import Modelo.Balneario;
import Modelo.Cliente;

public class MenuGestionCliente extends Menu{
    
    public MenuGestionCliente(Balneario balneario){
        super(balneario);
    }
    public void darAltaCliente(){
     System.out.println("Introduzca el nombre del cliente");
     String nombre=MyInput.readString();
     boolean verificacion=getBalneario().darAltaCliente(new Cliente(nombre));
     if (verificacion)
        System.out.println("Se dió de alta al cliente");
     else
        System.out.println("No se dió de alta al cliente porque ya existía"); 
    }  
    
    public String ejecutarOpciones(){
        System.out.println("");
        System.out.println("Menú Gestion habitaciones.");
        System.out.println("seleccione una opción:");
        System.out.println("0. Volver al menu principal");
        System.out.println("1. Dar de alta un nuevo cliente");
        System.out.println("2. Mostrar todos los clientes");
        String s=MyInput.readString();
        switch(s){
                case "0": {return "n";}
                case "1": {darAltaCliente();return "s";}
                case "2": {getBalneario().mostrarClientes();return "s";}  
                default: {System.out.println("Opción no válida. Vuelva a intentarlo."); return "s";}
            }
    } 
}
