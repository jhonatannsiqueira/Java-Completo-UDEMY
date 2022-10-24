package entidades;

public class Retangulo {

	public double largura, altura;

	public double valorArea() {
		return largura * altura;
	}

	public double valorPerimetro() {
		return (largura + altura) * 2;
	}

	public double valorDiagonal() {
		return Math.sqrt(Math.pow(largura, 2.0) + Math.pow(altura, 2.0));
	}

}
