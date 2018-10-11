package program;

import java.util.Locale;
import java.util.Scanner;

import classes.Conta;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Digite o numero da sua conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o seu nome: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Gostaria de fazer um deposito inicial? (s/n) ");
		char posicao = sc.next().charAt(0);
		
		if (posicao == 's') {
			System.out.print("Qual o valor do deposito inicial? ");
			double depositoSaldo = sc.nextDouble();
			conta = new Conta(number, name, depositoSaldo);
		}
		else {
			conta = new Conta(number, name);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um valor de deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);

		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com um valor de saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		sc.close();
		
	}

}
