package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
		 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
		 * e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
		double valorPeca1, valorPeca2,quantPeca1, quantPeca2, totalPago;
		
		System.out.println("Entre com o Código da Peça 1: ");
		codigoPeca1 = leia.nextInt();
		System.out.println("Informe o Nº de Peças 1: ");
		numeroPeca1 = leia.nextInt();
		System.out.println("Informe o Valor Unitário da Peça 1: ");
		valorPeca1 = leia.nextDouble();
		
		System.out.println("\nEntre com o Código da Peça 2: ");
		codigoPeca2 = leia.nextInt();
		System.out.println("Informe o Nº de Peças 2: ");
		numeroPeca2 = leia.nextInt();
		System.out.println("Informe o Valor Unitário da Peça 2: ");
		valorPeca2 = leia.nextDouble();
		
		quantPeca1 = numeroPeca1 * valorPeca1;
		quantPeca2 = numeroPeca2 * valorPeca2;
		totalPago = quantPeca1 + quantPeca2;
		
		System.out.printf("\nO Total a ser Pago é de R$ %.2f ", totalPago);
	}
}
