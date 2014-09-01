package panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uteis.MaxCharTxt;

public class PanelNvoJgo extends JPanel {
	
	
	
	public PanelNvoJgo(){
		
		Font FonteBt = new Font("Sans_serif" ,Font.BOLD, 5);

		MaxCharTxt maxCharNome = new MaxCharTxt();
		JLabel lblNomeChar = new JLabel("Nome");
		JLabel lblClass = new JLabel("Classes");
		JLabel lblPtos = new JLabel("Pontos");
		JLabel lblForca = new JLabel("Str");
		JLabel lblDestreza = new JLabel("Dex");
		JLabel lblAgilidade = new JLabel("Agi");
		JLabel lblVigor = new JLabel("Vigor");
		JLabel lblInteligencia = new JLabel("Int");
		JLabel lblVontade = new JLabel("Wil");
		
		JTextField txtForca = new JTextField();
		JTextField txtDestreza = new JTextField();
		JTextField txtAgilidade = new JTextField();
		JTextField txtVigor = new JTextField();
		JTextField txtInteligencia = new JTextField();
		JTextField txtVontade = new JTextField();
		
		JButton btAumFor = new JButton("+");
		JButton btDimFor = new JButton("-");
		JButton btAumDes = new JButton("+");
		JButton btDimDes = new JButton("-");
		JButton btAumAgi = new JButton("+");
		JButton btDimAgi = new JButton("-");
		JButton btAumVig = new JButton("+");
		JButton btDimVig = new JButton("-");
		JButton btAumInt = new JButton("+");
		JButton btDimInt = new JButton("-");
		JButton btAumVont = new JButton("+");
		JButton btDimVont = new JButton("-");
		
		JTextField txtNomeChar = new JTextField();
		JTextField txtPtos = new JTextField();
		
		String[] classes = {"Guerreiro", "Mago", "Ladrao"};
		JComboBox cbClasse = new JComboBox(classes); 
		
		
		
		setLayout(null);
		setSize(800, 600);
		setVisible(true);
		
	
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
		
		add(lblPtos);
		lblPtos.setBounds(50,150,120,30);		
		add(txtPtos);
		txtPtos.setEditable(false);
		txtPtos.setBounds(95, 155, 30, 20);
		txtPtos.setBackground(Color.WHITE);
		
		
		add(lblForca);
		lblForca.setBounds(50, 190, 50, 20);
		add(txtForca);
		txtForca.setEditable(false);
		txtForca.setBounds(110, 190,30,30);
		add(btDimFor);
		btDimFor.setBounds(90, 190, 30, 20);
		btDimFor.setFont(FonteBt);
		add(btAumFor).setBounds(130, 190, 30, 30);
		btAumFor.setFont(FonteBt);
		
		
		
		
		
	}

}
