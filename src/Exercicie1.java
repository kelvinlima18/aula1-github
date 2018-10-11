import java.util.Locale;
import java.util.Scanner;

public class Exercicie1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as notas do estudante: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double media;
        
		media = (n1+n2+n3)/3;
		
		if(media >= 60.00) {
			System.out.printf("Nota Final: %.2f%n",media);
			
		}else 
			System.out.println("PERDEU BROW");
		


		sc.close();		
		
		
		
	}

}
