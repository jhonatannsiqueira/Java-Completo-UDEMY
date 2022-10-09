package estruturaRepetitiva;

import java.util.Scanner;

public class Ex5For {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com um Nº: ");
		int n = leia.nextInt();

		int fatorial = 1;

		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}

		System.out.println("O Valor do Fatorial de N é: " + fatorial);		
	}

}
