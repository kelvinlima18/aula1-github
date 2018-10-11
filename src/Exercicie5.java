import java.util.Locale;
import java.util.Scanner;

public class Exercicie5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de alunos: ");
		int alunos = sc.nextInt();
		while (alunos <= 0) {
			System.out.println("Digite um valor valido: ");
			alunos = sc.nextInt();
		}
		
		for (int i = 1;i <= alunos;i++) {
			System.out.print("Aluno #" + i + ":");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double total = n1 + n2 + n3;
			
			System.out.println("Nota Final: " + total);
		}
		
		sc.close();
		
	}

}
