package classes;

public class Funcionario2 {
	
	private Integer mat;
	private String nome;
	private Double salario;
	
	public Funcionario2() {
	}
	
	public Funcionario2(Integer mat, String nome, Double salario) {
		this.mat = mat;
		this.nome = nome;
		this.salario = salario;
		
	}
	public Integer getMat() {
		return mat;
	}
	public void setMat(Integer mat) {
		this.mat = mat;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public double aumento(double porcentagem) {
		return salario += salario * porcentagem / 100.0;
	}
	
	
	public String toString() {
		return mat + ", " + nome + ", R$" + String.format("%.2f", salario);
	}
	

}
