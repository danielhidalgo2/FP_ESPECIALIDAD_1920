package ejercicios;
import java.util.Scanner;
public class Suma  extends Operaciones {
	public Suma()
	{
		
	}
	public void Sumar(Scanner sc)
	{		
		resultado=operando1+operando2;
		contado++;
	}
	
	public void realizarSumar(double operando1, double operando2)
	{
		//TODO setResultado(this.operando1+this.operando2);
		this.operando1=operando1;  
		this.operando2=operando2;
	}
}
