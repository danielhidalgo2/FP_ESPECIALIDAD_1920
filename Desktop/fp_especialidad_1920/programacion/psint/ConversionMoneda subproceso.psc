Algoritmo conversionMoneda
	Definir pastoso Como Entero;
	Definir divisa como entero;
	Escribir "Dime una divisa 1:dolar, 2:yen, 3:libra"
	Leer divisa;
	Escribir "Dime una cantidad de dinero"
	Leer pastoso
	cambiador(pastoso,divisa)
	
FinAlgoritmo
SubAlgoritmo cambiador(pastoso,divisa)
	SI divisa = 1 Entonces
		Escribir "Esa cantidad en euros es " 0.75*pastoso;
	FinSi
	Si divisa = 2 Entonces
		Escribir "Esa cantidad en euros es " 0.009*pastoso
	FinSi
	Si divisa = 3 Entonces
		Escribir "Esa cantidad en euros es " 1.22*pastoso
	FinSi
FinSubAlgoritmo
