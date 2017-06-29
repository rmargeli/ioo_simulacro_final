package ioo_simulacro_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AltaBarco extends javax.swing.JFrame{
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JTextField nombre;
	private JTextField nacionalidad;
	private JTextField capacidad;
	private JButton alta;
	private ControladorSistemaCarga sistema;
	
	public AltaBarco(ControladorSistemaCarga sistema){
		super();
		this.sistema = sistema;
		crearPantalla();		
	}

	private void crearPantalla() {
		try{
			setSize(400, 500);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Nombre:");
				jLabel1.setBounds(21, 42, 63, 28);
				
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Nacionalidad:");
				jLabel2.setBounds(21, 92, 63, 28);
				
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Capacidad:");
				jLabel3.setBounds(21, 142, 63, 28);
				
				nombre = new JTextField();
				getContentPane().add(nombre);
				nombre.setBounds(119, 42, 210, 28);
				
				nacionalidad = new JTextField();
				getContentPane().add(nacionalidad);
				nacionalidad.setBounds(119, 92, 210, 28);
				
				capacidad = new JTextField();
				getContentPane().add(capacidad);
				capacidad.setBounds(119, 142, 210, 28);
				
				alta = new JButton();
				getContentPane().add(alta);
				alta.setText("OK");
				alta.setBounds(238, 250, 63, 28);
				alta.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						sistema.crearBarco(nombre.getText(), nacionalidad.getText(), new Date(), Float.parseFloat(capacidad.getText()));
						nombre.setText("");
						nacionalidad.setText("");
						capacidad.setText("");						
					}
				});
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		
	}
	
}
