package program;

import java.util.Scanner;
import classes.Registros;

public class Program8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Registros[] vect = new Registros[10];
		
		System.out.print("Quantos quartos serão reservados? ");
		int n = sc.nextInt();
				
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Registro: #" + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();
			vect[quarto] = new Registros(nome, email);		
		}
		
		System.out.println("Quartos Ocupados");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + " : " + vect[i]);
			}
				
		}
		
		
		
		
		sc.close();
		
		
	}

}
