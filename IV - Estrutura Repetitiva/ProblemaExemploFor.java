package estruturaRepetitiva;

import java.util.Scanner;

public class ProblemaExemploFor {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final
		 * mostra a soma dos n�meros lidos.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o N� de Repeti��es: ");
		int n = leia.nextInt();
		int soma = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite um N�: ");
			int x = leia.nextInt();
			soma += x;
		}

		System.out.println("A Soma das Repeti��es �: " + soma);
	}
}
