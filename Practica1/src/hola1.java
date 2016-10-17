//Encontramos un bloque de comentarios que 
//el compilador ignora solo nos sirve para aclaracion propia. 
//Ejemplo
/**
 * Hola1.java
 * Programa ejemplo que muestra un mensaje simple por pantalla.
 * ajp - 2013.09.19
 */
//-Tenemos un encabezado de clase donde nos muestra el nombre y debe coincidir con el fichero.
//Public class indica que se esta declarando una clase. Ejemplo.
public class hola1 
{
	//Encontramos el encabecado del metodo main donde se empezara a ejecutar el programa. 
	//(string[]args) es la lista de argumentos que opcionalmente puede recibir el main(). Ejemplo.
	public static void main(String argumentos[])
	{	
		//Tenemos la sentencia que imprime texto por pantalla. Ejemplo.
		//Muestra un mensaje en la pantalla
		//System.out.print(""); accion para mostrar mensajes en pantalla.
		System.out.print("Hola mundo...\n");
		//Mostramos el nombre del programa
		System.out.print("Nombre del programa: Hola mundo \n");
		//Mostramos la version
		System.out.print("Version del programa: 2.0.1.2 \n");
		//Mostramos por pantalla el nombre del autor
		System.out.print("Nombre del autor: Ramon Mayor Lopez");
	}

}

/**-Los indentificadores se untilizan para establecer nos nombres de las clases,
 *  java es sensible a mayusculas y minusculas.

*-Las palabras reservadas son identificadores especiales que el lenguaje utilizada 
*de forma exclusiva y tienen significadoes especiales dentro de los programas, se utiliza para: 
*Organizar la estructura de los programas.
*Manejar e identificar los tipos de datos primitivos.
*Controlar y manipular objetos.
*Controlar y modificar el acceso a datos en múltiples contextos.
*Controlar la secuencia de ejecución. 

*-Una sentencia es un orden que se le da al programa para realizar una tarea especifica
* y siempre acaban en ; .


*-Las lineas desplazadas es para un mejor entendimineto del codigo, 
*y que algunas palbras se escriban con mayusucula es por su diferenciacion.

*-Si lo ponemos en minuscula el nombre de la clase no se ejecuta porque 
*el nombre de la clase debe tener el mismo nombre que el archivo.
*/ 




