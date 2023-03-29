package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaSomaVetor {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * m�dia dos elementos do vetor
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos N� deseja Inserir? ");
		int n = leia.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um N�: ");
			vetor[i] = leia.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / n;

		System.out.print("Valores = ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}

		System.out.printf("\nSoma = %.2f%n", soma);
		System.out.printf("M�dia = %.2f%n", media);

	}

}
