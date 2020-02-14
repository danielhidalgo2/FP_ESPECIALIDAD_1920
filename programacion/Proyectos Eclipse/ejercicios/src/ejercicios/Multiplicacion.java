package ejercicios;
import java.util.Scanner;
public class Multiplicacion extends Operaciones{
	public Multiplicacion()
	{

	}
	
	public void Multiplicar(Scanner sc)
	{		

		
		while(operando2!=0)
		{
			resultado = resultado+operando1;
			operando2=operando2-1;
		}
		contado++;
	}
	
	public void realizarMultiplicacion(double operando1, double operando2)
	{		
		this.operando1=operando1;  
		this.operando2=operando2;
	}
	

}
