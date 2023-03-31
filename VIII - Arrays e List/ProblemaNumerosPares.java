package vetores;

import java.util.Scanner;

public class ProblemaNumerosPares {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os n�meros pares, e tamb�m a quantidade de
		 * n�meros pares.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos N� deseja inserir? ");
		int n = leia.nextInt();
		int vetor[] = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um N�: ");
			vetor[i] = leia.nextInt();
		}

		int vContadora = 0;

		System.out.println("N�meros Pares: ");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				vContadora++;
			}
		}

		System.out.println("\nQuantidade de Pares: " + vContadora);

	}

}
