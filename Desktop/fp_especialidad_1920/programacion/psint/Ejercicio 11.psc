Algoritmo turnos
	Definir dia Como Caracter;
	Definir turno Como Caracter;
	Definir horas Como Entero;
	Definir empleado Como Caracter;
	Escribir "Dime el nombre del empleado";
	Leer empleado;
	Escribir "Dime cuantas horas ha trabajado";
	Leer horas;
	Escribir "Dime si el turno es diurno o nocturno";
	Leer turno;
	Escribir "Dime si el dia es festivo o laboral"
	Leer dia;
	Si dia = "festivo" y turno = "diurno" entonces;
		Escribir "Su sueldo es";
		Escribir (horas * 10) + (horas * 10 / 100);
	FinSi
	Si dia = "festivo" y turno = "nocturno" Entonces;
		Escribir "Su sueldo es";
		Escribir (horas * 13.5) + (horas * 15 / 100);
	FinSi
	Si dia = "laboral" y turno = "diurno" Entonces;
		Escribir "Su sueldo es";
		Escribir horas * 10;
	FinSi
	Si dia = "laboral" y turno = "nocturno" entonces;
		Escribir "Su sueldo es"
		Escribir horas * 13.5
	FinSi
	
FinAlgoritmo
