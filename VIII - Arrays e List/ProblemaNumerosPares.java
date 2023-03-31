package vetores;

import java.util.Scanner;

public class ProblemaNumerosPares {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos N° deseja inserir? ");
		int n = leia.nextInt();
		int vetor[] = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um N°: ");
			vetor[i] = leia.nextInt();
		}

		int vContadora = 0;

		System.out.println("Números Pares: ");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				vContadora++;
			}
		}

		System.out.println("\nQuantidade de Pares: " + vContadora);

	}

}
