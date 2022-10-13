package poo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class ProblemaExemploPOO2 {

	public static void main(String[] args) {

		// Criando um m�todo para obtermos os benef�cios de REAPROVEITAMENTO e DELEGA��O.
		/*
		 * Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y
		 * (suponha medidas v�lidas). Em seguida, mostrar o valor das �reas dos dois
		 * tri�ngulos e dizer qual dos dois tri�ngulos possui a maior �rea. A f�rmula
		 * para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b
		 * e c � a seguinte (f�rmula de Heron):
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Triangulo x, y; // Vari�vel do tipo classe
		x = new Triangulo(); // Deve ser Instanciada/Chamada para que seja criado o Objeto
		y = new Triangulo(); // <- Isso � um Objeto, pois � uma Instancia da Classe Triangulo

		System.out.println("Entre com os 3 Lados de X: ");
		x.a = leia.nextDouble();
		x.b = leia.nextDouble();
		x.c = leia.nextDouble();
		System.out.println("Entre com os 3 Lados de Y: ");
		y.a = leia.nextDouble();
		y.b = leia.nextDouble();
		y.c = leia.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("�rea do Triangulo X : %.4f%n", areaX);
		System.out.printf("�rea do Triangulo X : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O Triangulo X � o MAIOR.");
		} else {
			System.out.println("O Triangulo Y � o MAIOR.");
		}

	}

}
