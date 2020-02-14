Algoritmo Ejercicio14
	Definir n1 Como Entero;
	Definir n2 Como Entero;
	Escribir "Dame dos numeros";
	Leer n1;
	Leer n2;
	Si (n1>0) y (n2>0) Entonces
		Escribir "Los dos numeros son positivos";
	FinSi
	
	Si (n1<0) y (n2<0) Entonces
		Escribir "Ninguno de ellos es positivo";
	FinSi
	Si (n1<0) y (n2>0) Entonces
		Escribir "Solo uno de ellos es positivo";
	FinSi
	Si (n1>0) y (n2<0) Entonces
		Escribir "Solo uno de ellos es positivo"
	FinSi
	
FinAlgoritmo
