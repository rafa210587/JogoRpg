package pannels;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import utils.MaxCharTxt;

public class PanelNovoJogo extends JPanel {
	
	private static final long serialVersionUID = 642265100273819865L;


	public PanelNovoJogo(){
		
		setLayout(null);
		setSize(800, 600);
		
		cabeçalhoAtributos();
		
		setVisible(true);
	}
	
	public void cabeçalhoAtributos(){
		
		PanelAtributos panelAtributos = new PanelAtributos();
		
		panelAtributos.setBounds(45, 160, 110, 245);

		add(panelAtributos);
		
		MaxCharTxt maxCharNome = new MaxCharTxt();
		JLabel lblNomeChar = new JLabel("Nome");
		JLabel lblClass = new JLabel("Classes");
		
		JTextField txtNomeChar = new JTextField();
		
		String[] classes = {"Guerreiro", "Mago", "Ladrao"};
		JComboBox cbClasse = new JComboBox(classes); 

		
		maxCharNome.setMaxChars(10);// Chamada para limitar a quantidade de Caracteres num TextField
		
		txtNomeChar.setDocument(maxCharNome);
		//JButton b2 = new JButton("Carregar");

		add(lblNomeChar);
		lblNomeChar.setBounds(50, 30, 120, 20);
		add(txtNomeChar);
		txtNomeChar.setBounds(50,50, 100, 20);
		
		add(lblClass);
		lblClass.setBounds(50,80,50,20);
		cbClasse.setBounds(50,100 ,70,20);
		cbClasse.setBackground(Color.WHITE);
		add(cbClasse);
		
	}
	
	
	public void organiza2(){
		
		JLabel lblHP = new JLabel("HP");
		
	}
}


