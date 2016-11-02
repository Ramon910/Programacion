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
	{	// creamos dos entradas por teclado, una para numeros y otra para String y creamos las variables
		
		int valorEntrada, mayor=0, menor=0 , contadorValidos=0  ;
		
		String s ="";
		
		Scanner teclado=new Scanner(System.in);
		Scanner tecladoNumeros=new Scanner(System.in);
		
		
	//Iniciamos un bucle
	//En primer lugar nos aseguramos de que los valores sean validos	
			while(!s.equals("t"))
			{		
			System.out.println("Teclea números entre 1 y 2147483647:");
			System.out.println("Para terminar pulsa 0");
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
	//Examinamos los número y guardamos el mayor y el menor, los demas son desechados.			 
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
//Mostramos el mayor el menor y el numero de número validos introducidos
			System.out.println("El valor mayor es "+mayor);
			System.out.println("El valor menor es "+menor);     
			System.out.println("El numero de datos validos introduces es de  "+contadorValidos);   
		}
	}
	
	

