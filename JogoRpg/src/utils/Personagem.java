package utils;
import java.awt.Color;


public class Personagem {
	//Dados dos atributos
	class Atributo{
		int posX, posY, valor;
		String nome, campoTipo;
		Color campoCor;
	}
	
	//Dados do personagem
	private String nome;
	private Atributo[] atributos;
	
	//Declaracao de metodos
	public Personagem()
	{
		System.out.print("Personagem criado.\n");
	}
	
	/**
	 * Função que define dados de um atributo,
	 * caso o atributo ainda não exista ele é criado no array de Atributos.
	 * 
	 * @param nome
	 * @param x
	 * @param y
	 * @param cor
	 * @param tipo
	 */
	public void setAtributo(String nome, int x, int y, Color cor, String tipo)
	{
		boolean atrOk = false;
		int newIdx = atributos.length;
		
		if(nome.trim()==""){
			System.out.println("O Nome do atributo precisa estar definido.");
		}else{
			for (Atributo i : atributos){
				if(i.nome == nome){
					i.posX = x;
					i.posY = y;
					i.campoCor = cor;
					i.campoTipo = tipo;
					atrOk = true;
				}
			}
	
			if (!atrOk){				
				atributos[newIdx].nome = nome;
				atributos[newIdx].posX = x;
				atributos[newIdx].posY = y;
				atributos[newIdx].campoCor = cor;
				atributos[newIdx].campoTipo = tipo;
			}
		}

	}
	
	/**
	 * Monta o formulário de acordo com os atributos definidos do Personagem.
	 */
	public void montaFormulario()
	{
		
	}
}
