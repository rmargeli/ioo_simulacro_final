package ioo_simulacro_final;

public class CamionSimple extends Camion {
	private float porcentajeDescarga;
	
	public CamionSimple(String patente, String cereal, float carga, float porcentaje){
		super(patente, cereal, carga);
		porcentajeDescarga = porcentaje;
	}
	
	public float calcularCarga(){
		return cargaTotal-(cargaTotal * porcentajeDescarga / 100);
	}
	

}
