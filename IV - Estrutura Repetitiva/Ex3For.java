package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex3For {

	public static void main(String[] args) {

		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com um Nº Inteiro: ");
		int n = leia.nextInt(); // Nº de VEZES em que o Laço irá rodar

		for (int i = 0; i < n; i++) {
			System.out.println("Informe a 1ª Nota: ");
			double a = leia.nextDouble();
			System.out.println("Informe a 2ª Nota: ");
			double b = leia.nextDouble();
			System.out.println("Informe a 3ª Nota: ");
			double c = leia.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			if (media < 6) {
				System.out.printf("Sua Média foi de %.1f - Reprovado :(%n", media);
			} else
				System.out.printf("Sua Média foi de %.1f - Aprovado :)%n", media);
		}
	}
}
