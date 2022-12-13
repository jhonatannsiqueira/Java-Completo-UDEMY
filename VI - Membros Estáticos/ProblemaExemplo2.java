package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class ProblemaExemplo2 {

	public static void main(String[] args) {

		// Utilizando o Princ�pio do Reaproveitamento e Delega��o

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Calculadora calculadora = new Calculadora();
		System.out.println("Informe o Valor do Raio: ");
		calculadora.raio = leia.nextDouble();

		System.out.printf("Circunfer�ncia: %.2f%n", calculadora.circunferencia());
		System.out.printf("Volume: %.2f%n", calculadora.volume());
		System.out.printf("Valor de PI: %.2f%n", calculadora.PI);

		leia.close();
	}
}
