package interfce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuJan extends JMenuBar{
	
	public MenuJan(){
		
		
		
		JMenu arquivoMenu = new JMenu ("Arquivo");
		JMenuItem sairMenu = new JMenuItem ("Sair");
		
		JMenuItem nvoJogo = new JMenuItem("Novo");
		JMenuItem  carregarJogo= new JMenuItem ("Carregar");
		
		
		
		add(arquivoMenu);
		add(sairMenu);
		
		arquivoMenu.add(nvoJogo);
		arquivoMenu.add(carregarJogo);
		
		
		sairMenu.addActionListener(new exitMenu());
				
		
		
		
	}
	
	static class exitMenu implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }

}
