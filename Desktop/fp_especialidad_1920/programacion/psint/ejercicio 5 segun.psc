Algoritmo ejercicio5_segun
	//{
	Definir n Como Entero;
	Definir x como entero;
	Definir j como entero;
	Definir op Como Entero;
	Definir area Como Caracter;
	Escribir "Que area desea calcular";
	Leer area
	Si area="trapecio" Entonces
		Escribir "Dime cuanto miden la base, la parte superior y la altura del trapecio";
		Leer n,x,j;
		op=1
	FinSi
	Si area="triangulo" entonces
		Escribir "Dime el aldo del triangulo";
		Leer n;
		op=2
	FinSi
	Si area="cuadrado" entonces
		Escribir "Dime cuanto mide el lado del cuadrado";
		Leer n;
		op=3
	FinSi
	Si area="rectangulo" entonces
		Escribir "Dime cuanto mide el lado del rectacngulo"
		Leer n
		op=4
	FinSi
	Si area="circulo" Entonces
		Escribir "Dime el radio del circulo";
		Leer n;
		op=5
	FinSi
	Segun op hacer
		1:
			Escribir "El area del trapecio es " j*((n+x)/2);
		2:
			Escribir "El area del triangulo es "  n*n/2;
		3:
			Escribir "El area del cuadrado es " n*n;
		4: 
			Escribir "El area del rectangulo es " n*n;
		5:
			Escribir "El area del circulo es " pi*(n^2);
	FinSegun
	
FinAlgoritmo

