package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoeda;

public class ConversorDolar {
	
	public static void main(String[] args) {

		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a
		 * ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
		 * pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
		 * sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
		 * responsável pelos cálculos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("A Cotação ATUAL do Dólar: ");
		double precoDolar = leia.nextDouble();
		System.out.println("Quantos Dólares você deseja Comprar? ");
		double compra = leia.nextDouble();
		double cvs = ConversorMoeda.conversor(precoDolar, compra);
		System.out.printf("O Valor a ser PAGO em Reais é de: R$%.2f", cvs);				
		
		leia.close();

	}

}
