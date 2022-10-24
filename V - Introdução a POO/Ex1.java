package poo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler os valores da largura e altura de um retângulo. 
		 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
		 * Usar uma classe como mostrado no projeto ao lado.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a Largura do Retângulo: ");	
		retangulo.largura = leia.nextDouble();
		System.out.println("Entre com a Altura do Retângulo: ");	
		retangulo.altura = leia.nextDouble();
		
		System.out.println("Área do Retângulo = " + retangulo.valorArea() + "\n"
				+ "Perimetro do Retângulo: " + retangulo.valorPerimetro() + "\n"
				+ "Diágonal do Retângulo: " + retangulo.valorDiagonal());

	}

}
