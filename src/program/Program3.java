package program;

import java.util.Locale;
import java.util.Scanner;

import classes.Estudante;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante Estudante = new Estudante();
		
		System.out.print("Nome: ");
		Estudante.name = sc.nextLine();
		Estudante.nota1 = sc.nextDouble();
		Estudante.nota2 = sc.nextDouble();
		Estudante.nota3 = sc.nextDouble();

		
		System.out.println("Nota Final: " + Estudante.notaFinal());
			if(Estudante.notaFinal() < 60.0) {
				System.out.println("PERDEU PERDEDOR!!!");
				System.out.println("Faltam: " + Estudante.notaFaltante());
			} else {
				System.out.println("PASSOU!!!");
			}
		
		sc.close();	
	}

}