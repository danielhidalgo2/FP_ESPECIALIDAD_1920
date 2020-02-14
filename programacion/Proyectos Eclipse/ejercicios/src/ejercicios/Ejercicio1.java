package ejercicios;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio1 {
	
	public void Ejercicio01(Scanner _sc) {
		double a;		
		double b;
		double c;
		System.out.println("Escribe 10 numeros y los sumare");
		a=0;
		b=0;
		c=0;
		while(a<10)
		{
			b=_sc.nextDouble();
			c=c+b;
			a++;
		}
		System.out.println(c);
	}

	public void Ejercicio2(Scanner _sc) {
		double x;
		double y;
		double z;
		System.out.println("Escribe una lista de numeros y los sumare");
		x=1;
		y=0;
		z=0;
		while (x!=0) {
			y=_sc.nextDouble();
			z=z+y;
			x=y;
			
		}
	
		System.out.println(z);
	
		
	}
	
	public void Ejercicio3(Scanner _sc) {
		int a;
		int b;
		int c;
		
		System.out.println("Dame un numero y te digo la tabla de multiplicar");
		a=_sc.nextInt();
		b=0;
		c=0;
		
		while (c<11) {
			b=a*c;
			c++;
			System.out.println(b);
		}		
				
	}
	
	public void Ejercicio4(Scanner _sc) 
	{
		int a;
		int b;
		int c;
		System.out.println("Escribe");
		a=0;
		b=0;
		c=0;
		while(a>=0)
		{
			c=c+a;
			a=_sc.nextInt();
			b++;
		}
		System.out.println(c/(b-1));
	}
	
	public void Ejercicio5(Scanner _sc) {
		String pass;		
		System.out.println("Contraseña");
		_sc.nextLine();
		pass=_sc.nextLine();
		if(pass.contentEquals("eureka")) {
			System.out.println("Contraseña correcta");						
		}
		else{		
			System.out.println("Contraseña incorrecta");						
		}									
	}
	public void Ejercicio6(Scanner _sc) {
		int anio;		
		System.out.println("Dame un año y te digo si es bisiesto");
		anio=_sc.nextInt();		
		if (anio%100==0 && anio%400==0) {			
			System.out.println("El año es bisiesto");
		}
		else if (anio%100!=0 && anio%4==0) {
			System.out.println("El año es bisiesto");
		}
		else {
			System.out.println("El año no es bisiesto");
		}
		
	}
	public void Ejercicio7(Scanner _sc) {
		int op;
		double galon;
		double litros;
		double pies;
		double pulgadas;
		double cm;
		double yardas;
		double metros;
		System.out.println("Elegir una opción para realizar las siguientes conversiones: \n1 Galones a litros. \n2 Pies a pulgadas, yardas, cm y metros.");
	    op=_sc.nextInt();
		galon=0;
		litros=3.7854;
		pies=0;
		pulgadas=12;
		cm=pulgadas*2.54;
		metros=cm/100;
		yardas=metros*0.96;
		switch(op) {
		case 1:
			System.out.println("Dame una cantidad de galones :)");
			galon=_sc.nextDouble();
			System.out.println(galon*litros+" litros.");
		break;
		case 2:
			System.out.println("Dame una cantidad de pies :D");
			pies=_sc.nextDouble();
			System.out.println(pies*pulgadas+" pulgadas "+cm*2+" cm "+metros*2+" metros "+yardas*2+" yardas.");
			
		break;
		default:
			System.out.println("No existen mas opciones");
		break;	
		}			
	}
	public void Ejercicio8(Scanner _sc)
	{
		int contador;
		System.out.println("Dame un número y te dire si es primo");
		int n = _sc.nextInt();
		contador=0;
		for (int i =1;i<=n;i++ )
		{
			System.out.println(i);
			if (n%i==0)
			{
				++contador;
				System.out.println(i);
			}
			
		}
		
		System.out.println(n+((contador > 2)? " no es primo":" es primo"));
		if (contador > 2)
		{
			System.out.println(n+" no es primo");	
		} else
		{
			System.out.println(n+" es primo");
		}
	}
		
	
	public void Ejercicio9(Scanner _sc) {
		int min;
		int max;
		int aux;
		System.out.println("Dame una serie de números y te digo el mayor y menor");
		max=_sc.nextInt();
		min=max;
		aux=min;
		while(aux>0) {
		max=_sc.nextInt();
		min=_sc.nextInt();
		if(min<max) {
			System.out.println("El más pequeño es "+min+ " y el número mas grande es " +max);			
			}		
		}		
	}
	public void Ejercicio8_Optimizado(Scanner _sc) {
		int contador;
		System.out.println("Dame un número y te dire si es primo");
		int n = _sc.nextInt();
		boolean esPrimo = n > 0;
		contador=0;
		for (int i =1;i<=n;i++ )
		{
			System.out.println(i);
			if (n%i==0)
			{
				++contador;		
			}			
		}
		
		
		if (contador > 2 )
		{
			System.out.println(n+" no es primo");	
		
		} else
		{
		
			System.out.println(n+" es primo");
		}
		
		for (int i =2;esPrimo && i<n;i++ )
		{
			System.out.println(i);
			esPrimo = n%i==0;		
		}
	}
	public void Ejercicio11(Scanner _sc)
	{
		int num=0;
		int contador=0;
		System.out.println("Los 100 primeros numeros pares");
		
		while (contador<101)
		{
			num++;
			if (num%2==0)
			{
				System.out.println(num);
			}
			contador++;
		}
	}
	
	public void Ejercicio12(Scanner _sc)
	{
		int num=0;
		int contador=0;
		while (contador < 100)
		{
			num++;
			if(num%2!=0)
			{
				System.out.println(num);
			}
			contador++;
		}
	}
	
	public void Ejercicio13(Scanner _sc)
	{
		int suma = 10;
		for (int i = 10; i <= 50; ++i)
		{
			if (i % 2 == 0)
			{
				suma += i;
			}
		}
		System.out.println("Suma comprendida "+suma);
		
	}
	
	public void Ejercicio14(Scanner _sc)
	{
		int anterior = 1, actual = 1, siguiente = 0;
		int n=_sc.nextInt();
		for (int i = 0; i<n; i++)
		{
			siguiente = actual + anterior;
			anterior = actual;
			actual = siguiente;
		}
		System.out.println(n);
	}
	
	public void Ejercicio15(Scanner _sc)
	{
		int dado1= (int) Math.random();
		int dado2= (int)Math.random();
		int min=1;
		int max=6;
		
		while(dado1>=1 && dado1<=6 && dado2>=1 && dado2<=6)
		{
			System.out.println(dado1+ dado2);
		}
		
		
		
		
	}
}

