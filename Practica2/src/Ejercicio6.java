/**
 *Ejercicio6.java
 *Escribe un programa simple que escriba todos los múltiplos de 3 comprendidos entre 1 y 3000.
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio6 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		
		int  i=1 ;
	
		
		
		while (i<=3000)
		{
			
		   if(i%3==0){System.out.println("El número " +i+ " es multiplo de 3"); }
			i++;
		}
		
		
		System.out.println("fin");
		}
	
}
