Algoritmo ejercicio17
	Definir nombre Como Caracter;
	Definir practica Como real;
	Definir problemas Como real;
	Definir teoria Como real;
	Definir nota como real;
	Escribir "Escribe el nombre del alumno";
	Leer nombre;
	Escribir "Escribe la nota de la parte práctica";
	Leer practica;
	Escribir "Escribe la nota de la parte de problemas";
	Leer problemas;
	Escribir "Escribe la nota de la parte teórica";
	Leer teoria;
	Escribir "La nota del alumno " nombre " es";
	nota = (practica * 10 / 100) + (problemas * 50 / 100) + (teoria * 40 / 100)
	Escribir nota;
FinAlgoritmo
