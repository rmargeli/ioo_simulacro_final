package ioo_simulacro_final;

import java.util.ArrayList;
import java.util.Date;

public class ControladorSistemaCarga {
	private ArrayList <Camion> camiones;
	private ArrayList <Barco> barcos;
	
	public ControladorSistemaCarga(){		
		camiones = new ArrayList <Camion>();
		barcos = new ArrayList <Barco>();
	}	
	
	public void crearBarco(String nombre, String nacionalidad, Date fecha, float capacidad){
		Barco b = buscarBarco(nombre);
		if(b == null){
			Barco bc = new Barco(nombre,nacionalidad, fecha, capacidad);
			barcos.add(bc);
		}
	}
	
	
	private Barco buscarBarco(String nombre) {
		for(int i = 0; i < barcos.size(); i++){
			Barco b = barcos.get(i);
			if(b.existeBarco(nombre))
				return b;
		}
		return null;
	}

	public void crearCamionDoble(String patente, String cereal, float carga, float porcentaje, float desperdicio){
		Camion c = buscarCamion(patente);
		if(c == null){
			CamionDoble cd = new CamionDoble(patente, cereal, carga, porcentaje, desperdicio);
			camiones.add(c);
		}		
	}
	
	public void crearCamionSimple(String patente, String cereal, float carga, float porcentaje){
		Camion c = buscarCamion(patente);
		if(c == null){
			CamionSimple cs = new CamionSimple(patente, cereal, carga, porcentaje);
			camiones.add(cs);
		}
	}

	private Camion buscarCamion(String patente) {
		for(int i = 0; i < camiones.size(); i++){
			Camion c = camiones.get(i);
			if(c.existeCamion(patente))
				return c;
		}		
		return null;
	}
	
	public void cargarBarco(String nombreBarco, String nombreCereal){
		Barco b = buscarBarco(nombreBarco);
		if(b != null)
			for(int i = 0; i < camiones.size(); i++){
				Camion camion = camiones.get(i);
				if(camion.tieneCereal(nombreCereal))
					if(camion.tieneCarga())
						if(b.tieneCapacidad(camion))
							b.agregarCamion(camion);
			}		
	}
	
	

}
