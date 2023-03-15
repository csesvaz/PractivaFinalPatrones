package Modelo;

public class Urgente extends Servicios{
    public Urgente(Envio e){
        super(e);
    }
    
    public double getCoste(){
        return 40+ super.getCoste();
    }
    
    public String infoEnvio(){
return super.infoEnvio() + " urgente, ";     
}
}