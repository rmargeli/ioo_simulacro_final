package ioo_simulacro_final;

public class CamionDoble extends Camion {
	private float porcentajeDescarga;
	private float porcentajeDesperdicio;
	
	public CamionDoble(String patente, String cereal, float carga, float porcentaje, float desperdicio){
		super(patente, cereal, carga);
		porcentajeDescarga = porcentaje;
		porcentajeDesperdicio = desperdicio;
	}
	
	public float calcularCarga(){
		return cargaTotal-(cargaTotal * porcentajeDescarga / 100) - (cargaTotal * porcentajeDesperdicio / 100);
	}	

}
