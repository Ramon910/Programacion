/**
 *Ejercicio5.java
 * Escribe un programa simple que lea tantos números enteros como se quiera mientras no sea un cero, que terminaría. 
 *Cuando termina la entrada, se muestra, como resultado, la suma de todos los números leídos y su media aritmética.
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Ejercicio5 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		double n=0;
		double a,i=0 ;
		double m;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Cuando quieras terminar pulsa el numero 0");
		
		
		do{
			System.out.println("Introduce un número: ");
			a=teclado.nextInt();
			
			n=n + a ;	
			i++;
			
			//compara un string con un string que metemos a mano 
		}while (a != 0);		
	//hacemos la media 
		m=n/(i-1);
	// mostramos la suma y la media
        System.out.println("El número total es "+n);
        System.out.println("La media " +m);
		
	}
	
}
