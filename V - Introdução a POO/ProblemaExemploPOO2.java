package poo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class ProblemaExemploPOO2 {

	public static void main(String[] args) {

		// Criando um método para obtermos os benefícios de REAPROVEITAMENTO e DELEGAÇÃO.
		/*
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
		 * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
		 * triângulos e dizer qual dos dois triângulos possui a maior área. A fórmula
		 * para calcular a área de um triângulo a partir das medidas de seus lados a, b
		 * e c é a seguinte (fórmula de Heron):
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Triangulo x, y; // Variável do tipo classe
		x = new Triangulo(); // Deve ser Instanciada/Chamada para que seja criado o Objeto
		y = new Triangulo(); // <- Isso é um Objeto, pois é uma Instancia da Classe Triangulo

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

		System.out.printf("Área do Triangulo X : %.4f%n", areaX);
		System.out.printf("Área do Triangulo X : %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O Triangulo X é o MAIOR.");
		} else {
			System.out.println("O Triangulo Y é o MAIOR.");
		}

	}

}
