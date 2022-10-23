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
		this.quantidadeEstoque += quantidadeEstoque; // this é uma palavra reservada que significa uma autoreferencia ao Objeto, não o confundindo com o Parametro utilizado na Função
	}
	
	public void removerProduto(int quantidadeEstoque) {
		this.quantidadeEstoque -= quantidadeEstoque;
	}
	
	public String toString() { //toString é nativo da Object, no caso eu o usei como uma Mascara de Formatação
		return String.format("Console: %s%n", nome)
				+ String.format("Custa R$%.2f%n", preco)
				+ String.format("Quantidade em Estoque: %d%n", quantidadeEstoque)
				+ String.format("$$$ deste Produto em Estoque: R$%.2f%n", valorTotalEmEstoque());
	}

}
