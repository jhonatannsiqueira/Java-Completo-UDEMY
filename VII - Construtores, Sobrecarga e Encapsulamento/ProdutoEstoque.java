package construtores;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoConstrutor;

public class ProdutoEstoque {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		 * quantidade no estoque). Em seguida: Mostrar os dados do produto (nome, preço,
		 * quantidade no estoque, valor total no estoque) Realizar uma entrada no
		 * estoque e mostrar novamente os dados do produto Realizar uma saída no estoque
		 * e mostrar novamente os dados do produto
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Informe um Produto: ");
		System.out.println("Nome: ");
		String nome = leia.nextLine(); // Variável Temporária
		System.out.println("Informe o Preço: ");
		double preco = leia.nextDouble();
		System.out.println("Informe a Quantidade: ");
		int quantidadeEstoque = leia.nextInt();
		ProdutoConstrutor produto = new ProdutoConstrutor(nome, preco, quantidadeEstoque);

		System.out.println(produto.toString()); // to String serve para converter o Objeto para String

		System.out.println("Escolha uma Opção entre 1 e 2 ou Digite 0 para Encerrar: ");
		int escolha = leia.nextInt();
		switch (escolha) {
		case 0:
			System.out.println("Jns Games agradece sua preferencia!!");
			break;
		case 1:
			System.out.println("Entre com um N° de Consoles para serem add ao Estoque: ");
			int quantidade = leia.nextInt();
			produto.addProduto(quantidade);
			System.out.println(produto.toString());
			break;
		case 2:
			System.out.println("Entre com um N° de Consoles para serem del do Estoque: ");
			quantidade = leia.nextInt();
			produto.removerProduto(quantidade);
			System.out.println(produto.toString());
			break;
		default:
			System.out.println("Opção INVÁLIDA!!");
		}
		
	}

}
