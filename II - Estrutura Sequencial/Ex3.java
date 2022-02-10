package estruturaSequencial;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D 
		 * segundo a fórmula: DIFERENCA = (A * B - C * D). 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Entre com o 1º Nº: ");
		A = leia.nextInt();
		System.out.println("Entre com o 2º Nº: ");
		B = leia.nextInt();
		System.out.println("Entre com o 3º Nº: ");
		C = leia.nextInt();
		System.out.println("Entre com o 4º Nº: ");
		D = leia.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("A Diferença é de: " +diferenca);
	}
}
