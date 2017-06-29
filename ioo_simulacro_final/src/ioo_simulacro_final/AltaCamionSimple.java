package ioo_simulacro_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AltaCamionSimple extends javax.swing.JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField patente;
	private JTextField cereal;
	private JTextField carga;
	private JTextField porcentaje;
	private JButton alta;
	private ControladorSistemaCarga sistema;
	
	public AltaCamionSimple(ControladorSistemaCarga sistema){
		super();
		this.sistema = sistema;
		crearPantalla();
	}

	private void crearPantalla() {
		try{
			setSize(400, 600);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Patente:");
				jLabel1.setBounds(21, 42, 63, 28);
				
				
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Cereal:");
				jLabel2.setBounds(21, 92, 63, 28);

				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Carga:");
				jLabel3.setBounds(21, 142, 63, 28);

				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Porcentaje:");
				jLabel4.setBounds(21, 192, 63, 28);
				
				patente = new JTextField();
				getContentPane().add(patente);
				patente.setBounds(119, 42, 210, 28);

				cereal = new JTextField();
				getContentPane().add(cereal);
				cereal.setBounds(119, 92, 210, 28);

				carga = new JTextField();
				getContentPane().add(carga);
				carga.setBounds(119, 142, 210, 28);
				
				porcentaje = new JTextField();
				getContentPane().add(porcentaje);
				porcentaje.setBounds(119, 192, 210, 28);
				
				alta = new JButton();
				getContentPane().add(alta);
				alta.setText("OK");
				alta.setBounds(238, 250, 63, 28);
				alta.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						sistema.crearCamionSimple(patente.getText(), cereal.getText(), Float.parseFloat(carga.getText()), Float.parseFloat(porcentaje.getText()));						
						patente.setText("");
						cereal.setText("");
						carga.setText("");
						porcentaje.setText("");
					}
				});
					
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
	
}
