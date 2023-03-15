package Modelo;

import java.io.Serializable;

/**
 *
 * @author Jose Vicente Alvarez
 */
public class Habitacion implements Serializable{
    private String nombre;
    
    public Habitacion (String nombre){
        this.nombre=nombre;
    }
    
    public String infoHabitacion(){
        return nombre;
    }
    
    public boolean equals(Habitacion habitacion){
        return this.nombre.equals(habitacion.infoHabitacion());
    }
}