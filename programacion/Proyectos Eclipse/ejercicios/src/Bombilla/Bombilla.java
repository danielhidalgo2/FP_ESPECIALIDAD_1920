package Bombilla;
import java.util.Scanner;

public class Bombilla {
	public boolean interruptorGeneral=false;
	public boolean interruptorBombilla=false;
	int x=0;
	
	
	public void encenderGeneral(Scanner sc)
	{	
		while (interruptorGeneral != true)
		{	
			System.out.println("El interruptor general esta apagado, ¿desea encenderlo?[Escribe 0]");
			int interruptorGen = sc.nextInt();
			if (interruptorGen == 0)
			{
				interruptorGeneral=true;
				System.out.println("Has encendido el interruptor general");					
			}		
		}
	}	
	Bombilla[] array = new Bombilla[20];
	int seleccionar;
	public void encenderBombilla(Scanner sc)
	{

		if(interruptorGeneral == true)
		{
			while (interruptorBombilla != true)
			{
				while(seleccionar != -1)
				{	
				System.out.println("Existen 20 bombillas seleccione el numero de la bombilla que quiera encender");
				seleccionar = sc.nextInt();
				for (int i=1; i<array.length; i++)
				{
					array[i]= array[seleccionar];
					
				}
				
				
					System.out.println("La bombilla "+seleccionar+" esta apagada, si lo deseas puedes encenderla");
					System.out.println("¿Quieres encender la bombilla?[Presiona 0]");
					int interruptorBomb = sc.nextInt();
					if (interruptorBomb == 0)
					{
						interruptorBombilla = true;
						System.out.println("Has encendido la bombilla");
					}
					else {
						System.out.println("La bombilla está apagada");					
				
					}	
				}	
			}
		}
	}
}
