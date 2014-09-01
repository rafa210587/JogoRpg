package interfce;

import javax.swing.JPanel;

import panels.PaneInicio;
import panels.PanelNvoJgo;


public class TelaInicial {

	
	
	public static Janela janela1 = new Janela();
	public static PaneInicio paneLogin = new PaneInicio();	
	public static PanelNvoJgo pane2 = new PanelNvoJgo();	


	/*public static void esconderTela(){
		
		janela.setVisible(false);
	}*/
	
	public TelaInicial(){

		
		janela1.add(paneLogin);
		janela1.repaint();
		//janela1.remove(paneLogin);
	}
	
	
}