package util;

public class Calculadora {
	
	public final double PI = 3.14159;
	public double raio, c, v;
	
	public double circunferencia() {
		return 2.0 * PI * raio;
	}
	
	public double volume() {
		return 4.0 * PI * Math.pow(raio, 3.0) / 3.0;
	}

}
