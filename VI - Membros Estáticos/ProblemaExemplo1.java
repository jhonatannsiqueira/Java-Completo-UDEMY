package membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo1 {

	// Por padrão, as Constantes são escritas com letras MAIUSCULAS.
	public static final double PI = 3.14159; // final atribui que o valor é Constante e imutável.

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto
		 * seria o valor de uma circunferência e do volume de uma esfera para um raio
		 * daquele valor. Informar também o valor de PI com duas casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o Valor do Raio: ");
		double raio = leia.nextDouble();
		double c = circunferencia(raio);
		double v = volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", PI);

		leia.close();

	}
	
	// Usa-se os static nos Métodos, pois o Método main não aceita uma Função/Método que não seja static
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
	}

}
