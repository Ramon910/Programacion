import java.util.Scanner;

/**
 * Hola2.java
 * Programa que muestra edad y nombre con entrada por tecaldo
 */

import java.util.Scanner;

public class nombre1
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);
		Scanner tecladoNumeros = new Scanner(System.in);
		
		int num1  ; // variable numéric
		int num2  ;
		String nombre1 = "";		// variable de texto
		String nombre2 = "";
		
		// configura y muestra mensaje de bienvenida
		
		System.out.println("Hola, Soy un modesto ");
		
		System.out.print("programa de ordenador...\n");
		
		System.out.println("persona 1");
		System.out.println("Dime tu nombre y tu edad");

		//Secuencia para introducir por teclado 
		
		nombre1 = teclado.nextLine(); 
		num1 = tecladoNumeros.nextInt();
		
		System.out.println("Persona 2");
		System.out.println("Dime tu nombre y tu edad");

		//Secuencia para introducir por teclado 
		
		nombre2 = teclado.nextLine(); 
		num2 = tecladoNumeros.nextInt();

		
		
		// muestra mensaje personalizado
		
		System.out.println("La persona 1 es " + nombre1 + "y tienes " + num1 + " años." );
		System.out.print("La persona 2 es " + nombre2 + "y tienes " + num2 + " años." );
		
		
	}

}