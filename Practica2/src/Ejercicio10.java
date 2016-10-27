/**
 *Ejercicio10.java
 *Escribe un programa simple que pida tres valores reales a, b, c 
 *Calcule las soluciones reales X1 y X2 de una ecuación de segundo grado de la forma ax2 + bx + c = 0.
 * Ramón Mayor López
 */
import java.util.Scanner;//importamos el paquete Scanner de la biblioteca
import java.lang.Math;
import java.math.MathContext;
public class Ejercicio10 
{
	public static void main(String argumentos[])
	{	// creamos una entrada por teclado y creamos las variables
		
		Scanner teclado = new Scanner(System.in); 
		double  b, a, c,d=0;
		double x1 ,x2;
		System.out.println("Introduce la variable a");
		a= teclado.nextDouble();
		System.out.println("Introduce la variable b");
		b= teclado.nextDouble();
		System.out.println("Introduce la variable c");
		c= teclado.nextDouble();
         
		if(a==0 && b==0)
			{
				System.out.println("Ecuacion denegada");
			}
		  else{ 
			  if(a==0 && b!=0)
			  	{ 
				  x1=(-c/b); 
				  System.out.println("El resultado es "+x1);
				}
		         else{ d = (int)(Math.pow(b,2) - 4*a*c) ; 
					if(d>=0)
					   {
						x1=(-b + (double)Math.sqrt(d)) / (2*a);
						x2=(-b - (double)Math.sqrt(d)) / (2*a);
						System.out.println("el resultado es x1="+x1+ " y x2="+x2);
					   }
					 else{
						   System.out.println("El resultado es una raiz compleja de resultado: x + yi y x - yi");
					     }
					}
		  	  }
					 	
						
	                
		 
		    
	}
}


