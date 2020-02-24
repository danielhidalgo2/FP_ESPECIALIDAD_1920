package ejercicios;

import java.util.Scanner;

public class MainAlgoritmos {

	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);
		Algoritmos e1 = new Algoritmos();
		System.out.println("Elige ejercicio");
		op = sc.nextInt();
		
		switch(op)
		{
		case 1:
			e1.Ejercicio1(sc);
			break;
		case 2:
			e1.Ejercicio2(sc);
			break;
		}
	}
}
