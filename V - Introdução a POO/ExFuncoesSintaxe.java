package inicialFuncoes;

import java.util.Scanner;

public class ExFuncoesSintaxe {

	public static void main(String[] args) {

		// Criar uma Função que mostrará o MAIOR entre os 3 Nº.

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com 3 Nº: ");
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
		System.out.println("O MAIOR VALOR É: " + valor);
	} // void não tem return - Essa Função foi criada apenas para Imprimir

}
