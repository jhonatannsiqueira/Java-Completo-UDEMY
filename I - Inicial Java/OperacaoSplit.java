package inicialJava;

public class OperacaoSplit {

	public static void main(String[] args) {

		/*
		 * Operação Split: Serve para recortar uma String onde há separação por ESPAÇOS
		 * e armazendar dentro de uma outra Variável, gerando um Vetor com as partes
		 * informadas.
		 */

		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		/*
		 * String word1 = vect[0];
		 * String word2 = vect[1];
		 * String word3 = vect[2];
		 */
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
