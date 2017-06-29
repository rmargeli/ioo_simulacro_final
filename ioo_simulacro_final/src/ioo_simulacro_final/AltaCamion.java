package ioo_simulacro_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AltaCamion extends javax.swing.JFrame {
	
	private JComboBox lista;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JTextField patente;
	private JTextField cereal;
	private JTextField carga;
	private JTextField porcdesc;
	private JTextField porcdesp;
	private JButton tipo;
	private JButton alta;
	private ControladorSistemaCarga sistema;
	
	public AltaCamion(ControladorSistemaCarga sistema){
		super();
		this.sistema = sistema;
		crearPantalla();
	}

	private void crearPantalla() {
		try{
			setSize(400, 300);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
				lista = new JComboBox();
				lista.addItem("Simple");
				lista.addItem("Doble");
				getContentPane().add(lista);
				lista.setBounds(119, 42, 210, 28);
				lista.setVisible(true);

			
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Patente:");
				jLabel1.setBounds(21, 42, 63, 28);
				jLabel1.setVisible(false);
				
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Cereal:");
				jLabel2.setBounds(21, 92, 63, 28);
				jLabel2.setVisible(false);
				
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Carga:");
				jLabel3.setBounds(21, 142, 63, 28);
				jLabel3.setVisible(false);
				
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Porc. Descarga:");
				jLabel4.setBounds(21, 182, 63, 28);
				jLabel4.setVisible(false);
				
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Porc. Desperdicio:");
				jLabel5.setBounds(21, 222, 63, 28);
				jLabel5.setVisible(false);
				
				patente = new JTextField();
				getContentPane().add(patente);
				patente.setBounds(119, 42, 210, 28);
				patente.setVisible(false);
				
				cereal = new JTextField();
				getContentPane().add(cereal);
				cereal.setBounds(119, 92, 210, 28);
				cereal.setVisible(false);
				
				carga = new JTextField();
				getContentPane().add(carga);
				carga.setBounds(119, 142, 210, 28);
				carga.setVisible(false);
				
				porcdesc = new JTextField();
				getContentPane().add(porcdesc);
				porcdesc.setBounds(119, 182, 210, 28);
				porcdesc.setVisible(false);
				
				porcdesp = new JTextField();
				getContentPane().add(porcdesp);
				porcdesp.setBounds(119, 222, 210, 28);
				porcdesp.setVisible(false);
				
				alta = new JButton();
				getContentPane().add(alta);
				alta.setText("Alta");
				alta.setBounds(238, 250, 63, 28);
				alta.setVisible(false);
				alta.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						if(lista.getSelectedItem().equals("Simple")){
							sistema.crearCamionSimple(patente.getText(), cereal.getText(), Float.parseFloat(carga.getText()), Float.parseFloat(porcdesc.getText()));
							lista.setVisible(true);
							tipo.setVisible(true);
							jLabel1.setVisible(false);
							jLabel2.setVisible(false);
							jLabel3.setVisible(false);
							jLabel4.setVisible(false);
							jLabel5.setVisible(false);
							patente.setVisible(false);
							patente.setText("");
							cereal.setVisible(false);
							cereal.setText("");
							carga.setVisible(false);
							carga.setText("");
							porcdesc.setVisible(false);
							porcdesc.setText("");
							porcdesp.setVisible(false);
							alta.setVisible(false);				
						}
						else if(lista.getSelectedItem().equals("Doble")){
							sistema.crearCamionDoble(patente.getText(), cereal.getText(), Float.parseFloat(carga.getText()), Float.parseFloat(porcdesc.getText()), Float.parseFloat(porcdesp.getText()));
							lista.setVisible(true);
							tipo.setVisible(true);
							jLabel1.setVisible(false);
							jLabel2.setVisible(false);
							jLabel3.setVisible(false);
							jLabel4.setVisible(false);
							jLabel5.setVisible(false);
							patente.setVisible(false);
							patente.setText("");
							cereal.setVisible(false);
							cereal.setText("");
							carga.setVisible(false);
							carga.setText("");
							porcdesc.setVisible(false);
							porcdesc.setText("");
							porcdesp.setVisible(false);
							porcdesp.setText("");
							alta.setVisible(false);			
						}						
					}
				});


				
				tipo = new JButton();
				getContentPane().add(tipo);
				tipo.setText("OK");
				tipo.setBounds(238, 250, 63, 28);
				tipo.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						if(lista.getSelectedItem().equals("Simple")){
							lista.setVisible(false);
							tipo.setVisible(false);
							jLabel1.setVisible(true);
							jLabel2.setVisible(true);
							jLabel3.setVisible(true);
							jLabel4.setVisible(true);
							jLabel5.setVisible(false);
							patente.setVisible(true);
							cereal.setVisible(true);
							carga.setVisible(true);
							porcdesc.setVisible(true);
							alta.setVisible(true);
						}
						else if(lista.getSelectedItem().equals("Doble")){
							lista.setVisible(false);
							tipo.setVisible(false);
							jLabel1.setVisible(true);
							jLabel2.setVisible(true);
							jLabel3.setVisible(true);
							jLabel4.setVisible(true);
							jLabel5.setVisible(true);
							patente.setVisible(true);
							cereal.setVisible(true);
							carga.setVisible(true);
							porcdesc.setVisible(true);
							porcdesp.setVisible(true);
							alta.setVisible(true);				
						}
						
					}
				});
				pack();
				setSize(400, 500);			
			}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	
	
	

}
