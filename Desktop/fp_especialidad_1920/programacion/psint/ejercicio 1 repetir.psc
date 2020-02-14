Algoritmo ejercicio1_repetir
	// {
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir primo Como Entero
	Definir x Como Entero
	Escribir 'Dime el limite iniferior y el limite superior'
	Leer num1
	Leer num2
	x <- num1
	primo=num1
	Repetir
		Si (primo=3)  Entonces
			Escribir 3
		FinSi
		Si (primo=5) Entonces
			Escribir 5
		FinSi
		Si (primo=7) Entonces
			Escribir 7
		Finsi
		Si (primo=11) Entonces
			Escribir 11
		FinSi
		Si (primo=13) Entonces
			Escribir 13
		FinSi
		Si (primo=17) Entonces
			Escribir 17
		SiNo
			Si (primo%2<>0) y (primo%5<>0) y (primo%3<>0) y (primo%7<>0) y (primo%11<>0) y (primo%13<>0) y (primo%17<>0) Entonces
				Escribir primo
			FinSi
		FinSi
		primo <- primo+1
		x=x+1
	Hasta Que num2<x
FinAlgoritmo

