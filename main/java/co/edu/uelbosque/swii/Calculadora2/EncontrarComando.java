package co.edu.uelbosque.swii.Calculadora2;

import java.util.HashMap;

public class EncontrarComando {

	private static HashMap<String, Comando> operaciones;
	
	public static Comando cmd(String key) throws ComandoNoEncontradoException {
		// TODO Auto-generated method stub
		if(operaciones.containsKey(key))
			return operaciones.get(key);
		throw new ComandoNoEncontradoException();
	}
	
	public static void addOp(Comando c){
		if(operaciones == null)
			operaciones = new HashMap<String, Comando>();
		operaciones.put("+", c);
		operaciones.put("-", c);
		operaciones.put("*", c);
		operaciones.put("/", c);
	}

}
