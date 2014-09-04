package interfce;

import javax.swing.JPanel;

import pannels.PanelInicio;
import pannels.PanelNovoJogo;


public class TelaInicial {

	
	
	public static Janela janela1 = new Janela();
	public static PanelInicio panelLogin = new PanelInicio();	
	public static PanelNovoJogo panel2 = new PanelNovoJogo();	

	public TelaInicial(){
		
		janela1.add(panelLogin);
		janela1.repaint();
		//janela1.remove(paneLogin);
	}
	
	
}