Algoritmo ejercicio4_repetir
	//{
	Definir n Como entero;
	Definir invertido como entero;
	Definir paras como entero;
	Escribir "Escribe un número de 4 cifras";
	Leer n; //si es 1234 ---> 4321
	paras=0
	invertido=0
	Si (n>999) y (n<10000) Entonces
		Repetir
			paras=paras+1
			n=n/10 //aqui es 123
			invertido=n%10 //con su resto 4, porque lo hemos dividido entre 10
			invertido = (invertido*10) + (n%10) //y aqui al resto 4 lo ponemos como 40 y le sumamos 3, con lo que es 43
		Hasta Que paras=4 
	FinSi
	Escribir invertido;
FinAlgoritmo
