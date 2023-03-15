package Principal;

import java.time.LocalDate;
import java.util.ArrayList;

import EntradaSalida.MyInput;
import Modelo.Asegurado;
import Modelo.Certificado;
import Modelo.Envio;
import Modelo.Internacional;
import Modelo.Nacional;
import Modelo.Urgente;

public class Principal {

	public static Envio agregarCertificado(Envio e){
        System.out.print("¿Desea envío certificado? Responda con una \"s\" si quiere el envío con este servicio " );
        String respuesta=MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) e= new Certificado(e);           
        return e;
}  

    public static Envio agregarUrgente(Envio e){
        System.out.print("¿Desea envío urgente? Responda con una \"s\" si quiere el envío con este servicio " );
        String respuesta=MyInput.readString().toLowerCase();
        if (respuesta.equals("s")) e= new Urgente(e);           
        return e;
}  

public static Envio agregarAsegurado(Envio e){
        double valor;
        System.out.print("¿Desea envío asegurado? Responda con una \"s\" si quiere el envío con este servicio " );
        String respuesta=MyInput.readString().toLowerCase();
        if (respuesta.equals("s")){
                            System.out.print("Introduzca el valor aproximado del envío " );
                            valor=MyInput.readDouble();
        e= new Asegurado(e, valor); }          
        return e;
}

public static Envio configurarEnvio(Envio e){
    return agregarAsegurado(agregarUrgente(agregarCertificado(e)));
}


public static String generaID(ArrayList<Envio> lista){     
    int num= lista.size()+1;
    String sid= ""+num;
    while(sid.length()<8)
        sid="0"+sid;
    return sid;
}


public static void main(String[] args) {
    ArrayList<Envio> lista= new ArrayList<Envio>();
    Envio e = null; 
    int opcion;
    double coste, peso;
    String respuesta, identificador; 
    // crea objetos de tipo envío seleccionando entre las dos posibilidades y los agrega a la lista
    do{  
        //Genera de forma automática el id del envío;
        identificador=generaID(lista);
        // comprueba si existe un envio con el mismo identificador
        System.out.print("Seleccione tipo de envío: 1. Nacional, 2. Internacional. ");
        opcion=MyInput.readInt();
        System.out.print("indique el precio básico: ");
        coste=MyInput.readDouble();
        LocalDate fecha=LocalDate.now();
        switch(opcion){
                case 1:{ e= new Nacional(identificador, coste, fecha);
                         break;}
                case 2:{ System.out.print("indique el peso del envío: ");
                         peso=MyInput.readDouble();
                         e= new Internacional(identificador, coste, fecha,peso);
                        break;}
         }
        // configura el envío a través de los servicios opcionales
        e=configurarEnvio(e);
        // da de alta el nuevo envío configurado en la colección de envíos
        lista.add(e);
        System.out.print("¿Quiere seguir creando envíos?. Responda con una \"s\" si quiere continuar ");
        respuesta=MyInput.readString();
    }while(respuesta.equals("s"));
   
   //muestra todos los envíos creados hasta la fecha
   System.out.println("Listado de envíos creados:");
   for(Envio env:lista)
       System.out.println(env.infoEnvio()+" Precio total: "+env.getCoste()); 
   
   //muestra los ingresos totales obtenidos por todos los envío creados hasta la fecha
    System.out.print("Ingresos totales obtenidos por los envíos creados: ");
    double sumador=0;
    for(Envio env:lista)
       sumador=sumador+env.getCoste();
    System.out.println(sumador+ "euros");
}

}
