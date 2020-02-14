class Rectangulo {
	double x1, y1; //vertice inferior izquierdo
	double x2, y2; //vertice superior derecho
	private static int numRectangulo=0; //Almacena el numero de objetos de tipo Rectangulo
	private String nombre; //Almacena el nombre de cada rectangulo 
	static final String nombreFigura="Rectangulo";
	static final double Pi = 3.1416;
	public double superficie;
	double Perimetro;
	double desplazar;
	
	
	public Rectangulo()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		numRectangulo++;
;
	}
	
	public static int obtenerNumRectangulo()
	{
		return numRectangulo;
	}
	
	public void desplazar(double x, double y)
	{
	
		x1 = x1 + x;
		x2 = x2 + x;
		
		y1 = y1 + y;
		y2 = y2 + y;
		System.out.println("la x1 "+x1+ " lax2 "+x2);		
	}
	
	

	
	public double calcularSuperficie()
	{
		superficie =  (x2 - x1) * (y2 - y1);
		return superficie;
	}
	
	public double calcularPerimetro()
	{
		Perimetro = 2*(x2 - x1) + 2*(y2 - y1);
		return Perimetro;
	}
	
	public String obtenerNombre()
	{
		return nombre;
	}
	
	public void establecerNombre(String nombre)
	{
		this.nombre = nombre;
	}
	final double getPi()
	{
		return Pi;
	}
	
	String getnombreFigura()
	{
		return nombreFigura;
	}
	
	double getInferior1()
	{
		return x1;
		
	}
	
	void setInferior1(double x1)
	{
		this.x1 = x1;
	}
	
	double getInferior2()
	{
		return y1;
		
	}
	
	void setInferior2(double y)
	{
		y1 = y;
	}
	
	double getSuperior1()
	{
		return x2;
		
	}
	
	void setSuperior1(double z)
	{
		x2 = z;
	}
	
	double getSuperior2()
	{
		return y2;
		
	}
	
	void setSuperior2(double x)
	{
		y2 = x;
	}
	static int getnumRectangulo()
	{
		return numRectangulo;
	}
	
	String getNombre()
	{
		return nombre;
	}

	void setNombre(String x)
	{
		nombre = x;
	}
	

}
