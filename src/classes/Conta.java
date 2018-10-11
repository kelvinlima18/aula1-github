package classes;

public class Conta {
	
	private int number;
	private String name;
	private double saldo;
	
	public Conta(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Conta(int number, String name, double depositoSaldo) {
		this.number = number;
		this.name = name;
		deposito(depositoSaldo);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double quantidade) {
		saldo += quantidade;
	}
	
	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}
	
	public String toString() {
		return "Conta: "
				+ number
				+ ", Nome: "
				+ name
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
				
	}
}
