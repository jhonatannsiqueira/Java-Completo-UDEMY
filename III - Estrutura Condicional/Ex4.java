package estruturaCondicional;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
		 * sabendo que o mesmo pode começar em um dia e terminar em outro, 
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.  
		 */
		
		Scanner leia = new Scanner(System.in);
		int horaInicial, horaFinal, totalJogo;
		
		System.out.println("Informe o Horário Inicial do Jogo: ");
		horaInicial = leia.nextInt();
		System.out.println("Informe o Horário Final do Jogo: ");
		horaFinal = leia.nextInt();
		
		if(horaInicial < horaFinal) {
			totalJogo = horaFinal - horaInicial;
		}
		else {
			totalJogo = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O Jogo " + totalJogo + " Horas!!");
	}
}
