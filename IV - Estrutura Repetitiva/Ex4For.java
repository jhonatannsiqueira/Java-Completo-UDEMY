package estruturaRepetitiva;

import java.util.Scanner;

public class Ex4For {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o um Nº de Repetições: ");
		int n = leia.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nInforme o Valor de X: ");
			int x = leia.nextInt();
			System.out.println("Informe o Valor de Y: ");
			int y = leia.nextInt();

			if (y == 0) {
				System.out.println("Divisão IMPOSSÍVEL!!");
			} else {
				double div = (double) x / y;
				System.out.printf("O valor de X / por Y é de: %.1f%n", div);
			}
		}

	}

}
