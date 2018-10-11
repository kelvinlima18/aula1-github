package program;

import java.util.Locale;
import java.util.Scanner;

import classes.Retangulo;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a altura e largura do retangulo: ");
        retangulo.largura = sc.nextDouble();		
        retangulo.altura = sc.nextDouble();
		
		double area = retangulo.area();
		double perimiter = retangulo.perimiter();
		double diagonal = retangulo.diagonal();
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimiter);
		System.out.printf("Diagonal: " + diagonal);
		
		sc.close();
		
	}

}
