Algoritmo ejercicio2_segun
	//{
	Definir n Como Entero;
	Definir op como entero;
	Escribir "Escriba su edad"
	Leer n;
	Si n<14 Entonces
		op=1
	FinSi
	Si (n>=14) y (n<=26) Entonces
		op=2
	FinSi
	Si (n>=27) y (n<=59) Entonces
		op=3
	FinSi
	Si n>=60 Entonces
		op=4
	FinSi
	Segun op hacer
		1: 
			Escribir "Esta en la infacia"
		2:
			Escribir "Esta en la juventud"
		3:
			Escribir "Esta en la adultez"
		4:
			Escribir "Es una persona mayor"
		De Otro Modo:
			Escribir "Edad no valida"
	FinSegun

	//}
FinAlgoritmo
