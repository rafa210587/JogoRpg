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
	public PanelStatus(){
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLayout(null);
		setVisible(true);
		
		
		for (String s:Status){
			
		addLabels(s);
		addtxtFields(s);
		
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

	private JTextField addtxtFields(String s){
		JTextField txtField = new JTextField();
		x=100;
		y+=+3;
		add(txtField);
		txtField.setName("txt" + s);
		txtField.setBounds(x,y,30,20);
		y += 25;
		x=0;
		y+=-3;
		txtField.setEnabled(false);
		return txtField;
	};
}
