package co.edu.uelbosque.swii.Calculadora2;

public class Tangente implements Comando{
	public double ejecutarOperacion(double b, double n) {
		// TODO Auto-generated method stub
		return this.tan(n);
	}
	
	public static double tan(double n1) {
		return Math.tan(n1);
	}
}
