package ioo_simulacro_final;

import java.util.ArrayList;
import java.util.Date;

public class Barco {
	private String nombre;
	private String nacionalidad;
	private Date fechaIngreso;
	private float capacidadTotal;
	private ArrayList <Camion> camionescarga;
	private static float capacidadparcial;
	
	public Barco(String nombre, String nacionalidad, Date fecha, float capacidad){
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		fechaIngreso = fecha;
		capacidadTotal = capacidad;
		camionescarga = new ArrayList <Camion>();
		capacidadparcial = capacidadTotal;
	}

	public boolean existeBarco(String nombre) {
		if(this.nombre.equals(nombre))
			return true;
		return false;
	}

	public boolean tieneCapacidad(Camion camion) {
		if(capacidadparcial >= camion.calcularCarga())
			return true;
		return false;
	}

	public void agregarCamion(Camion camion) {
		camion.setEstado();
		capacidadparcial = capacidadparcial - camion.calcularCarga();
		camionescarga.add(camion);		
	}

}
