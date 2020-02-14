package ejercicios;
import java.util.Scanner;

public class MainAparatoElectrico {

	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);
		int Consumido=0;
		int ConsumoTotal=500;
		AparatoElectrico[] aparatos = new AparatoElectrico[4];
		for (int i = 0; i < aparatos.length; i++)
		{		  
		  aparatos[i] = new AparatoElectrico();
		}
		AparatoElectrico a1 = new AparatoElectrico();		

		do
		{			
			System.out.println("1.Encender un aparato\n2.Apagar un aparato \n3.Ver consumo \n4.Salir");
			op = sc.nextInt();
			switch(op)
			{			
			case 1:	
					System.out.println("Selecciona un aparato\n Aparato 1(100W) \n Aparato 2(150W) \n Aparato 3(130W)\n Aparato 4(200W)");
					int seleccion=sc.nextInt();
					if (seleccion >= 0 && seleccion <= aparatos.length)
					{
						aparatos[seleccion-1].Encender();
						System.out.println(aparatos[seleccion-1].PotenciaTotal);	
					}
				
					else {
						System.out.println("No existen mas aparatos");
					}
			
			break;			
			case 2:				
				System.out.println("Selecciona un aparato\n Aparato 1(100W) \n Aparato 2(150W) \n Aparato 3(130W)\n Aparato 4(200W)");
				seleccion=sc.nextInt();
				if (seleccion >= 0 && seleccion < aparatos.length)
				{
					aparatos[seleccion-1].Apagar();
					System.out.println(aparatos[seleccion-1].PotenciaTotal);	
				}
			
				else {
					System.out.println("No existen mas aparatos");
				}			break;	
			case 3:
				
			break;	
			case 4:
				System.out.println("Has salido del menu");
			break;
			default:
				System.out.println("No existen mas opciones");
			break;			
			}
		}	while(op!=4);	
	}
}
