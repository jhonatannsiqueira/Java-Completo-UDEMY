package estruturaRepetitiva;

import java.util.Scanner;

public class Ex1For {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor
		 * por linha, inclusive o X, se for o caso.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com um Nº Inteiro: ");
		int x = leia.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
