/**
 *Ejercicio5.java
 * Escribe un programa simple que lea una serie de números
 *  enteros por teclado e indique cuál es el mayor de todos ellos.
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio5 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		int n=0;
		
		
		String b ="";
		
		Scanner teclado=new Scanner(System.in);
		
		//con un bucle vamos pidiendo los valores y sumandolos
		
		do{
		   
			
			System.out.println("Si quieres seguir pulsa S si no quieres seguir pulsa cualquir tecla");
			
			b = teclado.nextLine();
			
			//compara un string con un string que metemos a mano 
		}while (b.equals("s"));

		
	// mostramos la suma 
        System.out.println("El número total es "+n);
		
	}
	
}
