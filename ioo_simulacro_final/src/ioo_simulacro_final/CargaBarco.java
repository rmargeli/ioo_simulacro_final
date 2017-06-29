package ioo_simulacro_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class CargaBarco extends javax.swing.JFrame{
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextField barco;
	private JTextField cereal;
	private JButton carga;
	private ControladorSistemaCarga sistema;
	
	public CargaBarco(ControladorSistemaCarga sistema){
		super();
		this.sistema = sistema;
		crearpantalla();
	}

	private void crearpantalla() {
		try{
			setSize(400, 500);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
			jLabel1 = new JLabel();
			getContentPane().add(jLabel1);
			jLabel1.setText("Barco:");
			jLabel1.setBounds(21, 42, 63, 28);

			jLabel2 = new JLabel();
			getContentPane().add(jLabel2);
			jLabel2.setText("Cereal:");
			jLabel2.setBounds(21, 92, 63, 28);
			
			barco= new JTextField();
			getContentPane().add(barco);
			barco.setBounds(119, 42, 210, 28);

			cereal = new JTextField();
			getContentPane().add(cereal);
			cereal.setBounds(119, 92, 210, 28);

			carga = new JButton();
			getContentPane().add(carga);
			carga.setText("OK");
			carga.setBounds(238, 250, 63, 28);
			carga.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					sistema.cargarBarco(barco.getText(), cereal.getText());
					barco.setText("");
					cereal.setText("");
				}
			});
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
}
