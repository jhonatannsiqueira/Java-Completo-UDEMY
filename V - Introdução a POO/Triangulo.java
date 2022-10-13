package entidades; // Pacote da Classe

public class Triangulo { // Nome da Classe

	// Criando uma classe com três atributos para representar melhor o Triângulo.
	// Classe é um tipo ESTRUTURADO que pode conter membros (ATRIBUTOS e MÉTODOS).
	// Classe é a definição do tipo;
	
	// Prefixo public indica que o Atributo ou Método pode ser usado em outros arquivos
	public double a;
	public double b; // a, b, c são os Atributos da Classe 
	public double c;
	
	
	/* 
	 * double indica o tipo de dado que o Método retorna.
	 * OBS: Se o Método não retorna nada, usa-se a palavra "void" - Igual fiz na Função "mostrarResult para Imprimir
	*/
	public double area() { // Não recebe Parametros, pois os mesmos já constam na Classe
		double p = (a + b + c) / 2.0; // Indica que estou trabalhando com os Atributos da Classe
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		/*
		 * double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 
		 * return resultado;
		 */
	}

}
