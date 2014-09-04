package interfce;

import javax.swing.JFrame;

public class Janela extends JFrame{
	
	private static final long serialVersionUID = 8766414523704077711L;

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
