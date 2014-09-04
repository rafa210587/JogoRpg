package buttonEvents;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import pannels.PanelAtributos;

public class PannelAtrbEvent implements ActionListener {
	
	private PanelAtributos panel; //teste
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton) e.getSource();
		
		String btnName = btn.getName();
		
		setParent(btn);
		
		switch (btnName) {
		case "btnStr+":
			aumentaAtributo("txtStr");
			break;
		case "btnStr-":
			diminuiAtributo("txtStr");
			break;
		case "btnVit+":
			aumentaAtributo("txtVit");
			break;
		case "btnVit-":
			diminuiAtributo("txtVit");
			break;
		case "btnDex+":
			aumentaAtributo("txtDex");
			break;
		case "btnDex-":
			diminuiAtributo("txtDex");
			break;
		case "btnAgi+":
			aumentaAtributo("txtAgi");
			break;
		case "btnAgi-":
			diminuiAtributo("txtAgi");
			break;
		case "btnInt+":
			aumentaAtributo("txtInt");
			break;
		case "btnInt-":
			diminuiAtributo("txtInt");
			break;
		case "btnWil+":
			aumentaAtributo("txtWil");
			break;
		case "btnWil-":
			diminuiAtributo("txtWil");
			break;
		default:
			break;
		}
	}
	
	private void aumentaAtributo(String s){
		Component[] c = panel.getComponents();
		int valor;
		
		if (panel.getPontos() > 0){
			for (int i = 0; i < panel.getComponentCount(); i++){
				if (c[i].getName().equals(s)){
					JTextField text = (JTextField) panel.getComponent(i);
					
					valor = Integer.parseInt(text.getText()) + 1;
					
					panel.setPontos(panel.getPontos() - 1);
					
					text.setText(String.valueOf(valor));
					
					break;
				}
			}
		}
	}
	
	private void diminuiAtributo(String s){
		Component[] c = panel.getComponents();
		int valor;
		
		for (int i = 0; i < panel.getComponentCount(); i++){
			if (c[i].getName().equals(s)){
				JTextField text = (JTextField) panel.getComponent(i);
				
				if (Integer.parseInt(text.getText()) < 1) {
					text.setText("0");
				} else {
					valor = Integer.parseInt(text.getText()) - 1;
					text.setText(String.valueOf(valor));
					panel.setPontos(panel.getPontos() + 1);
				}
				
				break;
			}
		}
	}
	
	private void setParent(Component c){
		this.panel = (PanelAtributos) c.getParent();
	}
}