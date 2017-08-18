package co.edu.uelbosque.swii.Calculadora2;

public class Logaritmo implements Comando{
	
	public double ejecutarOperacion(double base, double n) {
		// TODO Auto-generated method stub
		return this.logaritmo(base, n);
	}
	
	public static double logaritmo(double b, double n) {
		return Math.log(n);/** Como poner la base**/
	}
}
