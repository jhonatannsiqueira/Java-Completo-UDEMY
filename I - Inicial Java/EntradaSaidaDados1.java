package inicialJava;

import java.util.Locale;

public class EntradaSaidaDados1 {

	public static void main(String[] args) {
		
		String produto1 = "Computer";
		String produto2 = "Office Desk";
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double medir = 53.234567;
		
		Locale.setDefault(Locale.US);
		System.out.printf("O %s custa R$ %.2f", produto1, preco1);
		System.out.printf("\nO %s custa R$ %.2f", produto2, preco2);
		System.out.println("\n" +idade+ " anos de idade, com o Código de " +codigo+ " e Gênero " +genero);
		System.out.printf("\nR$ %.3f\n", medir);
	}
}
