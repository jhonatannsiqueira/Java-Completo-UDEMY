package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		/* Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
		 * pois sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados 
		 * em benef�cio da popula��o, sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$. 
		 * Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, 
		 * calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double salario = 0, imposto = 0;
		
		System.out.println("Informe o seu Sal�rio: ");
		salario = leia.nextDouble();
		
		if(salario <= 2000) {
			imposto = 0;
		}
		else if(salario <= 3000) {
			imposto = salario * 0.08;
		}
		else if(salario <= 4500) {
			imposto = salario * 0.18;
		}
		else {
			imposto = salario * 0.28;
		}
		
		if(imposto == 0) {
			System.out.println("Isento de Imposto!!");
		}
		else {
			System.out.printf("O Imposto a ser deduzido � de R$ %.2f", imposto);
		}
	}
}
