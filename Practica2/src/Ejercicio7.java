/**
 *Ejercicio7.java
 *Programa basico para redondear
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio7 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		
		double  i,b,d,c;
	
		String s ="";
		
		Scanner teclado=new Scanner(System.in);
		Scanner tecladoNumeros=new Scanner(System.in);
		//con un bucle vamos pidiendo los valores y sumandolos
		
		
		
	do{
		
	    System.out.println("Introduce el número");
	    i= tecladoNumeros.nextDouble();
	    System.out.println("¿A cuantas cifras quieres redondear?");
	    b= tecladoNumeros.nextDouble();
		
	    c=Math.pow(10,b);
	    d=Math.rint(i*c)/c;
	    System.out.println("El numero es"+d);
		
	    System.out.println("Si quieres seguir pulsa S si no quieres seguir pulsa cualquir tecla");
        s = teclado.nextLine();
		
	    
		}while (s.equals("s"));
	System.out.println("fin");
	}
}
