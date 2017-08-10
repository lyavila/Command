package co.edu.uelbosque.swii.Calculadora2;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void cadena (String operacion){
		//Test Prueba GitHub
		String[] numero = operacion.split("[-*/+]");
		String[] operador = operacion.split("[0-9]");
		double n = 0;
		int cont = 1;
		double resultado = 0;
		
		ArrayList<Double> totalN = new ArrayList<Double>();
		for (int i = 0; i < numero.length; i++) {
			n = Double.parseDouble(numero[i]);
			totalN.add(i,  n);
		}

		resultado = totalN.get(0);

		for (int a = 0; a < numero.length; a++) {
			if (operador[a].equals("+")) {
				resultado = Operaciones.suma(resultado, totalN.get(cont));
				cont = +1;
			} else if (operador[a].equals("-")) {
				resultado = Operaciones.resta(resultado, totalN.get(cont));
				cont = +1;
			} else if (operador[a].equals("*")) {
				resultado = Operaciones.multiplicacion(resultado, totalN.get(cont));
				cont = +1;
			} else if (operador[a].equals("/")) {
				resultado = Operaciones.division(resultado, totalN.get(cont));
				cont = +1;
			} else System.out.println("operacion no valida");

		}
		System.out.println(resultado);
	}
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String terminar = "1";
		System.out.print("Escriba s para terminar");
		while (terminar.equals("1")) {

			System.out.print("\n\nDigite su operaci�n ");
			String operacion = teclado.nextLine();

			if (operacion.equals("s") || operacion.equals("exit")) {
				terminar = "no";
			} else {
				if (operacion.isEmpty()) {

				} else {
					cadena(operacion);
				}
			}
		}

		teclado.close();
	}
}
