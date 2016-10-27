/**
 *Autoevaluacion.java
 * Escritura de un programa que lee una serie de datos por teclado 
 * y después muestra por pantalla el mayor y el menos de todos ellos 
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
public class Autoevaluacion 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		
		int valorEntrada, mayor=0, menor=0 , contadorValidos=0  ;
		
		String s ="";
		
		Scanner teclado=new Scanner(System.in);
		Scanner tecladoNumeros=new Scanner(System.in);
		//con un bucle vamos pidiendo los valores y sumandolos
		
	
			while(!s.equals("t"))
			{	
				
				
			System.out.println("Introduce un número, si es 0 dejaras de introducir números:");
			valorEntrada =tecladoNumeros.nextInt();
			
			if(valorEntrada<=0)
			  {
				if(valorEntrada == 0 || valorEntrada<0 && contadorValidos<2)
				{
					System.out.println("Error");
				}else
			      {
				     System.out.println("Si quieres seguir pulsa t si no quieres seguir pulsa cualquir tecla");
					   s = teclado.nextLine();
			      }
			  }else
			 
		   {
			if(valorEntrada >= mayor)
			{
			   mayor=valorEntrada;
				
			}
			
			else{ if(valorEntrada!=0){menor=valorEntrada;}}
			contadorValidos++;
			
			
			}
			
			
		}
			System.out.println("El valor mayor es "+mayor);
			System.out.println("El valor menor es "+menor);     
	}
	}
	

