package Modelo;

import java.time.LocalDate;

public class Nacional extends Envio{

    public Nacional(String numero, double coste, LocalDate fecha){
        super(numero, coste, fecha);
    }
    public String infoEnvio(){
        return super.infoEnvio()+" envío nacional, ";
    }
}
