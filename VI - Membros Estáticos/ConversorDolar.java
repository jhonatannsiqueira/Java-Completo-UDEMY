package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoeda;

public class ConversorDolar {
	
	public static void main(String[] args) {

		/*
		 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF
		 * sobre o valor em d�lar. Criar uma classe CurrencyConverter para ser
		 * respons�vel pelos c�lculos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("A Cota��o ATUAL do D�lar: ");
		double precoDolar = leia.nextDouble();
		System.out.println("Quantos D�lares voc� deseja Comprar? ");
		double compra = leia.nextDouble();
		double cvs = ConversorMoeda.conversor(precoDolar, compra);
		System.out.printf("O Valor a ser PAGO em Reais � de: R$%.2f", cvs);				
		
		leia.close();

	}

}
