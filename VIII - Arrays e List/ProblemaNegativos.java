package vetores;

import java.util.Scanner;

public class ProblemaNegativos {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois
		 * N n�meros inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os n�meros negativos lidos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos N� deseja Inserir? ");
		int n = leia.nextInt();
		int vetor[] = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um N�: ");
			vetor[i] = leia.nextInt();
		}

		System.out.println("N�meros Negativos: ");

		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}

	}

}
