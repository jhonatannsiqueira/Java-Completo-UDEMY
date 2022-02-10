package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		/* Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. 
		 * Em seguida, calcule e mostre:
		 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		 * b) a �rea do c�rculo de raio C. (pi = 3.14159)
		 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
		 * d) a �rea do quadrado que tem lado B.
		 * e) a �rea do ret�ngulo que tem lados A e B. 
		 * FEITO COM AUXILIO DA PLATAFORMA!!
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Entre com o Valor de A: ");
		A = leia.nextDouble();
		System.out.println("Entre com o Valor de B: ");
		B = leia.nextDouble();
		System.out.println("Entre com o Valor de C: ");
		C = leia.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * Math.pow(C, 2);
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
	}
}
