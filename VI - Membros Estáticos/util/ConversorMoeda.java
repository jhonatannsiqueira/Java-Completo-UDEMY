package util;

public class ConversorMoeda {
	
	public static double IOF = 0.06;
	
	public static double conversor(double precoDolar, double compra) {
		return precoDolar * compra * (1.0 + IOF);
	}

}
