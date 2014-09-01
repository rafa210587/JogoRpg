package interfce;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

import pannels.PanelInicio;

public class Janela extends JFrame{
	
	public Janela(){
	
	MenuJan menuBar = new MenuJan();	
	
		
	setLayout(null);	
	setTitle("Tela Inicial");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(800, 600);
	setLocationRelativeTo(null);
	setResizable(false);
	setVisible(true);
	
	//getContentPane().add(paneLogin, BorderLayout.CENTER);
	setJMenuBar(menuBar);
	/*static PaneInicio teste = new PaneInicio();
	
	JFrame Inicio = new JFrame("Tela Inicial");
	Inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	Inicio.getContentPane().add(teste,BorderLayout.CENTER);
	Inicio.pack();
	Inicio.setVisible(true);*/
	
	
	}

	
}
