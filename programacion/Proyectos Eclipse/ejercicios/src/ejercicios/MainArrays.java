package ejercicios;

import java.util.Scanner;

public class MainArrays {

	public static void main(String[] args) {		
		int op;
		Scanner sc = new Scanner(System.in);
		EjerciciosArrays e1 = new EjerciciosArrays();
		System.out.println("Elige un ejercicio");
		op = sc.nextInt();
		switch(op) 
		{
		case 1:
			e1.Ejercicio1(sc);
			break;
		case 2:
			e1.Ejercicio2(sc);
			break;
		case 3:
			e1.Ejercicio3(sc);
			break;
		case 4:
			e1.Ejercicio4(sc);
			break;
		case 5:
			e1.Ejercicio5(sc);
			break;
		case 6:
			e1.Ejercicio6(sc);
			break;
		case 7:
			e1.Ejercicio7(sc);
			break;
		case 8:
			e1.Ejercicio8(sc);
			break;
		case 9:
			e1.Ejercicio9(sc);
			break;
		case 10:
			e1.Ejercicio10(sc);
			break;
		case 11:
			e1.Ejercicio11(sc);
			break;
		case 12:
			e1.Ejercicio12(sc);
			break;
		case 13:
			e1.Ejercicio13(sc);
			break;
		case 14:
			e1.Ejercicio14(sc);
			break;
		case 15:
			e1.Ejercicio15(sc);
			break;
		case 16:
			e1.Ejercicio16(sc);
			break;
		case 17:
			e1.Ejercicio17(sc);
			break;
		case 18:
			e1.Ejercicio18(sc);
			break;
		case 19:
			e1.Ejercicio19(sc);
			break;
		case 20:
			e1.Ejercicio20(sc);
			break;
		}
	}

}
