package poo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {

		// Resolvendo um problema sem Orientação a Objetos
		/*
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
		 * triângulos e dizer qual dos dois triângulos possui a maior área. A fórmula
		 * para calcular a área de um triângulo a partir das medidas de seus lados a, b
		 * e c é a seguinte (fórmula de Heron):
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC;

		System.out.println("Entre com os 3 Lados de X: ");
		xA = leia.nextDouble();
		xB = leia.nextDouble();
		xC = leia.nextDouble();
		System.out.println("Entre com os 3 Lados de Y: ");
		yA = leia.nextDouble();
		yB = leia.nextDouble();
		yC = leia.nextDouble();

		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Área do Triangulo X : %.4f%n", areaX);
		System.out.printf("Área do Triangulo X : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O Triangulo X é o MAIOR.");
		} else {
			System.out.println("O Triangulo Y é o MAIOR.");
		}

	}

}
