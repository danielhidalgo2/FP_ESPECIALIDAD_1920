import java.util.Scanner;
class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;	
		Rectangulo r2 = new Rectangulo();
		Rectangulo r1 = new Rectangulo();
		Rectangulo r3 = new Rectangulo();
		r1.setInferior1(1);
		r1.setInferior2(2);
		r1.setSuperior1(3);
		r1.setSuperior2(4);
		r1.setNombre("Filopedo");
		r1.establecerNombre("soytoguaponene");

		//r1.desplazar(2, 3);
		System.out.println("El valor de x1 "+ r1.getInferior1()+ " El valor de y1 "+  r1.getInferior2());
		System.out.println("El valor de x2 "+ r1.getSuperior1()+ " El valor de y2 "+  r1.getSuperior2());
		System.out.println("El numero de rectangulos"+r1.getnumRectangulo());
		System.out.println("El nombre del rectangulo 1 es "+ r1.getNombre());
		System.out.println("La figura es "+ r1.getnombreFigura());
		System.out.println("Pi "+r1.getPi());
		System.out.println(r1.obtenerNombre());
		System.out.println("La superficie es "+ r1.calcularSuperficie());
		System.out.println("El perimetro es "+ r1.calcularPerimetro());
		System.out.println("Dime la x");
		x = sc.nextDouble();
		System.out.println("Dime la y");
		y = sc.nextDouble();
		sc.close();
		r1.desplazar(x, y);
		System.out.println(r1.obtenerNumRectangulo());
				
	}
	

}
