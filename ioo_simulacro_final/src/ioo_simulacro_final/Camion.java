package ioo_simulacro_final;

public abstract class Camion {
	protected String patente;
	protected boolean estado;
	protected String nombreCereal;
	protected float cargaTotal;
	
	public Camion(String patente, String cereal, float carga){
		this.patente = patente;
		nombreCereal = cereal;
		carga = cargaTotal;
		estado = true;													//presumo que el camion ingresa cargado
	}
	
	public abstract float calcularCarga();

	public boolean existeCamion(String patente) {
		if(this.patente.equals(patente))
			return true;
		return false;
	}

	public boolean tieneCereal(String nombreCereal) {
		if(this.nombreCereal.equals(nombreCereal))
			return true;
		return false;
	} 
	
	public void setEstado(){
		estado = false;
	}

	public boolean tieneCarga() {
		if(estado == true)
			return true;
		return false;
	}

}
