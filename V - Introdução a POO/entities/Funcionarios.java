package entidades;

public class Funcionarios {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double percentual) {
		salarioBruto += salarioBruto * percentual / 100;
	}
	
	public String toString() {
		return "Funcionário - " + nome + "\n"
				+ String.format("Salário Liquido - R$%.2f", salarioLiquido());
	}
	
}
