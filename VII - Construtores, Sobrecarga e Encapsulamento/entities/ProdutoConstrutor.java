package entidades;

public class ProdutoConstrutor {

	public String nome;
	public double preco;
	public int quantidadeEstoque;
	
	// O Construtor recebe o nome da Classe
	public ProdutoConstrutor(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public double valorTotalEmEstoque() {
		return preco * quantidadeEstoque;
	}

	public void addProduto(int quantidadeEstoque) {

		this.quantidadeEstoque += quantidadeEstoque;
	}

	public void removerProduto(int quantidadeEstoque) {
		this.quantidadeEstoque -= quantidadeEstoque;
	}

	public String toString() {
		return String.format("Console: %s%n", nome) + String.format("Custa R$%.2f%n", preco)
				+ String.format("Quantidade em Estoque: %d%n", quantidadeEstoque)
				+ String.format("$$$ deste Produto em Estoque: R$%.2f%n", valorTotalEmEstoque());
	}

}
