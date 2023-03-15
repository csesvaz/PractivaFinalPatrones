package Menus;

import Modelo.GestionEnvio;

public abstract class Menu {
    private GestionEnvio ge;
    
    public Menu(GestionEnvio ge){
        this.ge=ge;
    }
    
    public GestionEnvio getGestionEnvio(){
        return ge;
    }
    public void  ejecutar(){
        String respuesta="";
        do{  
            respuesta= ejecutarOpciones();
        }while(respuesta.equals("s"));
    }
    public abstract String ejecutarOpciones();
}
