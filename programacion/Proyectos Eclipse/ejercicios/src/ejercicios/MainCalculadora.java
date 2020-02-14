package ejercicios;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class MainCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Suma s1= new Suma();
		Resta r1=new Resta();
		Multiplicacion m1=new Multiplicacion();
		Division d1=new Division();
		int op;
		// El usuario puede realizar varias operaciones
		//Piensa que es mejor:
		//Pedir primero los operadores y luego la operación
		//O pedir primero la operación y luego los operadores
		String aux = JOptionPane.showInputDialog("Introduzca un operador");
		do {
			s1.operando1 = Double.valueOf(aux);
			r1.operando1=Double.valueOf(aux);
			m1.operando1=Double.valueOf(aux);
			d1.operando1=Double.valueOf(aux);		
			aux = JOptionPane.showInputDialog("Introduzca otro operador");
			s1.operando2 = Double.valueOf(aux);
			r1.operando2=Double.valueOf(aux);
			m1.operando2=Double.valueOf(aux);
			d1.operando2=Double.valueOf(aux);		
			System.out.println("¿Qué operación quieres hacer?\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir");
			op=sc.nextInt();
			
				switch(op)
				{
				case 1:
					s1.GuardarOperando2(sc);
					s1.Sumar(sc);

					System.out.println(s1.toString());
					System.out.println(Operaciones.getResultado());
					
					//TODO toString
					break;
				case 2:
					r1.Restar(sc);
					System.out.println(r1.toString());
					System.out.println(Operaciones.getResultado());
					break;
				case 3:
					m1.Multiplicar(sc);
					System.out.println(m1.toString());
					System.out.println(Operaciones.getResultado());
					break;
				case 4:
					d1.Dividir(sc);
					System.out.println(d1.toString());
					System.out.println(Operaciones.getResultado());										
					break;
				case 5:
					System.out.println("Has salido de la calculadora");
					break;
					default:
						System.out.println("no hay mas opciones xd");
						break;
				}
		}while(op!=5);
	}

}