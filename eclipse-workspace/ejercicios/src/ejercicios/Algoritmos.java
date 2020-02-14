package ejercicios;
import java.util.Scanner;

public class Algoritmos {

	public void Ejercicio1(Scanner sc)
	{
		int array[] = {5, 9, 4, 6, 5, 3};
		int i, j, aux;
		for (i = 0; i < array.length-1; i++)
		{
			for(j = i+1; j < array.length; j++)
			{
				if (array[i] < array[j])
				{
					aux = array[j];
					array[j] = array[i];
					array[i] = aux;
					System.out.println(aux);
				}
			}
		}

	}
	
	public void Ejercicio2(Scanner sc)
	{
		int array[] = {1,3,2,5,4};
		int i, j, aux;
		for (i = 1; i< array.length; i++)
		{
			aux = array[i];
			j = i-1;
			while ((j>=0) && (aux<array[j]))
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = aux;
			System.out.println();
		}
	}
	
	public void Ejercicio3(Scanner sc)
	{
		int array[] = {2,1,4,3,5};
		int i, j, aux;
		for (i = 1; i < array.length-1; i++)
		{
			for (j = 0; j < array.length-i-1; j++)
			{
				if(array [j] > array[j+1])
				{
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}
	}

	public static void Quicksort( int array[], int inf, int sup)
	{
		int i, j, x, tam;
		 i = inf;
		 j = sup;
		 x = array[(inf+sup)/2];
		while(i <= j)
		{
			while (array[i] < x)
			{
				i = i+1;
			}
			while (array[j] > x)
			{
				j = j-1;
			}
			if (i <= j)
			{
				tam = array[i];
				array[i] = array[j];
				array[j] = tam;
				i = i+1;
				j = j-1;
			}
		}		
		if (inf < j)
		{
			Quicksort(array, j, inf);
		}
		if (i < sup)
		{
			Quicksort(array, i, sup);
		}
	}
}
