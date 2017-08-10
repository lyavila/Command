package co.edu.uelbosque.swii.Calculadora2;

public class Resta implements Comando {

	public double ejecutarOperacion(double a, double b) {
		// TODO Auto-generated method stub
		return this.resta(a,b);
	}
	
	public static double resta(double n1, double n2){
		return n1-n2; 
} 

}
