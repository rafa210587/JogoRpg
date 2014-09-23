package buttonEvents;

import interfce.Janela;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

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
			aumentaDano("txtDan");
			break;
		case "btnStr-":
			diminuiAtributo("txtStr");
			diminuiDano("txtDan");
			break;
		case "btnVit+":
			aumentaAtributo("txtVit");
//			aumentaHP("txtVit");

			break;
		case "btnVit-":
			diminuiAtributo("txtVit");
			break;
		case "btnDex+":
			aumentaAtributo("txtDex");
			aumentaEsqAce("txtAce", btnName);
			break;
		case "btnDex-":
			diminuiAtributo("txtDex");
			diminuiEsqAce("txtAce", btnName);
			break;
		case "btnAgi+":
			aumentaAtributo("txtAgi");
			aumentaEsqAce("txtEsq", btnName);

			break;
		case "btnAgi-":
			diminuiAtributo("txtAgi");
			diminuiEsqAce("txtEsq", btnName);
			break;
		case "btnInt+":
			aumentaAtributo("txtInt");
			aumentaEsqAce("txtEsq", btnName);
			aumentaEsqAce("txtAce", btnName);

			break;
		case "btnInt-":
			diminuiAtributo("txtInt");
			diminuiEsqAce("txtEsq", btnName);
			diminuiEsqAce("txtAce", btnName);

			break;
		case "btnWil+":
			aumentaAtributo("txtWil");
			break;
		case "btnWil-":
			diminuiAtributo("txtWil");
			break;
		case "btnLck+":
			aumentaAtributo("txtLck");
			aumentaEsqAce("txtEsq", btnName);
			aumentaEsqAce("txtAce", btnName);

			break;
		case "btnLck-":
			diminuiAtributo("txtLck");
			diminuiEsqAce("txtEsq", btnName);
			diminuiEsqAce("txtAce", btnName);
			break;
		default:
			break;
		}
	}
	
	private void aumentaDano(String s){
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
	
	private void diminuiDano(String s){
		getPanelStatus();
		Component[] c = panelStatus.getComponents();
		int valor;
		for (int i = 0; i< panelStatus.getComponentCount(); i++){
			if (c[i].getName().equals(s)){
				JTextField text = (JTextField) panelStatus.getComponent(i);
				if (Integer.parseInt(text.getText()) < 1){
				
				
				text.setText("0");
				}
			else{
				
				valor = Integer.parseInt(text.getText()) - 1;
				text.setText(String.valueOf(valor));
				panelAtributos.setPontos(panelAtributos.getPontos() + 1);
				}
			}
			
		}
		
	}

	private void aumentaEsqAce(String s, String btnName){
		getPanelStatus();
		Component[] c = panelStatus.getComponents();
		double valor;
		NumberFormat formatar = new DecimalFormat("#0.00");

		for (int i = 0; i< panelStatus.getComponentCount(); i++){
			if (c[i].getName().equals(s)){
				JTextField text = (JTextField) panelStatus.getComponent(i);
				String texto = text.getText().replace(",", ".");

			if (btnName.equals("btnLck+")){
				valor = Double.parseDouble(texto);
				valor +=0.2;
			
			
				text.setText(formatar.format(valor));
				System.out.println(valor);
				}
			else {


				valor = Double.parseDouble(texto);
				valor +=0.5;
			
			
				text.setText(formatar.format(valor));
				
			}
		}
			
			
			
	}
		
}
	
	private void diminuiEsqAce(String s, String btnName){
		getPanelStatus();
		Component[] c = panelStatus.getComponents();
		double valor;
		NumberFormat formatar = new DecimalFormat("#0.00");

		for (int i = 0; i< panelStatus.getComponentCount(); i++){
			if (c[i].getName().equals(s)){
				JTextField text = (JTextField) panelStatus.getComponent(i);
				String texto = text.getText().replace(",", ".");

				if (btnName.equals("btnLck-") && Double.parseDouble(texto) < 0.2){
				
				
				text.setText("0");
				}
			else if (btnName.equals("btnLck-")){
				
				valor = Double.parseDouble(texto) - 0.2;
				text.setText(formatar.format(valor));
				System.out.println(valor);

				}
			else if(!btnName.equals("btnLck-")) {
				
				valor = Double.parseDouble(texto) - 0.5;
				text.setText(formatar.format(valor));

				
			}
			else if (!btnName.equals("btnLck-") && Double.parseDouble(texto) < 0.5) {
				
				text.setText("0");

				
				
				
			}
			}
			
		}
		
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