package buttonEvents;

import interfce.Janela;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import pannels.PanelAtributos;
import pannels.PanelNovoJogo;
import pannels.PanelStatus;

public class PannelAtrbEvent implements ActionListener {
	
	private PanelAtributos panelAtributos; //teste
	private PanelStatus panelStatus;
	private PanelNovoJogo panelNvoJgo;
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btn = (JButton) e.getSource();
		setParent(btn);

		String btnName = btn.getName();
		
		
		switch (btnName) {
		case "btnStr+":
			aumentaAtributo("txtStr");
			aumentaStatus("txtDano");
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
	private void AlteraStatus(String s){
		Component[] c = panelStatus.getComponents();
		
		
		
		
		
	}
	
	private void aumentaStatus(String s){
		getPanelStatus();
		Component[] c = panelStatus.getComponents();
		int valor;
		for (int i = 0; i< panelStatus.getComponentCount(); i++){
			if (c[i].getName().equals(s)){
				JTextField text = (JTextField) panelStatus.getComponent(i);
				
				valor = Integer.parseInt(text.getText())+1;
				text.setText(String.valueOf(valor));
			}
			
		}
		System.out.println(panelStatus.getComponent(2).getName());
		
	}
	private void getPanelStatus(){
		Component[] c = panelNvoJgo.getComponents();
		for (int i = 0; i< panelNvoJgo.getComponentCount(); i++){
			if (c[i].getName() != null){
				
				
				if (c[i].getName().equals("panelStatus")){
				
					this.panelStatus = (PanelStatus) c[i];
				
				}
			}
			
		}
		
		
		
	}
	private void aumentaAtributo(String s){
		Component[] c = panelAtributos.getComponents();
		int valor;
		
		if (panelAtributos.getPontos() > 0){
			for (int i = 0; i < panelAtributos.getComponentCount(); i++){
				if (c[i].getName().equals(s)){
					JTextField text = (JTextField) panelAtributos.getComponent(i);
					
					valor = Integer.parseInt(text.getText()) + 1;
					
					panelAtributos.setPontos(panelAtributos.getPontos() - 1);
					
					text.setText(String.valueOf(valor));
					
					break;
				}
			}
		}
	}
	
	private void diminuiAtributo(String s){
		Component[] c = panelAtributos.getComponents();
		int valor;
		
		for (int i = 0; i < panelAtributos.getComponentCount(); i++){
			if (c[i].getName().equals(s)){
				JTextField text = (JTextField) panelAtributos.getComponent(i);
				
				if (Integer.parseInt(text.getText()) < 1) {
					text.setText("0");
				} else {
					valor = Integer.parseInt(text.getText()) - 1;
					text.setText(String.valueOf(valor));
					panelAtributos.setPontos(panelAtributos.getPontos() + 1);
				}
				
				break;
			}
		}
	}
	
	private void setParent(Component c){
		
		this.panelAtributos = (PanelAtributos) c.getParent();
		this.panelNvoJgo = (PanelNovoJogo) this.panelAtributos.getParent();

	}
}