Algoritmo ayuda_alumno
	Definir nota_final Como real;
	Definir matricula como entero;
	Definir nota_materia1 como entero;
	Definir nota_materia2 como entero;
	Definir nota_materia3 como entero;
	Definir nota_materia4 como entero;
	Definir nota_materia5 como entero;
	Definir nota_materia6 como entero;
	Escribir "Dime las nota del alumno";
	Leer nota_materia1;
	Leer nota_materia2;
	Leer nota_materia3;
	Leer nota_materia4;
	Leer nota_materia5;
	Leer nota_materia6;
	nota_final = (nota_materia1 + nota_materia2 + nota_materia3 + nota_materia4 + nota_materia5 + nota_materia6) / 6;
	Escribir "La nota final del alumnos es";
	Escribir nota_final;
	Escribir "Dime cuanto vale su matricula";
	Leer matricula;
	Escribir "El precio de la matricula es"
	Si nota_final >= 4 entonces;
		Escribir matricula - (matricula * 30 / 100)
	SiNo
		Escribir matricula + (matricula * 10 / 100)
	FinSi
	
	
	
FinAlgoritmo
