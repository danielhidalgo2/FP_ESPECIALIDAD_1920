package ejercicios;
import java.util.Scanner;
public class Operaciones {	
	public double operando1;
	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public static void setResultado(double resultado) {
		Operaciones.resultado = resultado;
	}
	public double operando2;
	public static double resultado;
	public static double contado;
	//TODO int/char codOp;
	public Operaciones()
	{
		operando1=0;
		operando2=0;
		resultado=0;
		contado=0;
	}
	
	public static double getResultado()
	{
		return resultado;
	}
	public String toString() 
	{
		//TODO mensaje to guapo con el resultado de la operacion
		return "El resultado to guapo de la operacion es ";
	}
	
	public void GuardarOperando2(Scanner sc)
	{	
		if(contado>0)
		{	
		operando1=resultado;
		}
	}
}
