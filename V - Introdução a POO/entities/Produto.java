package entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidadeEstoque;
	
	public double valorTotalEmEstoque() {
		return preco * quantidadeEstoque;
	}
	
	// int quantidadeEstoque refere-se ao Parametro da Função
	public void addProduto(int quantidadeEstoque) { // Essa operação não retorna nada, apenas altera o valor do Atributo quanidadeEstoque
		this.quantidadeEstoque += quantidadeEstoque; // this é uma palavra reservada que significa uma autoreferencia ao Objeto
	}
	
	public void removerProduto(int quantidadeEstoque) {
		this.quantidadeEstoque -= quantidadeEstoque;
	}

}
