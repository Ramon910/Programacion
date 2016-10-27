/**
 *Ejercicio8.java
 *Programa basico crear un cuadrado de asteriscos
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio8 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		
		Scanner teclado = new Scanner(System.in); 
		
	int contador, contador2 , contador3 ;
	int NAsteriscos; 
	//pedimos el numero de asteriscos
	System.out.println("numero de asteriscos para el lado");
	NAsteriscos = teclado.nextInt();
	
	//creamos el cuadrado
	for(contador=0 ; contador< (NAsteriscos) ; contador++)
	{
		System.out.print("$");
		
	}
		
	System.out.println("");
		
	for(contador=0 ; contador< NAsteriscos ; contador++)
	{
		System.out.print("$");
       for(contador2=0; contador2<(NAsteriscos-2);contador2++)
       {
    	   System.out.print(" ");
    	
    
    	  
       }
    System.out.print("$");   
	System.out.println("");
	}
	for(contador=0 ; contador< NAsteriscos ; contador++)
	{
		System.out.print("$");
	
	}
		
	System.out.println("");
	
		
	
	}
}
