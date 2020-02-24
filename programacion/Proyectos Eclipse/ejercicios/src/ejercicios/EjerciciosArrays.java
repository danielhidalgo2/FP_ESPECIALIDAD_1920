package ejercicios;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Random;
public class EjerciciosArrays {
	
	Random rd = new Random();
	
	public enum semaforo {ROJO,AMARILLO,VERDE};
	public void Ejercicio1(Scanner sc)
	{
		 for (semaforo s2: semaforo.values())
		System.out.println(s2);
	}
	
	public enum semana {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};
	
	public void Ejercicio2(Scanner sc)
	{
		for (semana s2: semana.values())
		System.out.println(s2);			
	}
	
	public enum meses {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE}
	
	public void Ejercicio3(Scanner sc) 
	{
		for (meses m2: meses.values())
			System.out.println(m2);
	}
	
	public enum vehiculos {Coche,Moto,Bicicleta,Camión,Autobús,Tanque,OverBoard}
	
	public void Ejercicio4(Scanner sc)
	{
		for (vehiculos v2: vehiculos.values())
			System.out.println(v2);
	}
	
	public enum coches {Ford,Renault,Peugeot,Lamborghini,Citroen,Ferrari,Opel,Volkswagen}
	
	public void Ejercicio5(Scanner sc)
	{
		for (coches c2: coches.values())
			System.out.println(c2);
	}
	
	public void Ejercicio6(Scanner sc)
	{
		double[] A= new double[3];
		double x;
		for (int i=0; i<A.length; i++)
		{
			A[i] = i*3;
			System.out.println(A[i]);
		}
		x = A[0]+A[1]+A[2]; 
		System.out.println(x);
	}
	
	public void Ejercicio7(Scanner sc)
	{
		 int[] C= new int[4];
		 int y;
		for (int i=C.length-1; i>=0; i--) {
		 C[i] = i/2;
		System.out.println(C[i]);
		}
		y = C[0]+C[1]+C[2]+C[3];
	}
	
