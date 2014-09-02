package utils;
import java.awt.Color;


public class Personagem {
	//Dados dos atributos
	class Atributo{
		String nome, campoTipo;
		int posX, posY;
		Color campoCor;
	}
	
	
	//Declaracao de variáveis
	private String nome;
	private String[] classes, atrBase;
	private Atributo[] atributos;
	
	//Declaracao de metodos
	public Personagem()
	{
		System.out.print("Personagem criado.\n");
		//Definindo padrões dos campos
		String[] atrBaseNames = {"Str","Dex","Agi","Vit","Int","Wil"};
		
		for( int i=0; i<atrBase.length; i++ )
			atributos[i].nome = atrBase[i];
		
		
	}
	
	
	public void setAtributos(String nome, int x, int y, Color cor, String tipo)
	{
		boolean atrOk = false;
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
			atributos[atributos.length].nome = nome;
			atributos[atributos.length].posX = x;
			atributos[atributos.length].posY = y;
			atributos[atributos.length].campoCor = cor;
			atributos[atributos.length].campoTipo = tipo;
		}
	}
	
	public void montaFormulario()
	{
		
	}
}
