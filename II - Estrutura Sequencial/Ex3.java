package estruturaSequencial;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
		 * calcule e mostre a diferen�a do produto de A e B pelo produto de C e D 
		 * segundo a f�rmula: DIFERENCA = (A * B - C * D). 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Entre com o 1� N�: ");
		A = leia.nextInt();
		System.out.println("Entre com o 2� N�: ");
		B = leia.nextInt();
		System.out.println("Entre com o 3� N�: ");
		C = leia.nextInt();
		System.out.println("Entre com o 4� N�: ");
		D = leia.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("A Diferen�a � de: " +diferenca);
	}
}
