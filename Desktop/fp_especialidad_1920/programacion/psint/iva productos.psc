Algoritmo ivaproductos
	Definir precioNeto Como Logico;// el valor por defecto de una variable de un lenguaje de programación es basura!! un valor que no existe
	Definir iva Como Logico;
	Definir precioBruto Como Logico;
	Leer precioNeto;
	Leer iva;
	precioBruto = ( precioNeto * iva ) + precioNeto;
	Escribir precioBruto;
FinAlgoritmo
