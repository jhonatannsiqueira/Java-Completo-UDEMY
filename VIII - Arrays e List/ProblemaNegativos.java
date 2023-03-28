package vetores;

import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos N° deseja Inserir? ");
		int n = leia.nextInt();
		int vetor[] = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um N°: ");
			vetor[i] = leia.nextInt();
		}

		System.out.println("Números Negativos: ");

		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}

	}

}
