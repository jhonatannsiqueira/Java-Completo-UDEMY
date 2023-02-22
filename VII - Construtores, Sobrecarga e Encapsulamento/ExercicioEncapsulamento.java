package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class ExercicioEncapsulamento {

	public static void main(String[] args) {

		/*
		 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o
		 * n�mero da conta, o nome do titular da conta, e o valor de dep�sito inicial
		 * que o titular depositou ao abrir a conta. Este valor de dep�sito inicial,
		 * entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar
		 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
		 * inicial da conta ser�, naturalmente, zero. Importante: uma vez que uma conta
		 * banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome
		 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o
		 * de casamento, por exemplo). Por fim, o saldo da conta n�o pode ser alterado
		 * livremente. � preciso haver um mecanismo para proteger isso. O saldo s�
		 * aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada
		 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
		 * com saldo negativo se o saldo n�o for suficiente para realizar o saque e/ou
		 * pagar a taxa. Voc� deve fazer um programa que realize o cadastro de uma
		 * conta, dando op��o para que seja ou n�o informado o valor de dep�sito
		 * inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando
		 * os dados da conta ap�s cada opera��o.
		 */

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		Conta conta;

		System.out.println("Informe o N� da Conta: ");
		int numero = leia.nextInt();
		System.out.println("Informe o Nome do Titular da Conta: ");
		String nome = leia.next();
		System.out.println("Deseja fazer um Dep�sito Inicial? (S/N)");
		char resposta = leia.next().charAt(0);

		if (resposta == 'S') {
			System.out.println("Informe o Valor a ser Depositado: ");
			double depositoInicial = leia.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}

		System.out.println(conta.toString());

		System.out.println("Escolha uma Op��o entre 1 e 2 ou Digite 0 para Encerrar: ");
		int escolha = leia.nextInt();

		switch (escolha) {
		case 0:
			System.out.println("JNS Financial agracede sua preferencia!!");
			break;
		case 1:
			System.out.println("Entre com um Valor de Dep�sito: ");
			double valorDeposito = leia.nextDouble();
			conta.deposito(valorDeposito);
			System.out.println("Saldo Atualizado!");
			System.out.println(conta.toString());
			break;
		case 2:
			System.out.println("Informe o Valor de Saque: ");
			double valorSaque = leia.nextDouble();
			conta.sacar(valorSaque);
			System.out.println("Saldo Atualizado!");
			System.out.println(conta.toString());
			break;
		default:
			System.out.println("Op��o INV�LIDA!!");
		}

		leia.close();

	}

}
