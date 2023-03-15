package Modelo;

import java.time.LocalDate;

public abstract class Envio{
    private String identificador;
    private double coste;
    private LocalDate fecha;
    
    public Envio(String identificador,double coste, LocalDate fecha){
        this.identificador=identificador;
        this.coste=coste;
        this.fecha=fecha;
    }
    public String getID(){
        return identificador;
    }
    
    public double getCoste(){
        return coste;
    }
    
    public String infoEnvio(){
        return "Numero: "+identificador+", fecha: "+fecha.toString();
    }   
}