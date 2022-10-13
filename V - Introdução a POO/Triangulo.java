package entidades; // Pacote da Classe

public class Triangulo { // Nome da Classe

	// Criando uma classe com tr�s atributos para representar melhor o Tri�ngulo.
	// Classe � um tipo ESTRUTURADO que pode conter membros (ATRIBUTOS e M�TODOS).
	// Classe � a defini��o do tipo;
	
	// Prefixo public indica que o Atributo ou M�todo pode ser usado em outros arquivos
	public double a;
	public double b; // a, b, c s�o os Atributos da Classe 
	public double c;
	
	
	/* 
	 * double indica o tipo de dado que o M�todo retorna.
	 * OBS: Se o M�todo n�o retorna nada, usa-se a palavra "void" - Igual fiz na Fun��o "mostrarResult para Imprimir
	*/
	public double area() { // N�o recebe Parametros, pois os mesmos j� constam na Classe
		double p = (a + b + c) / 2.0; // Indica que estou trabalhando com os Atributos da Classe
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		/*
		 * double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
		 * return resultado;
		 */
	}

}
