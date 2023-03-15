package Modelo;

public class Asegurado extends Servicios{
    private double valor;
    public Asegurado(Envio e, double valor){
        super(e);
        this.valor=valor;
    }
    
    public double getCoste(){
        return (valor*0.01)+ super.getCoste();
    }
    
    public String infoEnvio(){
return super.infoEnvio() + " asegurado, ";     
}
}
