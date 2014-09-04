package interfce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuJan extends JMenuBar{
	
	private JMenu arquivoMenu;
	public JMenuItem sairMenu, nvoJogo, carregarJogo; 
	
	public MenuJan(){
		
		arquivoMenu = new JMenu ("Arquivo");
		sairMenu = new JMenuItem ("Sair");
		
		nvoJogo = new JMenuItem("Novo");
		carregarJogo= new JMenuItem ("Carregar");
		
		add(arquivoMenu);
		add(sairMenu);

		arquivoMenu.add(nvoJogo);
		arquivoMenu.add(carregarJogo);
		
		nvoJogo.addActionListener(novoJogo());
		sairMenu.addActionListener(new exitMenu());
	}
	
	public ActionListener novoJogo()
	{

		//Game.janelaMain.removeAll();
		//Game.janelaMain.add(Game.panelNewGame);
		//Game.janelaMain.repaint();
		return null;
	}
	
	static class exitMenu implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

}
