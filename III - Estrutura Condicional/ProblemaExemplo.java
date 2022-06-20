package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {

	public static void main(String[] args) {

		/* Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí mostrar o valor a ser pago.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		int minutos = 0;
		double conta = 50.0;

		System.out.println("Informe o Total de Minutos: ");
		minutos = leia.nextInt();
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}

		System.out.printf("O Valor da Conta é de R$ %.2f", conta);
	}
}
