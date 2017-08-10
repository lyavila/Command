package co.edu.uelbosque.swii.Calculadora2;

public class Division implements Comando {

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.division(a, b);
	}

	public static double division(double n1, double n2) {
		if (n1 >= n2) {
			return n1 / n2;
		} else
			return n2 / n1;
	}

}
