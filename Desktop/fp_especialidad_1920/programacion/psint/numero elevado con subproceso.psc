Algoritmo exponente_dado_subproceso
	Definir n Como Entero;
	Definir m como entero;
	Escribir "Dime el número que quieres que te eleve";
	Leer n;
	Escribir "Dime cuantas veces quieres que te lo eleve";
	Leer m
	Si m>0 Entonces
		elevado(n,m);
	FinSi
	Si m = 0 Entonces
		elevado0()
	FinSi
	
FinAlgoritmo

SubAlgoritmo elevado(n,m)
	Escribir "El resultado es " n^(m);
FinSubAlgoritmo
SubAlgoritmo elevado0()
	Escribir "El resultado es 1" 
FinSubAlgoritmo



