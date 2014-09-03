package pannels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAtributos extends JPanel{

	private static final long serialVersionUID = -6231099318810158221L;
	private String lblAtributos[] = {"Str", "Vit", "Dex", "Agi", "Int", "Wil"};
	private Font FonteBt = new Font("Sans_serif" ,Font.BOLD, 8);
	private int x = 0;
	private int y = 5;
	
	public PanelAtributos() {
		setLayout(null);
		
		for (String s : lblAtributos){
			add(addLabels(s));
			add(addButtons('-', s));
			add(addTextField(s));
			add(addButtons('+', s));
			x = 0;
			y += 30;
		}
		
		setVisible(true);
		repaint();
	}
	
	private JLabel addLabels(String s){
		JLabel label = new JLabel(s);
		
		label.setName("lbl" + s);
		label.setBounds(x, y, 50, 30);
		
		x += 40;
		
		return label;
	}
	
	private JButton addButtons(char buttonIcon, String s){
		JButton button = new JButton(String.valueOf(buttonIcon));
		
		button.setName("btn" + s + buttonIcon);
		button.setBounds(x, y, 20, 20);
		button.setFont(FonteBt);
		button.setBorder(BorderFactory.createEmptyBorder()); 
		
		System.out.println(button.getName());
		
		x+= 20;
		
		return button;
	}
	
	private JTextField addTextField(String s){
		JTextField txtField = new JTextField();
		
		txtField.setName("txt" + s);
		txtField.setBounds(x, y, 20, 20);
		txtField.setEditable(false);
		txtField.setBackground(Color.WHITE);
		
		x += 20;
		
		return txtField;
	}
}
