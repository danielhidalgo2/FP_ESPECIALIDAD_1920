Algoritmo Clasificacion_triangulos
	Definir n Como Entero;
	Definir m Como Entero;
	Definir ñ Como Entero;
	
	Leer n, m, ñ;
	
	Si (n = m) y (m = ñ) y (n = ñ) Entonces
		Escribir "soy equilatero";
	FinSi
	Si (n=m y ñ<>m y ñ<>n) o (n<>m y m<>ñ y ñ=n) o (n<>m y n<>ñ y m=ñ)  Entonces
		Escribir "soy isósceles"
	FinSi
	Si (n<>m) y (m<>ñ) y (ñ<>n) Entonces
		Escribir "soy escaleno"
	FinSi
	
FinAlgoritmo
