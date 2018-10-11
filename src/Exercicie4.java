import java.util.Scanner;

public class Exercicie4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro:");
		int valor = sc.nextInt();
		
		
		
		while (valor != 0) {
			int total = valor * valor;
			System.out.println(total);
			System.out.println("Digite um novo valor inteiro:");
			valor = sc.nextInt();
		}	
		
		sc.close();
		
		
		
	}

}
