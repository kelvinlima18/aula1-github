package classes;

public class Funcionario {

	public String name;
	public double salariob;
	public double tax;
	
	
	public double salariol() {
		return salariob - tax;
	}
	
	public void salariom(double porcentagem) {
		salariob += salariob * porcentagem / 100.0;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", salariob - tax);	
	}

}
