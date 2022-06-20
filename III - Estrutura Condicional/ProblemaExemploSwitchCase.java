package estruturaCondicional;

import java.util.Scanner;

public class ProblemaExemploSwitchCase {

	public static void main(String[] args) {

		/* Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o
		 * dia da semana correspondente, conforme exemplos.
		 */

		Scanner leia = new Scanner(System.in);

		int x;
		String dia;

		System.out.println("Entre com um Nº da Semana: ");
		x = leia.nextInt();

		switch (x) {
		case 1:
			dia = "Domingo :S";
			break;
		case 2:
			dia = "Segunda :(";
			break;
		case 3:
			dia = "Terça...";
			break;
		case 4:
			dia = "Quarta - Dia de Futebol!!";
			break;
		case 5:
			dia = "Quinta...";
			break;
		case 6:
			dia = "Sextooooouuuuu!!!";
			break;
		case 7:
			dia = "Sabado :)";
			break;
		default:
			dia = "Inválido!";
		}

		System.out.println("Hoje é " + dia);
	}
}
