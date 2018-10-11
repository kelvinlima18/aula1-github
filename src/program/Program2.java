package program;

import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario Funcionario = new Funcionario();
		
		System.out.print("Name: ");
		Funcionario.name = sc.nextLine();
		System.out.print("Salario: ");
		Funcionario.salariob = sc.nextDouble();
		System.out.print("TAX: ");
		Funcionario.tax = sc.nextDouble();
		
		System.out.println("Dados Funcionario: " + Funcionario);
		System.out.println("");
		
		System.out.print("Qual o percentual de aumento salarial? ");
		double porcentagem = sc.nextDouble();
		Funcionario.salariom(porcentagem);
		
		System.out.println("Dados Funcionario Atualizado: " + Funcionario);

		sc.close();

	}

}
