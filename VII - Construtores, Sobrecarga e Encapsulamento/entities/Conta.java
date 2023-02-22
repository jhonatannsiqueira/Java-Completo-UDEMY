package entidades;

public class Conta {

	private int numero;
	private String titularConta;
	private double saldo;

	public Conta(int numero, String titularConta) {
		this.numero = numero;
		this.titularConta = titularConta;
	}

	public Conta(int numero, String titularConta, double depositoInicial) {
		this.numero = numero;
		this.titularConta = titularConta;
		deposito(depositoInicial);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void sacar(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "\nConta: "
				+ numero
				+ "\nTitular da Conta: Sr(a)"
				+ titularConta
				+ String.format("Saldo: R$%.2f%n", saldo);
	}

}
