package Menus;

import java.util.ArrayList;

import EntradaSalida.MyInput;
import Modelo.Balneario;

public class MenuPrincipal extends Menu{
    private ArrayList<Menu> menus=new ArrayList<Menu>();
    
    public MenuPrincipal(Balneario balneario){
       super(balneario); 
       menus.add(new MenuGestionHabitacion(balneario));
       menus.add(new MenuGestionCliente(balneario));
    }
    
    public String ejecutarOpciones(){
        System.out.println("");
            System.out.println("Men� Prncipal.");
            System.out.println("seleccione una opci�n:");
            System.out.println("0. Salir del programa");
            System.out.println("1. Gestion Habitaciones");
            System.out.println("2. Gesti�n Clientes");
        String s=MyInput.readString();
        int i=0;
        try{  
               i= Integer.parseInt(s);
        }catch(NumberFormatException ex){
                  System.out.println("La entrada no tiene formato de n�mero. Int�ntelo de nuevo");
                  return "s";
               } 
        if((i>0)&&(i<=menus.size())){
                menus.get(i-1).ejecutar();
                return "s";}
        else if ((i<0)||(i>menus.size())){
                System.out.println("opci�n no v�lida. Int�ntelo de nuevo");
                return "s";}
        else                  
                return "n";
    } 

}
