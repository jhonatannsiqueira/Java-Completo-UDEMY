package estruturaCondicional;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Entre com um N�: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O N� " + num + " � PAR!!");
		}
		else {
			System.out.println("O N� " + num + " � �MPAR!!");
		}
	}
}
