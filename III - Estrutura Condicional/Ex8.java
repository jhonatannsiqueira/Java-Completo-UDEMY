package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
		 * pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados 
		 * em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. 
		 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, 
		 * calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double salario = 0, imposto = 0;
		
		System.out.println("Informe o seu Salário: ");
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
			System.out.printf("O Imposto a ser deduzido é de R$ %.2f", imposto);
		}
	}
}
