package co.edu.uelbosque.swii.Calculadora2;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTest {
  @Test
  public void debeSumarCorrectamente() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp(new Suma());
	  Comando operacion = EncontrarComando.cmd("+");
	  double resultado = operacion.ejecutarOperacion(3.2, 5);
	  double esperado = 8.2;
	  System.out.println(resultado);
	  Assert.assertEquals(esperado, resultado);
  }
  
  @Test
  public void debeRestarCorrectamente() throws ComandoNoEncontradoException {
	  EncontrarComando.addOp(new Resta());
	  Comando operacion = EncontrarComando.cmd("-");
	  double resultado = operacion.ejecutarOperacion(11, 5);
	  double esperado = 6;
	  Assert.assertEquals(resultado, esperado);
  }
  
  @Test
  public void debeMultiplicarCorrectamente() throws ComandoNoEncontradoException{
	  EncontrarComando.addOp(new Multiplicacion());
	  Comando operacion = EncontrarComando.cmd("*");
	  double resultado = operacion.ejecutarOperacion(4, 9);
	  double esperado = 36;
	  Assert.assertEquals(resultado, esperado);
  }
  
  @Test
  public void debeDividirCorrectamente() throws ComandoNoEncontradoException{
	  EncontrarComando.addOp(new Division());
	  Comando operacion = EncontrarComando.cmd("/");
	  double resultado = operacion.ejecutarOperacion(16, 8);
	  double esperado = 2;
	  Assert.assertEquals(esperado, resultado);
  }
  
  @Test(expectedExceptions=ComandoNoEncontradoException.class)
  public void noDebeEncontrarLaOperacionPotencia() throws ComandoNoEncontradoException{
	Comando operacion = EncontrarComando.cmd("^");  
  }
  
  @Test
  public void laOperacionSumaExiste() throws ComandoNoEncontradoException{
	  EncontrarComando.addOp(new Suma());
	  Comando operacion = EncontrarComando.cmd("+");
	  Assert.assertTrue(operacion instanceof Suma);
  }
  
  @Test
  public void laOperacionRestaExiste() throws ComandoNoEncontradoException{
	  EncontrarComando.addOp(new Resta());
	  Comando operacion = EncontrarComando.cmd("-");
	  Assert.assertTrue(operacion instanceof Resta);
  }
  
  @Test
  public void laOperacionMultiplicacionExiste() throws ComandoNoEncontradoException{
	  EncontrarComando.addOp(new Multiplicacion());
	  Comando operacion = EncontrarComando.cmd("*");
	  Assert.assertTrue(operacion instanceof Multiplicacion);
  }
  
  @Test 
  public void laOperacionDivisionExiste() throws ComandoNoEncontradoException{
	  EncontrarComando.addOp(new Division());
	  Comando operacion = EncontrarComando.cmd("/");
	  Assert.assertTrue(operacion instanceof Division);
  }
}
