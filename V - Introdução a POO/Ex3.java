package poo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudantes;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
		 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
		 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
		 * também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
		 * quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é
		 * 60% da nota). Você deve criar uma classe Student para resolver este problema.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Estudantes estudantes = new Estudantes();
		System.out.println("Informe o Nome do Aluno: ");
		estudantes.nome = leia.next();
		System.out.println("Informa a 1ª Nota: ");
		estudantes.nota1 = leia.nextDouble();
		System.out.println("Informa a 2ª Nota: ");
		estudantes.nota2 = leia.nextDouble();
		System.out.println("Informa a 3ª Nota: ");
		estudantes.nota3 = leia.nextDouble();

		if (estudantes.mediaFinal() >= 60.00) {
			System.out.printf("Sua Média Final é %.2f \nAprovado!!", estudantes.mediaFinal());
		} else {
			System.out.printf("Sua Média Final é %.2f \nReprovado :/\nPontos necessário para Aprovação: %.2f",
					estudantes.mediaFinal(), estudantes.mediaFaltante());
		}

	}

}
