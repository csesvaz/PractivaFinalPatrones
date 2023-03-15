package Menus;

import java.util.ArrayList;

import EntradaSalida.MyInput;
import Modelo.GestionEnvio;

public class MenuPrincipal extends Menu{
    private ArrayList<Menu> menus=new ArrayList<Menu>();
    
    public MenuPrincipal(GestionEnvio ge){
       super(ge); 
       menus.add(new MenuGestionEnvios(ge));
       menus.add(new MenuGestionEconomica(ge));
       menus.add(new MenuSalvarDatos(ge));
    }
    
    public String ejecutarOpciones(){
        System.out.println("");
            System.out.println("Menú Prncipal.");
            System.out.println("seleccione una opción");
            System.out.println("1. Gestión Envio");
            System.out.println("2. Gestión económica");
            System.out.println("3. Guardar datos");
        String s=MyInput.readString();
        int i=0;
        try{  
               i= Integer.parseInt(s);
        }catch(NumberFormatException ex){
                  System.out.println("La entrada no tiene formato de número. Inténtelo de nuevo");
                  return "s";
               } 
        if((i>0)&&(i<=menus.size())){
                menus.get(i-1).ejecutar();
                return "s";}
        else if ((i<0)||(i>menus.size())){
                System.out.println("opción no válida. Inténtelo de nuevo");
                return "s";}
        else                  
                return "n";
    } 

}
