Algoritmo ejercicio4_segun
	//{
	Definir n1 Como Entero;
	Definir n2 Como Entero;
	Definir op como entero;
	Definir operacion Como Caracter;
	Escribir "Dime la operación que quieres realizar"
	Leer operacion;
	Escribir "Dime el primer numero y el segundo numero"
	Leer n1
	Leer n2
	Si operacion="suma" Entonces
		op=1
	FinSi
	Si operacion="resta" Entonces
		op=2
	FinSi
	Si operacion="multiplicacion" Entonces
		op=3
	FinSi
	Si operacion="division" Entonces
		op=4
	FinSi
	Segun op hacer
		1:
			Escribir n1+n2
		2:
			Escribir n1-n2
		3:
			Escribir n1*n2
		4:
			Escribir n1/n2
			
			
	FinSegun
	//}
FinAlgoritmo
