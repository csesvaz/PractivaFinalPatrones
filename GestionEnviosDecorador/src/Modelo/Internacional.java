package Modelo;

import java.time.LocalDate;

public class Internacional extends Envio{
    private double peso;
    public Internacional(String numero, double coste, LocalDate fecha, double peso){
        super(numero, coste, fecha);
        this.peso=peso;
    }
    
    public double getCoste(){
        double aux=super.getCoste();
        if (peso>2) aux=aux+10;
        return aux;
    }
    public String infoEnvio(){
        return super.infoEnvio()+" envío internacional, ";
    }
}
