package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import util.CalculadoraEstaticos;

public class ProblemaExemplo3 {

	public static void main(String[] args) {

		/*
		 * Reaproveitamento, Delega��o e Membros Est�ticos N�o faz-se a Instancia��o do
		 * Objeto, usa-se a propria Classe para chamar o M�todo/Fun��o
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o Valor do Raio: ");
		double raio = leia.nextDouble();

		System.out.printf("Circunfer�ncia: %.2f%n", CalculadoraEstaticos.circunferencia(raio));
		System.out.printf("Volume: %.2f%n", CalculadoraEstaticos.volume(raio));
		System.out.printf("Valor de PI: %.2f%n", CalculadoraEstaticos.PI);

		leia.close();
	}
}
