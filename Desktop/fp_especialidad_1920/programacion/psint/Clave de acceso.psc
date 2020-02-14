Algoritmo Clave_de_acceso
	Definir user Como Caracter
	Definir Pass Como Entero
	user <- "Admin"
	pass <- 123456
	Escribir "Usuario"
	Leer user
	Si user= "Admin" Entonces
		Escribir "Verdadero"
	FinSi
	Si user != "Admin" Entonces
		Escribir "Incorrecto"
	FinSi
	Escribir "Contraseña"
	Leer pass
	Si pass = 123456 entonces
		Escribir "Verdadero"
	FinSi
	Si pass != 123456 Entonces
		Escribir "Incorrecto"
	FinSi
FinAlgoritmo

