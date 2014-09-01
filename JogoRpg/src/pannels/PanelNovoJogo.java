package pannels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import utils.MaxCharTxt;

public class PanelNovoJogo extends JPanel {
	
	
	
	public PanelNovoJogo(){
		
		Font FonteBt = new Font("Sans_serif" ,Font.BOLD, 8);

		MaxCharTxt maxCharNome = new MaxCharTxt();
		JLabel lblNomeChar = new JLabel("Nome");
		JLabel lblClass = new JLabel("Classes");
		JLabel lblPtos = new JLabel("Pontos");
		JLabel lblForca = new JLabel("Str");
		JLabel lblDestreza = new JLabel("Dex");
		JLabel lblAgilidade = new JLabel("Agi");
		JLabel lblVitalidade = new JLabel("Vit");
		JLabel lblInteligencia = new JLabel("Int");
		JLabel lblVontade = new JLabel("Wil");
		
		JTextField txtForca = new JTextField();
		JTextField txtDestreza = new JTextField();
		JTextField txtAgilidade = new JTextField();
		JTextField txtVitalidade = new JTextField();
		JTextField txtInteligencia = new JTextField();
		JTextField txtVontade = new JTextField();
		
		JButton btAumFor = new JButton("+");
		JButton btDimFor = new JButton("-");
		JButton btAumDes = new JButton("+");
		JButton btDimDes = new JButton("-");
		JButton btAumAgi = new JButton("+");
		JButton btDimAgi = new JButton("-");
		JButton btAumVit = new JButton("+");
		JButton btDimVit = new JButton("-");
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
		txtForca.setBounds(110, 190,20,20);
		txtForca.setBackground(Color.white);
		
		add(btDimFor);
		btDimFor.setBorder(BorderFactory.createEmptyBorder());
		btDimFor.setFocusPainted(false);		
		btDimFor.setBounds(90, 190, 20, 20);
		btDimFor.setFont(FonteBt);
		
		add(btAumFor).setBounds(130, 190, 20, 20);
		btAumFor.setFont(FonteBt);
		btAumFor.setBorder(BorderFactory.createEmptyBorder());
		btAumFor.setFocusPainted(false);
		
		add(lblVitalidade);
		lblVitalidade.setBounds(50, 220, 50, 20);
		
		add(txtVitalidade);
		txtVitalidade.setEditable(false);
		txtVitalidade.setBounds(110, 220,20,20);
		txtVitalidade.setBackground(Color.white);
		
		add(btDimVit);
		btDimVit.setBorder(BorderFactory.createEmptyBorder());
		btDimVit.setFocusPainted(false);		
		btDimVit.setBounds(90, 220, 20, 20);
		btDimVit.setFont(FonteBt);
		
		add(btAumVit).setBounds(130, 220, 20, 20);
		btAumVit.setFont(FonteBt);
		btAumVit.setBorder(BorderFactory.createEmptyBorder());
		btAumVit.setFocusPainted(false);
		
		add(lblDestreza);
		lblDestreza.setBounds(50, 250, 50, 20);
		
		add(txtDestreza);
		txtDestreza.setEditable(false);
		txtDestreza.setBounds(110, 250,20,20);
		txtDestreza.setBackground(Color.white);
		
		add(btDimDes);
		btDimDes.setBorder(BorderFactory.createEmptyBorder());
		btDimDes.setFocusPainted(false);		
		btDimDes.setBounds(90, 250, 20, 20);
		btDimDes.setFont(FonteBt);
		
		add(btAumDes).setBounds(130, 250, 20, 20);
		btAumDes.setFont(FonteBt);
		btAumDes.setBorder(BorderFactory.createEmptyBorder());
		btAumDes.setFocusPainted(false);
		
		add(lblAgilidade);
		lblAgilidade.setBounds(50, 280, 50, 20);
		
		add(txtAgilidade);
		txtAgilidade.setEditable(false);
		txtAgilidade.setBounds(110, 280,20,20);
		txtAgilidade.setBackground(Color.white);
		
		add(btDimAgi);
		btDimAgi.setBorder(BorderFactory.createEmptyBorder());
		btDimAgi.setFocusPainted(false);		
		btDimAgi.setBounds(90, 280, 20, 20);
		btDimAgi.setFont(FonteBt);
		
		add(btAumAgi).setBounds(130, 280, 20, 20);
		btAumAgi.setFont(FonteBt);
		btAumAgi.setBorder(BorderFactory.createEmptyBorder());
		btAumAgi.setFocusPainted(false);
		
		add(lblInteligencia);
		lblInteligencia.setBounds(50, 310, 50, 20);
		
		add(txtInteligencia);
		txtInteligencia.setEditable(false);
		txtInteligencia.setBounds(110, 310,20,20);
		txtInteligencia.setBackground(Color.white);
		
		add(btDimInt);
		btDimInt.setBorder(BorderFactory.createEmptyBorder());
		btDimInt.setFocusPainted(false);		
		btDimInt.setBounds(90, 310, 20, 20);
		btDimInt.setFont(FonteBt);
		
		add(btAumInt).setBounds(130, 310, 20, 20);
		btAumInt.setFont(FonteBt);
		btAumInt.setBorder(BorderFactory.createEmptyBorder());
		btAumInt.setFocusPainted(false);
		
		add(lblVontade);
		lblVontade.setBounds(50, 340, 50, 20);
		
		add(txtVontade);
		txtVontade.setEditable(false);
		txtVontade.setBounds(110, 340,20,20);
		txtVontade.setBackground(Color.white);
		
		add(btDimVont);
		btDimVont.setBorder(BorderFactory.createEmptyBorder());
		btDimVont.setFocusPainted(false);		
		btDimVont.setBounds(90, 340, 20, 20);
		btDimVont.setFont(FonteBt);
		
		add(btAumVont).setBounds(130, 340, 20, 20);
		btAumVont.setFont(FonteBt);
		btAumVont.setBorder(BorderFactory.createEmptyBorder());
		btAumVont.setFocusPainted(false);
		
	}
	
	
}
