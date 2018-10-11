import java.util.Scanner;

public class Exercicie3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int begin = n1, end = n2;
		
		if (n2 > n1) {
			n2 = begin;
			n1 = end;
		}
		
		int soma = 0;
		
		for (int i = begin;i <= end;i++) {
			if (i % 2 != 0) {
				soma += i;
			}
			
		}
		
		
		System.out.println("O Resultado é " + soma);
		
		sc.close();
		
		
	}

}
