package co.edu.uelbosque.swii.Calculadora2;

public class Seno implements Comando{
	public double ejecutarOperacion(double b, double n) {
		// TODO Auto-generated method stub
		return this.seno(n);
	}
	
	public static double seno(double n1) {
		return Math.sin(n1);
	}
}
