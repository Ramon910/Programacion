/**
 *Ejercicio3.java
 * Escribe un programa simple que calcule el interés producido y 
 * el capital total acumulado de un capital inicial invertido a un tipo de interés anual.
 * Ramón Mayor López
 */
import java.util.Scanner; //Importamos la clase Scanner 
import java.lang.Math; //Importamos la clase Math de la biblioteca del API Java

public class Ejercicio3 
{
	public static void main(String argumentos[])
	{
		//Creamos una entrada por teclado y creamos las variables necesarias
        Scanner teclado = new Scanner(System.in); 
		int n ; //numero de años
        double r ;//interes
        double cf; //capital final
        int ci;//capital inicial
        double i ; //interes 
     // Pedimos las entradas por teclado   
	System.out.println("Introduce el capital inical");
	ci = teclado.nextInt();
	
	System.out.println("Introduce el interes");
	r = teclado.nextDouble();	
	
	System.out.println("Introduce el número de años");
	n = teclado.nextInt();	
	//Mostramos los valores introducidos
	System.out.println("El capital inicial es " +ci);  
	System.out.println("El interes es de un "+r+"%");
	System.out.println("El nñumero de años es de "+n);
	
	//calculamos el interes y lo mostramos
	i = (1 + r) ; 
       i = (double)Math.pow(i, n);   // calcula num2
       
       System.out.println("El interes en "+n+" años es de " +i);
       //calculamos el capital final y lo mostramos
       cf = ci * i ;
       
       System.out.println("El capital final es de "+cf);
       
	
	}

}
