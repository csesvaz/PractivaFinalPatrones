package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class GestionEnvio implements Serializable {
	ArrayList<Envio> lista = new ArrayList<Envio>();

	public GestionEnvio() {
		lista = new ArrayList<Envio>();
	}

	public String agregarID() {
		String sid = "" + (lista.size() + 1);
		while (sid.length() < 8) {
			sid = "0" + sid;
		}
		return sid;
	}

	public void agregar(Envio e) {
		lista.add(e);
	}
	
	public double calcularIngresos() {
		double sumador=0;
		for (Envio e : lista) {
			sumador=e.getCoste();
		}
		return sumador;
	}
	public void mostrarEnvios() {
		for (Envio e : lista) {
			System.out.println(e.infoEnvio());
		}
	}
	
}
