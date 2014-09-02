package utils;
import java.awt.Color;


public class Personagem {
	//Dados dos atributos
	class Atributo{
		int valor;
		String nome;
		//valores para o formulario
		int posX, posY;//Posicionamento no formulario
		/*O tipo vai ser usado para dizer se eh campo de texto ou de 
		ajuste (com o + e -) na montagem do formulario*/
		String campoTipo;
		Color campoCor;//Cor do campo no formulario
	}
	
	//Dados do personagem
	private String nome; //Nome do Personagem
	private Atributo[] atributos; // Array de Atributos do personagem (Ex. For, Des, etc)
	
	//Declaracao de metodos
	/**
	 * Inicializacao do personagem
	 */
	public Personagem()
	{
		System.out.print("Personagem criado.\n");
	}
	
	/**
	 * Funcao que define dados de um atributo,
	 * caso o atributo ainda n√£o exista ele √© criado no array de Atributos.
	 * 
	 * @param nome
	 * @param x
	 * @param y
	 * @param cor
	 * @param tipo
	 */
	public void setAtributo(String nome, int x, int y, Color cor, String tipo)
	{
		boolean novoAtr = true; // Bool para guardar se È um atributo que j· existe ou novo
				
		if(nome.trim()==""){ // Checa se o nome esta vazio
			System.out.println("O Nome do atributo precisa estar definido.");
		}else{
			/*Roda nos atributos existentes
			para cada atributo existente ele vai interpreta-lo como uma variavel i
			ent„o podemos acessar os dados diretamente daquele atributo com o i ao inves
			de precisar colocar seu indice. Ex. atributos[i] */
			for (Atributo i : atributos){ 
				if(i.nome == nome){ //Checa se o atributo ja existe
					i.posX = x; //Define a posX do atributo
					i.posY = y; //Define a posY do atributo
					i.campoCor = cor; //Define a cor do campo do formulario 
					i.campoTipo = tipo; //Define o tipo do campo do formulario
					novoAtr = false; //Diz que o atributo ja existia e nao eh novo
				}
			}
	
			if (novoAtr){ //Se for novo atributo (e nao ter entrado no if acima)
				int newIdx = atributos.length; //Indice do novo atributo se for novo
				
				atributos[newIdx].nome = nome; // Nome do novo atributo
				atributos[newIdx].posX = x; //posX do novo atributo
				atributos[newIdx].posY = y; //posY do novo atributo
				atributos[newIdx].campoCor = cor; //cor do novo atributo no formulario
				atributos[newIdx].campoTipo = tipo; //tipo do novo atributo no formulario
			}
		}

	}
	
	/**
	 * Monta o formul√°rio de acordo com os atributos definidos do Personagem.
	 */
	public void montaFormulario()
	{
		
	}
}
