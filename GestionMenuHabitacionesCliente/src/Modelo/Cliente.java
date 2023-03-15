package Modelo;

import java.io.Serializable;

/**
 *
 * @author Jose Vicente Alvarez
 */
public class Cliente implements Serializable{
    private String nombre;
    
    public Cliente(String nombre){
        this.nombre=nombre;
    }
    
    public String infoCliente(){
        return nombre;
    }
    
    public boolean equals(Cliente c){
        return nombre.equals(c.infoCliente());
    }
}
