package pannels;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelStatus extends JPanel{
	
	private int x=0;
	private int y=5;
	private String[] Status = {"Dano","Acerto","Esquiva","Dano Magico","Defesa Magica","Acerto Crit"};
	private String lblAtributos[] = {"Dan", "Ace", "Esq", "DanM", "DefM","AceC"};

	
	public PanelStatus(){
		setBorder(null);
		setLayout(null);
		setVisible(true);
		setName("panelStatus");
		String[] t = lblAtributos;
		int i = 0;	
		
		for (String s:Status){
		
		
		addLabels(s);
		addtxtFields(t[i]);
		i = i+1;
		
		}
		
		repaint();
	
	}
	public void addCampos(){
		
		
		
		
		
		
	}
	
	private JLabel addLabels(String s){
		JLabel label = new JLabel(s);
		add(label);
		label.setName("lbl" + s);
		label.setBounds(x, y, 100, 30);
	
		
		return label;
	}

	private JTextField addtxtFields(String t){
		JTextField txtField = new JTextField("0");
		x=100;
		y+=+3;
		add(txtField);
		txtField.setName("txt" + t);
		txtField.setBounds(x,y,30,20);
		y += 25;
		x=0;
		y+=-3;
		txtField.setEnabled(false);
		return txtField;
	};
	
	private void popularTxtFields(String s){
		int x = 0;
		
		
		
		
	};
}
