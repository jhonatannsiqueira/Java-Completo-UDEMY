package vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantas Pessoas deseja inserir? ");
		int n = leia.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "ª Pessoa:");
			System.out.println("Nome: ");
			nome[i] = leia.next();
			System.out.println("Idade: ");
			idade[i] = leia.nextInt();
			System.out.println("Altura: ");
			altura[i] = leia.nextDouble();
		}

		double soma = 0.0;

		for (int i = 0; i < n; i++) {
			soma += altura[i];
		}

		double mediaAltura = soma / n;

		System.out.printf("Altura Média: %.2f%n", mediaAltura);

		int vCount = 0;

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				vCount++;
			}
		}

		double percentual = vCount * 100.0 / n;

		System.out.printf("O Percentual de Pessoas com - de 16 é de: %.1f%%%n", percentual);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}

		}

	}

}
