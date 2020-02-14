Algoritmo ejercicio22
	Definir clave Como Caracter;
	Definir n Como Entero; 
	n=0;
	Escribir "Dime la clave, solo tienes 3 intentos"
	Leer clave;
	Si clave = "eureka" Entonces
		Escribir "Correcto";
	SiNo
		n=1
		Si (n=1) y (clave!="eureka") entonces
			Escribir "No es correcto, has usado un intento";
			Leer clave;
		FinSi
		n=2
		Si (n=2) y (clave!="eureka") Entonces
			Escribir "No es correcto, has usado dos intentos";
			Leer clave;
		Finsi
		n=3
		Si (n=3) y (clave!="eureka") entonces
			Escribir "No es correcto, has usado tres intentos"
		SiNo
			Escribir "Es correcto"
		FinSi
	FinSi
	
FinAlgoritmo
