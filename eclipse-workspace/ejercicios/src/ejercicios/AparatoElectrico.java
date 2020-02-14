package ejercicios;
public class AparatoElectrico {
	static int PotenciaTotal;
	int Potencia;
	boolean estado;	
	public AparatoElectrico()
	{
		PotenciaTotal=500;
		Potencia=0;
		estado=false;
	}
	
	public void Encender()
	{	
		if (!estado && PotenciaTotal-this.Potencia>0)
		{
			estado = true;
			PotenciaTotal -= this.Potencia;
			//PotenciaTotal = PotenciaTotal- this.Potencia;
		}

	}
	
	public void Apagar()
	{
		if(estado)
		{
			estado=false;
			PotenciaTotal+= this.Potencia;
			//Potencia= Potencia-200;
		}
		else {
			System.out.println("No hay aparatos encendidos");
		}
	}
	
	public int Consumo()
	{

		return Potencia;
	}	
}
