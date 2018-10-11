package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario2;

public class Program10 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario2> list = new ArrayList<>();

		System.out.print("Quantos funcionários você irá registrar? ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + i + ": ");
			System.out.print("ID: ");
			int mat = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario2 (mat, nome, salario));
		}
		
		System.out.println();
		System.out.print("Digite o ID do funcionário que você deseja realizar o aumento: ");
		int mat = sc.nextInt();
		
		Funcionario2 emp = list.stream().filter(x -> x.getMat() == mat).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("Esse ID é invalido!");
		} else {
			sc.nextLine();
			System.out.print("Defina a porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			emp.aumento(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios:");
		for (Funcionario2 obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
