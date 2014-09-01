package pannels;

import interfce.Janela;
import interfce.TelaInicial;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicio extends JPanel {
	
	
	public PanelInicio(){
	setLayout(null);
	setSize(800,600);
	setVisible(true);
	
	Font FonteBt = new Font("Sans_serif" ,Font.BOLD, 16);
	
	JButton b1 = new JButton("Novo");
	JButton b2 = new JButton("Carregar");
	
	add(b2);
	b2.setBounds(500, 400, 200, 60);
	b2.setFont(FonteBt);
	
	add(b1);
	b1.setBounds(100, 400, 200, 60);
	b1.setFont(FonteBt);
	

	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			TelaInicial.janela1.remove(TelaInicial.panelLogin);
			TelaInicial.panel2.setVisible(true);
			TelaInicial.janela1.add(TelaInicial.panel2);
			TelaInicial.janela1.repaint();
			
		}
	});
	}
	
}
	

