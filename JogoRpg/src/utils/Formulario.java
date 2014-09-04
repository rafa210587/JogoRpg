package utils;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import utils.Atributo;

public class Formulario {
	private Atributo campos[];
	private JLabel labels[];
	private JTextField fields[];
	private JButton[] buttons[];
	
	private int labelYSpace;
	
	public Formulario(Atributo atributos[])
	{
		campos = atributos;
	}
	
	public void montaBloco(String nome)
	{
		int newIdx = labels.length;
		labels[newIdx] = new JLabel(nome);
		fields[newIdx] = new JTextField();
	}
	
	public void montaBlocosAtr()
	{
		for(Atributo at : campos)
		{
			int newIdx = labels.length;
			labels[newIdx] = new JLabel(at.nome);
			
			switch(at.campoTipo)
			{
			case TEXTO:
				fields[newIdx] = new JTextField();
				break;
			case NUM:
				fields[newIdx] = new JTextField();
				buttons[newIdx][0] = new JButton("-");
				buttons[newIdx][1] = new JButton("+");				
				break;
			}
		}
	}
	
	public void setLabelYSpace(int v)
	{
		if(v > 0)
			labelYSpace = v;
		else 
			labelYSpace = 0;
	}
}
