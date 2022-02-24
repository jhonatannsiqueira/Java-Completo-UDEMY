package estruturaCondicional;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

		Scanner leia = new Scanner(System.in);
		int num;

		System.out.println("Entre com um Nº: ");
		num = leia.nextInt();

		if (num < 0) {
			System.out.println("O Nº " + num + " é NEGATIVO!!");
		} else {
			System.out.println("O Nº " + num + " é POSITIVO!!");
		}
	}
}
