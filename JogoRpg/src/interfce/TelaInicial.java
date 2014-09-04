package interfce;

import pannels.PanelInicio;
import pannels.PanelNovoJogo;


public class TelaInicial {

	
	
	public static Janela janela1;
	public static PanelInicio panelLogin;	


	/*public static void esconderTela(){
		
		janela.setVisible(false);
	}*/
	
	public TelaInicial(){

		setJanela();
		setPanelLogin();
		janela1.add(panelLogin);
		janela1.repaint();
		//janela1.remove(paneLogin);
	}
	
	public void setJanela(){
		this.janela1 = new Janela();
		
		
		
	};
	public void setPanelLogin(){
		
		this.panelLogin = new PanelInicio();
	};
}