	public void Ejercicio8(Scanner sc)
	{
		int[] A = new int[1];
		for (int i=A.length; i<=100; i++)
		{			
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void Ejercicio9(Scanner sc)
	{
		int[] B = new int[100];
		for (int i=B.length; i>=1; i--)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public void Ejercicio10(Scanner sc)
	{
		int contadorNPrimos = 0;
		int n = 0;
		
		//1) Averiguar cuantos nº primos hay entre 1 y 100
		//para saber el tamaño del array
		for (int i=1; i<100; i++)			
		{					
			if (esPrimo(i))
			{
				contadorNPrimos++;		
			}		
		}
		System.out.println("Hay "+contadorNPrimos+" números primos entre 1 y 100");
		int[] array = new int[contadorNPrimos];
		int[] daniel = new int[100];
		//pero accedemos desde 0 a tamaño -1 (99) daniel[0]
		//2)Pues insertar esos números.	
		int p = 0;
		for (int i=1; i<100; i++)			
		{					
			if (esPrimo(i))
			{
				array[p] = i;
				p++;
			}		
		}		
		//3)Mostrarlos
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	
	public boolean esPrimo (int _numero)
	{
		boolean esPrimo = true;
		for (int i = 2; esPrimo && i < _numero; i++) 
		{
			esPrimo = _numero % i != 0;
		}
		return esPrimo;
	}
	
	public void Ejercicio11(Scanner sc)
	{
		System.out.println("Dime el tamaño que quieres que sea el array: ");
		int[] array = new int[sc.nextInt()];
		System.out.println("Ahora elige entre estas dos opcciones: \n 1)Manual \n 2)Aleatorio");
		int op = sc.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Introduce los numeros");
			int contador = 0;
			int numero;
			while(contador < array.length)
			{

				numero = sc.nextInt();

				
				if(numero%2==0)
				{
					array[contador] = numero;
					contador++;	
				}	
				System.out.println(array[contador]);
			}	

			break;
		case 2:
			int identificador = 0;
			int num;
			while(identificador < array.length)
			{
				num = (int)Math.random();
				
				if(num%2==0)
				{
					array[identificador] = num;
					identificador++;					
				}
				System.out.println(array[identificador]);
			}

		}
	}
	
	public void Ejercicio12(Scanner sc)
	{
		int array [][] = new int[5][5];
		for (int i=0; i<array.length; i++ )
		{
			for(int j=0; j<array[i].length; j++)
			{
				array[i][j]= rd.nextInt(100);
				
			}
			
		}
		
		
		for (int i = 0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
			
		}
	}
	
	public void Ejercicio13(Scanner sc)	
	{
		int a = 1;
		int array [][] = new int [50][2];
		for (int i = 0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				array[i][j]=a;
				System.out.print(array[i][j]);
				System.out.print(" ");
				a++;
			}
			System.out.println("");
		}
	}
	
	public void Ejercicio14(Scanner sc)
	{
		boolean posicion = true;
		int columna1=0, columna2=0;
		int a = 1;
		int array [][] = new int [50][2];
		for (int i = 0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{			
				array[i][j]=a;
				System.out.print(array[i][j]);
				System.out.print(" ");
				a++;
				if(posicion==true)
				{
					columna1=columna1+array[i][j];
					posicion=false;
				}
				else
				{
					columna2=columna2+array[i][j];
					posicion=true;
				}
			}			
			System.out.println("");	
		}	
		System.out.println(columna1);
		
	}
	
	public void Ejercicio15(Scanner sc)
	{
		int a = 0;
		int x=0, y=0;
		int array [][] = new int [2][10];
		for (int i = 0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				if(array[i][j]%2==0)
				{
				array[i][j]=a;
				System.out.print(array[i][j]);
				System.out.print(" ");
				}	
				a++;
			}
			System.out.println("");
		}
		System.out.println("Que posicion de x e y quieres");
		x = sc.nextInt();
		y = sc.nextInt();		
		System.out.println(array[x][y]);
	}
	
	public void Ejercicio16(Scanner sc)
	{		
		String nombres[][]= {{"Jorge, David, Fernando"}};
		String apellidos1[][]= {{"Garcia, Gomez, Jimenez"}};
		String apellidos2[][]= {{"Villa, Hidalgo, Gutierrez"}};
		for(int i=0; i<nombres.length; i++)
		{
			for(int j=0; j<nombres[i].length; j++)
			{
				
				System.out.print(nombres[i][j]);
				System.out.print(" ");				
			}	
			System.out.println("");
		}
		for(int i=0; i<apellidos1.length; i++)
		{
			for(int j=0; j<apellidos1[i].length; j++)
			{
				
				System.out.print(apellidos1[i][j]);
				System.out.print(" ");				
			}	
			System.out.println("");
		}
		for(int i=0; i<apellidos2.length; i++)
		{
			for(int j=0; j<apellidos2[i].length; j++)
			{
				
				System.out.print(apellidos2[i][j]);
				System.out.print(" ");				
			}	
			System.out.println("");
		}
	}
	
	public void Ejercicio17(Scanner sc)
	{
		int buscar = rd.nextInt(10);
		int matriz[][] = new int[4][5];			
		for(int i=0; i<matriz.length; i++)
		{
			for(int j=0; j<matriz[i].length; j++)
			{
				matriz[i][j]=rd.nextInt(10);
				System.out.print(matriz[i][j]);
				System.out.print(" ");
				
			}
			System.out.println("");			
		}
		System.out.println("El numero que buscare es "+buscar);
		boolean encontrar = false;
		for(int i=0; !encontrar && i<matriz.length; i++)
		{
			for(int j=0;!encontrar && j<matriz[i].length; j++)
			{
				if(buscar==matriz[i][j])
				{
					System.out.println("El numero se repite en "+i+" "+j);
					encontrar=true;
				}	
			}
		}
		if(encontrar==false)
		{
			System.out.println("no coincidencias");
		}			
	}
	
	public void Ejercicio18(Scanner sc)
	{
		int matriz[][] = new int[3][3];
		System.out.println("La matriz normal seria");
		for (int i=0; i<matriz.length; i++ )
		{
			for(int j=0; j<matriz[i].length; j++)
			{
				matriz[i][j]= rd.nextInt(100);
				System.out.print(matriz[i][j]);
				System.out.print(" ");				
			}
			System.out.println("");
		}
		System.out.println("la traspuesta");
		for (int i=0; i<matriz.length; i++ )
		{
			for(int j=0; j<matriz[i].length; j++)
			{	
				System.out.print(matriz[j][i]);
				System.out.print(" ");				
			}
			System.out.println("");
		}
		
	
	}
	
	public void Ejercicio19(Scanner sc)
	{
		int min = 100, max = 0; 
		int matriz[][] = new int [6][8];
		for(int i=0; i<matriz.length; i++)
		{
			for(int j=0; j<matriz[i].length; j++)
			{
				matriz[i][j]= rd.nextInt(100);
				System.out.print(matriz[i][j]);
				System.out.print(" ");
				if(matriz[i][j]<min)
				{
					min = matriz[i][j];
			
				}
				
				if(matriz[i][j]>max)
				{
					max = matriz[i][j];
		
				}
			}
			System.out.println("");
		}
		System.out.println(min);
		System.out.println(max);
	}
	
	public void Ejercicio20(Scanner sc)
	{
		int m1=0;
		System.out.println("Como son las dimensiones de las matrices");
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
		if(a==c && b==d)
		{
			int matriz1[][] =new int [a][b];
			int matriz2[][] = new int [c][d];
			System.out.println("Dame los numeros de las matrices");
			while(m1==-1)
			{
				m1 = sc.nextInt();
			}
		}
		else {
			System.out.println("No puedo operar matrices con distintas dimensiones");
		}				
	}
}
