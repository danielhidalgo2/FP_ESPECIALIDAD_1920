Algoritmo Descuento_octubre
	Definir mes Como Caracter;
	Definir importe Como Entero;
	Escribir "¿Mes de la compra?";
	Leer mes;
	Escribir "Dime el importe"
	Leer importe;
	Si mes = "Octubre" entonces;
		Escribir "El precio es";
		Escribir importe - (importe * 15 / 100);
	SiNo;
		Escribir "El precio es";
		Escribir importe;
	FinSi
	
FinAlgoritmo
