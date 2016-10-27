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
		
		
	
			while(!s.equals("t"))
			{	
				
				
			System.out.println("Introduce un número, si es 0 dejaras de introducir números:");
			valorEntrada =tecladoNumeros.nextInt();
			
			if(valorEntrada<=0)
			{
				if(valorEntrada == 0 && contadorValidos<2 || valorEntrada<0 )
				{
					System.out.println("Error");
				}else
			      {
				     System.out.println("Confirma que has terminado pulsando: t");
					   s = teclado.nextLine();
			      }
				continue;
			  }
				 
			   if(contadorValidos==0)
			   	{
				  mayor=valorEntrada;
			   	}
			   
			   if(contadorValidos == 1)
			   {
				  if(valorEntrada >= mayor)
				  {
					  menor=mayor;
					  mayor = valorEntrada;  
				  }
			   }
			   if(contadorValidos>=2)
			   {
				   if(valorEntrada >= mayor)
					  {
						  mayor = valorEntrada;  
					  }
				   if(valorEntrada<=menor)
				   {
					   menor = valorEntrada;
				   }
			   }
			contadorValidos++;   
			
			
			}

			System.out.println("El valor mayor es "+mayor);
			System.out.println("El valor menor es "+menor);     
			System.out.println("El numero de datos validos introduces es de  "+contadorValidos);   
		}
	}
	
	

