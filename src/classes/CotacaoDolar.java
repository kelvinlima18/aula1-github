package classes;

public class CotacaoDolar {

	public static double IOF = 0.06;
	
	public static double dollarReal(double amount, double dollarPrice) {
	return amount * dollarPrice * (1.0 + IOF);
	}
	}
