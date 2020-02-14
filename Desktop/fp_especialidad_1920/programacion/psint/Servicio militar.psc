Algoritmo Servicio_militar
	Definir sexo Como Caracter
	Definir edad Como Entero
	sexo <- 'Hombre'
	sexo <- 'Mujer'
	Leer sexo
	Si sexo='Hombre' Entonces
		Escribir 'Apto'
	SiNo
		Escribir "no apto"
		
	FinSi
	Leer edad
	Si (edad>=18) Y (edad<=25) Entonces
		Escribir 'Apto'
		Sino
			Escribir 'no apto'
	FinSi
FinAlgoritmo

