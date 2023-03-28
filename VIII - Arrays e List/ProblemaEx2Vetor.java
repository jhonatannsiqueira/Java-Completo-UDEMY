package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoVetor;

public class ProblemaEx2Vetor {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um n�mero inteiro N e os dados (nome e pre�o) de N
		 * Produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o pre�o
		 * médio dos produtos.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe a Quantidade a ser Estocada: ");
		int n = leia.nextInt();
		ProdutoVetor[] vetor = new ProdutoVetor[n];

		for (int i = 0; i < vetor.length; i++) {
			leia.nextLine();
			System.out.println("Informe o Nome do Produto: ");
			String nome = leia.nextLine();
			System.out.println("Informe o Pre�o do Produto: ");
			double preco = leia.nextDouble();
			vetor[i] = new ProdutoVetor(nome, preco);
		}

		double soma = 0.0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("O Pre�o M�dio dos Produtos � R$%.2f%n", media);

		leia.close();
	}

}
