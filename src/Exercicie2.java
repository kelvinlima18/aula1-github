import java.util.Scanner;

public class Exercicie2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Qual � o seu nivel de Glicose? ");
	double glicose = sc.nextDouble();
	
	if (glicose <= 100) {
		System.out.println("Nomral");
	} else if (glicose > 100 && glicose <= 140) {
		System.out.println("M�dio");
	} else if (glicose > 140) {
		System.out.println("Diabetico");
	}
	
	
	sc.close();
	
	}

}
