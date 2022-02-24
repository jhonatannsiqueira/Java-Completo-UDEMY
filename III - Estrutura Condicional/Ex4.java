package estruturaCondicional;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, 
		 * sabendo que o mesmo pode come�ar em um dia e terminar em outro, 
		 * tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.  
		 */
		
		Scanner leia = new Scanner(System.in);
		int horaInicial, horaFinal, totalJogo;
		
		System.out.println("Informe o Hor�rio Inicial do Jogo: ");
		horaInicial = leia.nextInt();
		System.out.println("Informe o Hor�rio Final do Jogo: ");
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
