package co.edu.uelbosque.swii.Calculadora2;

public class Suma implements Comando {

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.suma(a, b);
	}

	public static double suma(double n1, double n2) {
		return n1 + n2;
	}

}
