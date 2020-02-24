package ejercicios;
import java.util.Scanner;
public class Division extends Operaciones {
	public int contador;
	 public int resto=0;
	public Division()
	{
		
	}
	
	public void Dividir(Scanner sc)
	{
		while (operando1>0)
		{
			contador++;
			operando1=operando1-operando2;
			resultado=contador;
			
		}
		contado++;
		/*
		if(-operando1!=0)
		{					
			int operando3=10;
			while(operando3!=0)
			{
				
				operando1 = operando1+operando1;
				operando3=operando3-1;				
				
			}
			while (operando1>0)
			{
				resto++;
				operando1=operando1-operando2;
				
			}
		}*/
	}
	
	public void realizarDivision(double operando1, double operando2)
	{		
		this.operando1=operando1;  
		this.operando2=operando2;
	}
	
	public int resultadoDiv()
	{		
		return contador-1;
	}
	
	public int resultadoDivision()
	{
		return resto;
	}
}
