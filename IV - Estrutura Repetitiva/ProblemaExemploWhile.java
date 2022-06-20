package estruturaRepetitiva;

import java.util.Scanner;

public class ProblemaExemploWhile {

	public static void main(String[] args) {

		/* Fazer um programa que lê números inteiros até que um 0 seja lido. Ao final
		 * mostra a soma dos números lidos.
		 */

		Scanner leia = new Scanner(System.in);

		int x;
		int soma = 0;
		
		System.out.println("Entre com um Nº: ");
		x = leia.nextInt();
		while (x != 0) {
			soma += x;
			x = leia.nextInt();
		}
		
		System.out.println("A Soma dos Números é de: "+ soma);
	}
}
