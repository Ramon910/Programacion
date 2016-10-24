/**
 *Ejercicio4.java
 * programa simple que lea exactamente 8 números enteros y luego escriba la suma de todos ellos.
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio3 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		int n=0;
		int i ;
		Scanner teclado=new Scanner(System.in);
		
		//con un bucle vamos pidiendo los valores y sumandolos
		for ( i = 0; i < 8; i++) 
		{
			System.out.println("Introduce un número: ");
			n=n + teclado.nextInt();
		}
	// mostramos la suma 
        System.out.println("El número total es "+n);
		
	}
	
}
