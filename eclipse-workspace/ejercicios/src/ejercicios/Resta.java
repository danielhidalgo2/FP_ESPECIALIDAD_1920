package ejercicios;
import java.util.Scanner;
public class Resta extends Operaciones{
	public Resta()
	{
		
	}
	
	public void Restar(Scanner sc)
	{

		resultado=operando1-operando2;
		contado++;
	}
	
	public void realizarResta(double operando1, double operando2)
	{		
		this.operando1=operando1;  
		this.operando2=operando2;
	}
	
}
