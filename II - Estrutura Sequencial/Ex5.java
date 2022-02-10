package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
		 * o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 
		 * e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
		double valorPeca1, valorPeca2,quantPeca1, quantPeca2, totalPago;
		
		System.out.println("Entre com o C�digo da Pe�a 1: ");
		codigoPeca1 = leia.nextInt();
		System.out.println("Informe o N� de Pe�as 1: ");
		numeroPeca1 = leia.nextInt();
		System.out.println("Informe o Valor Unit�rio da Pe�a 1: ");
		valorPeca1 = leia.nextDouble();
		
		System.out.println("\nEntre com o C�digo da Pe�a 2: ");
		codigoPeca2 = leia.nextInt();
		System.out.println("Informe o N� de Pe�as 2: ");
		numeroPeca2 = leia.nextInt();
		System.out.println("Informe o Valor Unit�rio da Pe�a 2: ");
		valorPeca2 = leia.nextDouble();
		
		quantPeca1 = numeroPeca1 * valorPeca1;
		quantPeca2 = numeroPeca2 * valorPeca2;
		totalPago = quantPeca1 + quantPeca2;
		
		System.out.printf("\nO Total a ser Pago � de R$ %.2f ", totalPago);
	}
}
