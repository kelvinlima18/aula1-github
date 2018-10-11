package classes;

public class Estudante {

		public String name;
		public double nota1;
		public double nota2;
		public double nota3;
		

	    public double notaFinal() {
	    	return nota1 + nota2 + nota3; 	
	    }
	    public double notaFaltante() {
	    	if(notaFinal() < 60.00) {
	    		return 60.0 - notaFinal();
	    	} else {
	    		return 0.00;
	    	}
	    	
	    }

	}

