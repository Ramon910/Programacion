/**
 *Ejercicio2.java
 * programa simple que pida un nombre desde el teclado y lo guarde en una variable de tipo adecuado.
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio2 
{
	public static void main(String argumentos[])
	{	//creamos una entrada por teclado y creamos una cadena de texto
        Scanner teclado = new Scanner(System.in); 
		
        String nombre = "" ;
        //pedimos el nombre y lo guardamos en la variable nombre y lo mostramos
	System.out.println("Introduce tu nombre");
	
	nombre = teclado.nextLine();
	
	System.out.println("" +nombre );
		
	}

}
