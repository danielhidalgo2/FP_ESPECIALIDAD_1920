Algoritmo factorial_subproceso
	factorial
	
FinAlgoritmo

SubAlgoritmo factorial
	Definir n Como entero;
	Definir m Como Entero;
	Escribir "Dime el numero del que hacer el factorial";
	Leer n
	m=1;
	Mientras n>0 hacer
		Escribir m
		m=m*n
		n=n-1
	FinMientras
FinSubAlgoritmo 