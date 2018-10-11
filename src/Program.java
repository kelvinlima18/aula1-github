import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para darmos inicio ao sequencial: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.print("Digite um valor valido: ");
			n = sc.nextInt();			
		}
		
		
		int higher = Integer.MIN_VALUE;
		for (int i = 1;i <= n; i++) {
			System.out.print("Varlor #" + i + ": ");
			int x = sc.nextInt();
			
			if (x > higher) {
				higher = x;
				
			}
		}
		
		System.out.print("Resultado: " + higher);

		
		sc.close();
		
	     }
	}		


