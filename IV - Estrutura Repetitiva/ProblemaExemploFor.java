package estruturaRepetitiva;

import java.util.Scanner;

public class ProblemaExemploFor {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que lê números inteiros até que um zero seja lido. Ao final
		 * mostra a soma dos números lidos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o Nº de Repetições: ");
		int n = leia.nextInt();
		int soma = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um Nº: ");
			int x = leia.nextInt();
			soma += x;
		}

		System.out.println("A Soma das Repetições é: " + soma);
	}
}
