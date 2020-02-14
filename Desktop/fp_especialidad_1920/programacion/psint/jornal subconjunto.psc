Algoritmo trbajadores_subalgoritmo
	Definir nombre como caracter;
	Definir dia_semana como caracter;
	Definir horario Como Caracter;
	Definir dia Como Caracter;
	Definir horas Como Entero;
	Escribir "Escriba el nombre del trabajador";
	Leer nombre;
	Escribir "Escriba el dia de la semana en el que trabajo";
	Leer dia_semana;
	Escribir "Escriba el horario que tuvo: Diurno o Nocturno";
	Leer horario;
	Escribir "Escriba en que dia trabajo: Festivo o No festivo";
	Leer dia;
	Escribir "Y por ultimo escriba el numero de horas que trabajo";
	Leer horas;
	todotodito(nombre,horario,dia,horas)
	
FinAlgoritmo
SubAlgoritmo todotodito(nombre,horario,dia,horas)
	Si (horario="Diurno") y (dia="No festivo")  Entonces
		Escribir "El salario de " nombre " es" 
		Escribir horas * 10;
	FinSi
	Si (horario="Diurno") y (dia="Festivo") Entonces
		Escribir "El salario de " nombre " es" 
		Escribir (horas*10) + (horas*10/100)
	FinSi
	Si (horario="Nocturno") y (dia="No festivo") Entonces
		Escribir "El salario de " nombre " es" 
		Escribir horas * 13.5
	FinSi
	Si (horario="Nocturno") y (dia="Festivo") entonces
		Escribir "El salario de " nombre " es" 
		Escribir (horas*13.5) + (horas*15/100)
	FinSi
	
FinSubAlgoritmo
