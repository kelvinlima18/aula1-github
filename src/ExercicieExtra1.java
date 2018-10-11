import java.util.Scanner;

public class ExercicieExtra1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome e idade:");
		char name1 = sc.next().charAt(0);
		int idade1 = sc.nextInt();
		char name2 = sc.next().charAt(0);
		int idade2 = sc.nextInt();
		char name3 = sc.next().charAt(0);
		int idade3 = sc.nextInt();
		
		
		if (idade1 > idade2 && idade1 < idade3 && idade2 > idade3) {
			System.out.println("Mais Velho: " + name1);
			System.out.println("Mais Novo: " + name3);
		} else if (idade2 > idade1 && idade2 < idade3 && idade3 > idade1) {
			System.out.println("Mais Velho: " + name2);
			System.out.println("Mais Novo: " + name1);
		} else {
			System.out.println("Mais Velho: " + name3);
			System.out.println("Mais Novo: " + name2);
		}
		
		sc.close();
		
		
		
		
	}

}
