package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int codigo, quantidade;
		double valorPagar = 0;
		
		System.out.println("Informe a Código do Item: ");
		codigo = leia.nextInt();
		System.out.println("Informe a Quantidade do Item: ");
		quantidade = leia.nextInt();
		
		if(codigo == 1) {
			valorPagar = quantidade * 4.0;
		}
		else if(codigo == 2) {
			valorPagar = quantidade * 4.5;
		}
		else if(codigo == 3) {
			valorPagar = quantidade * 5.0;
		}
		else if(codigo == 4) {
			valorPagar = quantidade * 2.0;
		}
		else if(codigo == 5) {
			valorPagar = quantidade * 1.5;
		}
		else {
			System.out.println("Código Inexistente!!");
		}
		
		System.out.printf("O Valor Total é de R$ %.2f" , valorPagar);
	}
}
