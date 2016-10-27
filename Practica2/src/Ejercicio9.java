/**
 *Ejercicio9.java
 *Programa basico que calcula un factorial
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio9 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		
		Scanner teclado = new Scanner(System.in); 
		
	int numero, factorial=1;
	
	//pedimos el numero 
	System.out.println("Introduce el numero");
	numero = teclado.nextInt();
	
	//calculamos el factorial y lo mostramos
	while(numero > 0){
		
		factorial=factorial*numero;
		numero--;
		
	     }
	
	System.out.println(factorial);
	
	
	
	
		
	
	}
}
