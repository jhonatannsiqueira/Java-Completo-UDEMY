package estruturaCondicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Entre com um Nº: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O Nº " + num + " é PAR!!");
		}
		else {
			System.out.println("O Nº " + num + " é ÍMPAR!!");
		}
	}
}
