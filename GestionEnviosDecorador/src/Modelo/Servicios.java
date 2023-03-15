package Modelo;

public class Servicios extends Envio{
    
    private Envio e;
    public Servicios(Envio e){
        super(" ",0.0, null);
        this.e=e;
    }
    
    public double getCoste(){
        return e.getCoste();
    }
    public String infoEnvio() { 
        return e.infoEnvio(); }
}
