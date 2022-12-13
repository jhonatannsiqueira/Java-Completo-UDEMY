package entidades;

public class Estudantes {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double mediaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double mediaFaltante() {
		return 60.00 - mediaFinal();
	}

}
