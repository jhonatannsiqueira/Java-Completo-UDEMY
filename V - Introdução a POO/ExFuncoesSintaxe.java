package inicialFuncoes;

import java.util.Scanner;

public class ExFuncoesSintaxe {

	public static void main(String[] args) {

		// Criar uma Fun��o que mostrar� o MAIOR entre os 3 N�.

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com 3 N�: ");
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();

		int maior = max(a, b, c);

		mostrarResult(maior);
	}

	public static int max(int x, int y, int z) {
		int armazenar;

		if (x > y && x > z) {
			armazenar = x;
		} else if (y > z) {
			armazenar = y;
		} else {
			armazenar = z;
		}
		return armazenar;
	}

	public static void mostrarResult(int valor) { 
		System.out.println("O MAIOR VALOR �: " + valor);
	} // void n�o tem return - Essa Fun��o foi criada apenas para Imprimir

}
