package buttonEvents;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import pannels.PanelAtributos;

public class PannelAtrbEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object src = e.getSource();
		JButton teste = (JButton) src;
		String nome = teste.getName();
		
		switch (nome) {
		case "aForça":
			System.out.println("Deu certo");
			break;

		default:
			break;
		}
		
	}

	
	
}