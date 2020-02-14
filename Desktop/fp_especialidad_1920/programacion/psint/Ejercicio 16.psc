Algoritmo Ejercicio16
	Definir dia Como Entero;
	Definir mes Como Entero;
	Definir año Como Entero;
	Escribir "Dime un dia";
	Leer dia;
	Si (dia >=1) y (dia<=31) entonces;
		Escribir "Dime un mes";
		Leer mes;
		Si (mes >=1) y (mes<=12) entonces;
			Escribir "Dime un año";
			Leer año;
			Si año > 0 Entonces
				Si mes = 1 Entonces
					Escribir dia " de enero de " año; 
				FinSi
				Si mes = 2 Entonces
					Escribir dia " de febrero de " año; 
				FinSi
				Si mes = 3 Entonces
					Escribir dia " de marzo de " año; 
				FinSi
				Si mes = 4 Entonces
					Escribir dia " de abril de " año; 
				FinSi
				Si mes = 5 Entonces
					Escribir dia " de mayo de " año; 
				FinSi
				Si mes = 6 Entonces
					Escribir dia " de junio de " año; 
				FinSi
				Si mes = 7 Entonces
					Escribir dia " de julio de " año; 
				FinSi
				Si mes = 8 Entonces
					Escribir dia " de agosto de " año; 
				FinSi
				Si mes = 9 Entonces
					Escribir dia " de septiembre de " año; 
				FinSi
				Si mes = 10 Entonces
					Escribir dia " de obtubre de " año; 
				FinSi
				Si mes = 11 Entonces
					Escribir dia " de noviembre de " año; 
				FinSi
				Si mes = 12 Entonces
					Escribir dia " de diciembre de " año; 
				FinSi
			SiNo
				Escribir "Error"
			FinSi
		FinSi
	FinSi
	
	
	
	
	
FinAlgoritmo
