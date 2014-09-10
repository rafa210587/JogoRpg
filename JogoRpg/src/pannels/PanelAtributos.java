package pannels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buttonEvents.PannelAtrbEvent;

public class PanelAtributos extends JPanel{

	private static final long serialVersionUID = -6231099318810158221L;

	private String lblAtributos[] = {"Str", "Vit", "Dex", "Agi", "Int", "Wil","Lck"};

	private Font FonteBt = new Font("Sans_serif" ,Font.BOLD, 8);

	private JTextField txtPontos = new JTextField("20");
	private JLabel lblPontos = new JLabel("Pontos");
	
	private int x = 5;
	private int y = 5;
	
	public PanelAtributos() {
		setLayout(null);
//		setBorder(BorderFactory.createLineBorder(Color.BLACK)); //Usado somente pra orientar a localização do panel
		
		addPontos(); //Método específico para adcionar o Label e TextField de Pontos
		
		for (String s : lblAtributos){
			add(addLabels(s));
			add(addButtons('-', s));
			add(addTextField(s));
			add(addButtons('+', s));
			x = 5;
			y += 30;
		}
		
		setVisible(true);
		repaint();
	}
	
	private void addPontos() {
		int width = lblPontos.getPreferredSize().width;
		int height = lblPontos.getPreferredSize().height;
		
		add(lblPontos);
		add(txtPontos);
		
		lblPontos.setName("lblPontos");
		lblPontos.setBounds(x, y, width, height);
		
		x += width + 10;
		
		txtPontos.setName("txtPontos");
		txtPontos.setBounds(x, y, 30, 20);
		txtPontos.setEditable(false);
		txtPontos.setBackground(Color.WHITE);
		
		y += height + 10;
		x = 5;
	}

	private JLabel addLabels(String s){
		JLabel label = new JLabel(s);
		
		label.setName("lbl" + s);
		label.setBounds(x, y, 50, 30);
		
		x += 40;
		y += 5;
		
		return label;
	}
	
	private JButton addButtons(char buttonIcon, String s){
		JButton button = new JButton(String.valueOf(buttonIcon));
		
		button.setName("btn" + s + buttonIcon);
		button.setBounds(x, y, 20, 20);
		button.setFont(FonteBt);
		button.setBorder(BorderFactory.createEmptyBorder());
		button.addActionListener(new PannelAtrbEvent());
		
		x+= 20;
		
		return button;
	}
	
	private JTextField addTextField(String s){
		JTextField txtField = new JTextField("0");
		
		txtField.setName("txt" + s);
		txtField.setBounds(x, y, 20, 20);
		txtField.setEditable(false);
		txtField.setBackground(Color.WHITE);
		
		x += 20;
		
		return txtField;
	}
	
	public Integer getPontos(){	
		int pontos = Integer.parseInt(txtPontos.getText());
		
		return pontos;
	}
	
	public void setPontos(Integer pontos){
		txtPontos.setText(String.valueOf(pontos));
	}
}
