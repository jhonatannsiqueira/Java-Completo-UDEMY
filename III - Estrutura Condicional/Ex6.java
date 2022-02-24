package estruturaCondicional;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo 
		 * em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		 * Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.  
		 */
		
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.println("Entre com um Nº: ");
		num = leia.nextDouble();
		
		if(num < 0 || num > 100) {
			System.out.println("Fora dos Intervalos!!");
		}
		else if(num <= 25) {
			System.out.println("O Valor se encontra dentro do Intervalo de [0,25].");
		}
		else if(num <= 50) {
			System.out.println("O Valor se encontra dentro do Intervalo de [25,50].");
		}
		else if(num <= 75) {
			System.out.println("O Valor se encontra dentro do Intervalo de [50,75].");
		}
		else {
			System.out.println("O Valor se encontra dentro do Intervalo de [75,100].");
		}
	}
}
