package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		/* Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro 
		 * casas decimais conforme exemplos.
		 * F�rmula da �rea: area = pi . raio2
		 * Considere o valor de pi = 3.14159 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		System.out.println("Informe o Valor do Raio: ");
		R = leia.nextDouble();
		
		A = pi * Math.pow(R, 2);
		
		System.out.printf("A �rea do C�rculo equivale � %.4f: ", A);
	}
}
