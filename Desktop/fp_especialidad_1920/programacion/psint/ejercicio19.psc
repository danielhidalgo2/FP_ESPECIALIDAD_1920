Algoritmo ejercicio19
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c como entero;
	Definir suma como entero;
	Escribir "Dime un numero y sumar los siguientes n numeros pares";
	leer a;
	b=0
	suma=0;
	c=a;
	si a%2=0 Entonces
		Mientras b<(c*c) Hacer
			a=a+2
			b=b+c
			suma=suma+a
		FinMientras
		Escribir "El resultado de la suma es" suma;
	SiNo
		a=a-1
		Mientras b<(c*c) Hacer
			a=a+2
			b=b+c
			suma=suma+a
		FinMientras
		Escribir "El resultado de la suma es" suma;
	FinSi
	
FinAlgoritmo
