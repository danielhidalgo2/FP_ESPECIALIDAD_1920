package ejercicios;
import java.util.Scanner;
public class Calculadora {
	public double operando1;
	public double operando2;
	public double resultado;
	
	public Calculadora()
	{
		operando1=0;
		operando2=0;
		resultado=0;		
	}
	
	public void Multiplicar(double operando1, double operando2)
	{	
		this.operando1=operando1;
		this.operando2=operando2;
		resultado=operando1*operando2;	
	}
	
	
	public void Dividir(Scanner sc)
	{	
		operando1=sc.nextDouble();
		operando2=sc.nextDouble();
		resultado=operando1/operando2;	
	}
	
	public void Sumar(Scanner sc)
	{		
		operando1=sc.nextDouble();
		operando2=sc.nextDouble();
		resultado=operando1+operando2;	
		
	}
	
	public void Restar(Scanner sc)
	{		
		operando1=sc.nextDouble();
		operando2=sc.nextDouble();
		resultado=operando1-operando2;	
		
	}
	
	public double Resultado()
	{
		return resultado;
	}
}
