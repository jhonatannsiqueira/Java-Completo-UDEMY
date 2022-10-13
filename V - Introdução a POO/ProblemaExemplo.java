package poo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {

		// Resolvendo um problema sem Orienta��o a Objetos
		/*
		 * Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y
		 * (suponha medidas v�lidas). Em seguida, mostrar o valor das �reas dos dois
		 * tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea. A f�rmula
		 * para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b
		 * e c � a seguinte (f�rmula de Heron):
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

		System.out.printf("�rea do Triangulo X : %.4f%n", areaX);
		System.out.printf("�rea do Triangulo X : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O Triangulo X � o MAIOR.");
		} else {
			System.out.println("O Triangulo Y � o MAIOR.");
		}

	}

}
