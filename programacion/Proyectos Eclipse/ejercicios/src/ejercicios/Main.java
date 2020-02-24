package ejercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner (System.in);
		Ejercicio1 e1 = new Ejercicio1();
		System.out.println("Elige el ejercicio");
		op = sc.nextInt();
		
		switch(op) {
		
		case 1:
			e1.Ejercicio01(sc);
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
			e1.Ejercicio8_Optimizado(sc);
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
		}
		
	}

}
