package ejercicios;

public class Punto {
	private int abscisa;
	private int ordenada;
	
	public Punto()
	{
		abscisa = 0; //Eje x
		ordenada = 0; //Eje y
	}
	
	int getAbscisa()
	{
		return abscisa;
	}
	
	int getOrdenada()
	{
		return ordenada;
	}
	
	void setAbscisa(int x)
	{
		abscisa = x;
	}
	
	public String toString()
	{
		String info = "Eje x" + getAbscisa() + " Eje y" + getOrdenada();
		return info;
	}
	
}
