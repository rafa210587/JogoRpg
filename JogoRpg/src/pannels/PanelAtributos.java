package pannels;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelAtributos extends JPanel{

	private static final long serialVersionUID = -6231099318810158221L;
	private String atributos[] = {"Str", "Vit", "Dex", "Agi", "Int", "Wil"};
	private int x = 0;
	private int y = 0;
	
	public PanelAtributos() {
		setLayout(null);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		for (String s : atributos){
			add(addLabels(s));
		}
		
		setVisible(true);
		repaint();
	}
	
	private JLabel addLabels(String s){
		
		JLabel label = new JLabel(s);
		
		label.setBounds(x, y, 50, 30);
		
		y += label.getPreferredSize().height + 15;
		
		return label;
	}
}
