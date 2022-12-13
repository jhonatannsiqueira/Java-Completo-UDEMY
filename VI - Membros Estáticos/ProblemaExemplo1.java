package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo1 {

	// Por padr�o, as Constantes s�o escritas com letras MAIUSCULAS.
	public static final double PI = 3.14159; // final atribui que o valor � Constante e imut�vel.

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um valor num�rico qualquer, e da� mostrar quanto
		 * seria o valor de uma circunfer�ncia e do volume de uma esfera para um raio
		 * daquele valor. Informar tamb�m o valor de PI com duas casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o Valor do Raio: ");
		double raio = leia.nextDouble();
		double c = circunferencia(raio);
		double v = volume(raio);

		System.out.printf("Circunfer�ncia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", PI);

		leia.close();

	}
	
	// Usa-se os static nos M�todos, pois o M�todo main n�o aceita uma Fun��o/M�todo que n�o seja static
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
	}

}
