package Modelo;

public class Certificado extends Servicios{
    public Certificado(Envio e){
        super(e);
    }
    public double getCoste(){
        return (10.0+ super.getCoste());
    }
    
    public String infoEnvio() { 
        return super.infoEnvio() + " certificado, "; }
}
