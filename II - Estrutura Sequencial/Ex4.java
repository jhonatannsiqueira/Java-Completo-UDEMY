package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		/* Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, 
		 * mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numeroFuncionario, horasTrabalhadas, valorHora, salario;
		
		System.out.println("Entre com o C�digo do Funcion�rio: ");
		numeroFuncionario = leia.nextDouble();
		System.out.println("Informe o N� de Horas Trabalhadas: ");
		horasTrabalhadas = leia.nextDouble();
		
		valorHora = 145.00;
		salario = horasTrabalhadas * valorHora;
		
		System.out.printf("O Sal�rio do Funcion�rio N� %.0f � de R$ %.2f ", numeroFuncionario, salario);
	}
}
