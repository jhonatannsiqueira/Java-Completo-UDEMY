package vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades.Locador;

public class ProblemaPensionato {

	public static void main(String[] args) {

		/*
		 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
		 * esses quartos identificados pelos números 0 a 9.
		 * 
		 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia
		 * uma quantidade N representando o número de estudantes que vão alugar quartos
		 * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para
		 * cada registro de aluguel, informar o nome e email do estudante, bem como qual
		 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto
		 * vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do
		 * pensionato, por ordem de quarto, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Locador[] vetor = new Locador[10];

		System.out.println("Quantos Quarto serão Alugados? ");
		int n = leia.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(); // Quebra de Linha
			System.out.println("Locador #" + i + ":");
			leia.nextLine();
			System.out.println("Nome: ");
			String nome = leia.nextLine();
			System.out.println("E-mail: ");
			String email = leia.next();
			System.out.println("Quarto: ");
			int numQuarto = leia.nextInt();

			vetor[numQuarto] = new Locador(nome, email);
		}
		
		System.out.println(); // Quebra de Linha
		System.out.println("Quartos Ocupados: ");
		
		for (int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		leia.close();

	}

}