package poo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;

public class Ex2 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
		 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
		 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
		 * Use a classe projetada abaixo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Funcionarios funcionarios = new Funcionarios();
		
		System.out.println("Informe o Nome do Funcionário: ");
		funcionarios.nome = leia.next();
		System.out.println("Informe o Salário Bruto: ");
		funcionarios.salarioBruto = leia.nextDouble();
		System.out.println("Valor a ser Tributado: ");
		funcionarios.imposto = leia.nextDouble();
		
		System.out.println(funcionarios);
		
		System.out.println("\nEscolha um Percentual de AUMENTO DE SALÁRIO: ");
		double percentual = leia.nextDouble();
		funcionarios.aumentoSalario(percentual);
		
		System.out.println("Salário Atualizado: R$" + funcionarios);

	}

}
