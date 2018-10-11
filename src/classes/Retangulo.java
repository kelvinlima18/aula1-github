package classes;

public class Retangulo {

   public double altura, largura;
		
   public double area() {
	   return largura * altura;	   
   }
   
   public double perimiter() {
	   return 2 * (largura + altura);   
   }
   
   public double diagonal() {
	   return Math.sqrt((largura*largura) + (altura * altura));
   }
		
	}


