package estruturaSequencial;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/* Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma 
		 * mensagem explicativa, conforme exemplos.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int X, Y, soma;
		
		System.out.println("Digite o 1� N�: ");
		X = leia.nextInt();
		System.out.println("Digite o 2� N�: ");
		Y = leia.nextInt();
		
		soma = X + Y;
		
		System.out.println("A Soma de X e Y � de: " +soma);
	}
}
