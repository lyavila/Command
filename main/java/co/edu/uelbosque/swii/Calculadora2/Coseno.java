package co.edu.uelbosque.swii.Calculadora2;

public class Coseno implements Comando{
	public double ejecutarOperacion(double b, double n) {
		// TODO Auto-generated method stub
		return this.coseno(n);
	}
	
	public static double coseno(double n1) {
		return Math.cos(n1);
	}
}
