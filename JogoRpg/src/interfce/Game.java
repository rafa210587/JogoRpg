package interfce;

import pannels.PanelInicio;
import pannels.PanelNovoJogo;
import pannels.PanelJogo;
import utils.Atributo.Tipo;
import utils.Personagem;
import utils.Atributo;

public class Game {
	private static Personagem p;
	
	public static Janela janelaMain;
	public static PanelInicio panelLogin;	
	public static PanelNovoJogo panelNewGame;
	public static PanelJogo panelGame;
	
	public static void main(String[] args) {
		// Janela principal da aplicacao
		janelaMain = new Janela();
		
		panelLogin = new PanelInicio(); // Panel inicial do jogo
		panelNewGame = new PanelNovoJogo(); // Panel de novo jogo
		panelGame = new PanelJogo();

		janelaMain.add(panelLogin);
		janelaMain.repaint();
		
	}
	
}
