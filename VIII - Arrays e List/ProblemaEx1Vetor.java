package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaEx1Vetor {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um N° de Pessoas: ");
		int n = leia.nextInt();
		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Informe a Altura: ");
			vetor[i] = leia.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}

		double media = soma / n;

		System.out.printf("A Média de Altura é: %.2f%n", media);
		
		leia.close();

	}

}
