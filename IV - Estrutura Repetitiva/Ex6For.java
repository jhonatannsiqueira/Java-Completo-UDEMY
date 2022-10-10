package estruturaRepetitiva;

import java.util.Scanner;

public class Ex6For {

	public static void main(String[] args) {

		// Ler um número inteiro N e calcular todos os seus divisores.

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com um Nº: ");
		int n = leia.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println("Resultados: " + i);
			}
		}

	}

}
