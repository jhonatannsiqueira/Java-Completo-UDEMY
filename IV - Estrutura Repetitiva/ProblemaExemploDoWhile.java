package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploDoWhile {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
		 * digite "s", repetir o programa. FORMULA: F = 9.0 * C / 5 + 32
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char resp;
		do {
			System.out.println("Digite a Temperatura em Celsius: ");
			double c = leia.nextDouble();
			double f = 9.0 * c / 5 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir (s/n)? ");
			resp = leia.next().charAt(0);
		} while (resp != 'n');
		
		System.out.println("Finalizado.");
	}

}
