package co.edu.uelbosque.swii.Calculadora2;

public class Operaciones {
  
	public static double resultado;
	
//	public static double suma(double n1, double n2){
//        resultado = n1 + n2; 
//        return resultado; 
//    } 
 
//    public static double resta (double n1, double n2){ 
//        resultado = n1 - n2; 
//        return resultado; 
//    }
 
    public static double multiplicacion(double n1, double n2){ 
        resultado = n1 * n2; 
        return resultado; 
    }  
 
    public static double division(double n1, double n2){
    	if(n1 >= n2) {
			resultado = n1 / n2;
		}else {
			resultado = n2 / n1;
		} 
        return resultado; 
    }
 
    
}
