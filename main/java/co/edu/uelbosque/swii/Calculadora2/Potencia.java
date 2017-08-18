package co.edu.uelbosque.swii.Calculadora2;

public class Potencia implements Comando{
	public double ejecutarOperacion(double base, double exponente) {
		// TODO Auto-generated method stub
		return this.potencia(base, exponente);
	}
	
	public static double potencia(double b, double e) {
		return Math.pow(b, e);
	}
}
