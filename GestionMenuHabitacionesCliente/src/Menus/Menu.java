package Menus;

import Modelo.Balneario;

public abstract class Menu {
    private Balneario b;
    
    public Menu(Balneario b){
        this.b=b;
    }
    
    public Balneario getBalneario(){
        return b;
    }
    public void  ejecutar(){
        String respuesta="";
        do{  
            respuesta= ejecutarOpciones();
        }while(respuesta.equals("s"));
    }
    public abstract String ejecutarOpciones();
}
