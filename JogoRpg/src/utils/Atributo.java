package utils;

import java.awt.Color;

public abstract class Atributo {
	public enum Tipo{TEXTO,NUM};

	public int valor;
	public String nome;
	//valores para o formulario
	public int posX, posY;//Posicionamento no formulario
	/*O tipo vai ser usado para dizer se eh campo de texto ou de 
	ajuste (com o + e -) na montagem do formulario*/
	public Tipo campoTipo;
	public Color campoCor;//Cor do campo no formulario
}