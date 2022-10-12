package inicialJava;

public class FuncoesParaString {

	public static void main(String[] args) {

		/*
		 * Formatar: toLowerCase(), toUpperCase(), trim()
		 * Recortar: substring(inicio),
		 * substring(inicio, fim) Dentro dos () ficam os Argumentos
		 * Substituir: Replace(char, char), Replace(string,
		 * string) 
		 * Buscar: IndexOf, LastIndexOf
		 */

		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-"); 
		System.out.println("toLowerCase: -" + s01 + "-"); // TUDO MINUSCULO
		System.out.println("toUpperCase: -" + s02 + "-"); // TUDO MAIUSCULO
		System.out.println("trim: -" + s03 + "-"); // REMOVE OS ESPAÇOS NO CANTO DA STRING
		System.out.println("substring(2): -" + s04 + "-"); // PEGA SOMENTE A PARTIR DO CARACTER NA POSIÇÃO 2
		System.out.println("substring(2, 9): -" + s05 + "-"); // PEGA A PARTIR DO 2 E ABAIXO DO CARACTER 9
		System.out.println("replace('a', 'x'): -" + s06 + "-"); // TROCA UM CARACTER POR OUTRO
		System.out.println("replace('abc', 'xy'): -" + s07 + "-"); // TROCA UMA PALAVRA POR OUTRA
		System.out.println("Index of 'bc': " + i); // PRIMEIRA OCORRENCIA - POSICAO 
		System.out.println("Last index of 'bc': " + j); // ULTIMA OCORRENCIA - POSICAO

	}

}
