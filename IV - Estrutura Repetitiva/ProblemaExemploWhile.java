package estruturaRepetitiva;

import java.util.Scanner;

public class ProblemaExemploWhile {

	public static void main(String[] args) {

		/* Fazer um programa que l� n�meros inteiros at� que um 0 seja lido. Ao final
		 * mostra a soma dos n�meros lidos.
		 */

		Scanner leia = new Scanner(System.in);

		int x;
		int soma = 0;
		
		System.out.println("Entre com um N�: ");
		x = leia.nextInt();
		while (x != 0) {
			soma += x;
			x = leia.nextInt();
		}
		
		System.out.println("A Soma dos N�meros � de: "+ soma);
	}
}
