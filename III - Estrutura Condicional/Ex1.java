package estruturaCondicional;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

		Scanner leia = new Scanner(System.in);
		int num;

		System.out.println("Entre com um N�: ");
		num = leia.nextInt();

		if (num < 0) {
			System.out.println("O N� " + num + " � NEGATIVO!!");
		} else {
			System.out.println("O N� " + num + " � POSITIVO!!");
		}
	}
}
