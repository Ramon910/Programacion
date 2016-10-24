/**
 *Ejercicio5.java
 * Escribe un programa simple que lea una serie de números
 *  enteros por teclado e indique cuál es el mayor de todos ellos.
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio4 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		
		int a=0, b=0 ;
		
		String s ="";
		
		Scanner teclado=new Scanner(System.in);
		Scanner tecladoNumeros=new Scanner(System.in);
		//con un bucle vamos pidiendo los valores y sumandolos
		
		do{
			System.out.println("Introduce un número: ");
			b=tecladoNumeros.nextInt();
			
			if(a >= b)
			{
				System.out.println("El mayor es " +a);
			
			
			}
			else System.out.println("El mayor es "+b); a=b;
		
			System.out.println("Si quieres seguir pulsa S si no quieres seguir pulsa cualquir tecla");
			s = teclado.nextLine();
			
			//compara un string con un string que metemos a mano 
		}while (s.equals("s"));
		
		System.out.println("fin");
		
		

		
		
	}
	
}
