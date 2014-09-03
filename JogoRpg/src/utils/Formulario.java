package utils;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import utils.Atributo;

public class Formulario {
	private Atributo campos[];
	
	public Formulario(Atributo atributos[])
	{
		campos = atributos;
	}
	
	public void montaBloco()
	{
		for(Atributo at : campos)
		{
			JLabel labels = new JLabel(at.nome);
			
			switch(at.campoTipo)
			{
			case TEXTO:
				JTextField txtNomeChar = new JTextField();
				break;
			case NUM:
				JTextField txtForca = new JTextField();
				JButton btAumFor = new JButton("+");
				JButton btDimFor = new JButton("-");				
				break;
			}
		}
	}
}
