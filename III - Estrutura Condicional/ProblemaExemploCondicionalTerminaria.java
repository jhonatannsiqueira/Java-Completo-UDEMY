package estruturaCondicional;

import java.util.Locale;

public class ProblemaExemploCondicionalTerminaria {

	public static void main(String[] args) {

		/* double preco = 34.5; double desconto;
		 * if(preco < 20.0) { desconto = preco * 0.1; } else { desconto = preco * 0.05;
		 * }
		 */
		
		Locale.setDefault(Locale.US);

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.printf("%.2f", desconto);
	}
}
