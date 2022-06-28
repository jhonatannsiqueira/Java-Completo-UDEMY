package estruturaRepetitiva;

import java.util.Scanner;

public class Ex2while {

	public static void main(String[] args) {

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o Valor de X: ");
		int x = leia.nextInt();
		System.out.println("Entre com o Valor de y: ");
		int y = leia.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} 
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} 
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} 
			else {
				System.out.println("Quarto");
			}
			System.out.println("\nEntre com o Valor de X: ");
			x = leia.nextInt();
			System.out.println("Entre com o Valor de y: ");
			y = leia.nextInt();
		}
	}
}
