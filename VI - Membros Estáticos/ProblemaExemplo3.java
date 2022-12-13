package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import util.CalculadoraEstaticos;

public class ProblemaExemplo3 {

	public static void main(String[] args) {

		/*
		 * Reaproveitamento, Delegação e Membros Estáticos Não faz-se a Instanciação do
		 * Objeto, usa-se a propria Classe para chamar o Método/Função
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o Valor do Raio: ");
		double raio = leia.nextDouble();

		System.out.printf("Circunferência: %.2f%n", CalculadoraEstaticos.circunferencia(raio));
		System.out.printf("Volume: %.2f%n", CalculadoraEstaticos.volume(raio));
		System.out.printf("Valor de PI: %.2f%n", CalculadoraEstaticos.PI);

		leia.close();
	}
}
