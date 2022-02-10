package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		 * o valor que recebe por hora e calcula o salário desse funcionário. A seguir, 
		 * mostre o número e o salário do funcionário, com duas casas decimais. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numeroFuncionario, horasTrabalhadas, valorHora, salario;
		
		System.out.println("Entre com o Código do Funcionário: ");
		numeroFuncionario = leia.nextDouble();
		System.out.println("Informe o Nº de Horas Trabalhadas: ");
		horasTrabalhadas = leia.nextDouble();
		
		valorHora = 145.00;
		salario = horasTrabalhadas * valorHora;
		
		System.out.printf("O Salário do Funcionário Nº %.0f é de R$ %.2f ", numeroFuncionario, salario);
	}
}
