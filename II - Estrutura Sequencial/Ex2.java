package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
		 * casas decimais conforme exemplos.
		 * Fórmula da área: area = pi . raio2
		 * Considere o valor de pi = 3.14159 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		System.out.println("Informe o Valor do Raio: ");
		R = leia.nextDouble();
		
		A = pi * Math.pow(R, 2);
		
		System.out.printf("A Área do Círculo equivale á %.4f: ", A);
	}
}
