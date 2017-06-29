package ioo_simulacro_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class NewJFrame extends javax.swing.JFrame{
	
	private JMenuBar jMenuBar1;
	private JMenu camion;
	private JMenu altac;
	private JMenu barco;
	private JMenuItem csimple;
	private JMenuItem cdoble;
	private JMenuItem altab;
	private JMenuItem carga;
	private ControladorSistemaCarga sistema;
	
	public static void main(String[] args){
		NewJFrame inst = new NewJFrame();
		inst.setVisible(true);
	}
	
	public NewJFrame(){
		super();
		initGUI();
		sistema = new ControladorSistemaCarga();
	}

	private void initGUI() {
		try{
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			
			jMenuBar1 = new JMenuBar();
			setJMenuBar(jMenuBar1);
			
			
			camion = new JMenu();
			jMenuBar1.add(camion);
			camion.setText("Camion");
			
			altac = new JMenu();
			camion.add(altac);
			altac.setText("Alta");
				
			csimple = new JMenuItem();
			altac.add(csimple);
			csimple.setText("Simple");
			csimple.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					AltaCamionSimple cs = new AltaCamionSimple(sistema);
					cs.setVisible(true);
				}
			});
			
			cdoble = new JMenuItem();
			altac.add(cdoble);
			cdoble.setText("Doble");
			cdoble.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					AltaCamionDoble cd = new AltaCamionDoble(sistema);					
				}
			});
				
			barco = new JMenu();
			jMenuBar1.add(barco);
			barco.setText("Barco");
			
				altab = new JMenuItem();
				barco.add(altab);
				altab.setText("Alta");
				altab.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						AltaBarco b = new AltaBarco(sistema);
						b.setVisible(true);					
					}
				});			
				
				carga = new JMenuItem();
				barco.add(carga);
				carga.setText("Carga");
				carga.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evt){
						CargaBarco c= new CargaBarco(sistema);
						c.setVisible(true);
					}
				});			
			
		pack();
		setSize(400, 300);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	

}
