package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jose Vicente Alvarez
 */
public class Balneario implements Serializable{
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Cliente> clientes;
    
    public Balneario(){
      habitaciones=new ArrayList<Habitacion>(); 
      clientes=new ArrayList<Cliente>();
    }
    public boolean darAltaHabitacion(Habitacion hab){
        for(Habitacion h:habitaciones){
            if(h.equals(hab))
                return false;}
        habitaciones.add(hab);
        return true;}
    
    public void mostrarHabitaciones(){
        for(Habitacion h:habitaciones){
            System.out.println("Habitacion: "+h.infoHabitacion());
        }
    }
    
    public boolean darAltaCliente(Cliente cl){
        for(Cliente c:clientes){
            if(c.equals(cl))
                return false;}
        clientes.add(cl);
        return true;}
    
    public void mostrarClientes(){
        for(Cliente c:clientes){
            System.out.println("Cliente: "+c.infoCliente());
        }
    }
    
}
