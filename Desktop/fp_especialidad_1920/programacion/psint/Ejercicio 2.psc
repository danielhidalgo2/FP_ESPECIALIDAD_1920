Algoritmo pago_por_hora
	//Supongamos que por hora cobra 5$
	Definir horas Como Entero;
	Definir extras Como Entero;
	Escribir "¿Cuantas horas ha trabajado?";
	Leer horas;
	Si horas <= 40 Entonces;
		Escribir "Cobra";
		Escribir horas * 5;
	Sino;
		Escribir "¿Cuantas horas extras ha hecho?";
		Leer extras;
		Escribir "Cobra";
		Escribir (Horas * 5) + (extras * 50 / 100) 
	FinSi
FinAlgoritmo	