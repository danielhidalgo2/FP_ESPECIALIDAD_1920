Algoritmo area_circulo_subproceso //area circulo = pi*r^2
	Definir n Como Entero; //le das una variable
	Escribir "Dime el radio del circulo";
	Leer n; //te lee la variable
	areacirculo(n); //de aqui salta a donde pone lo mismo del subalgoritmo
FinAlgoritmo

SubAlgoritmo areacirculo(n) //de aqui sigue normal
	Escribir "El area del circulo es " (pi*n^2) //te escribe lo que le pides, y ready
FinSubAlgoritmo 