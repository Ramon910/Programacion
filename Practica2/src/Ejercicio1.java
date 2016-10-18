import java.util.Scanner;//Importamos el scanner de la biblioteca java 

/**
 * Ejercicio1.java
 * Programa ejemplo que ordena tres numeros
 * Ramón Mayor López
 */

public class Ejercicio1 
{
	public static void main(String argumentos[])
	{	//creamos un canal de entrada por tecldo u creamos las variables
	Scanner tecladoNumeros = new Scanner(System.in);
	
	int num1 ; // variable numérica
	int num2 ;
	int num3 ; 
	//pedimos tres numeros y los guardamos en su variables correspndientes
	System.out.println("Introduce tres números");
	num1 = tecladoNumeros.nextInt();
	num2 = tecladoNumeros.nextInt();
	num3 = tecladoNumeros.nextInt();
	//ordenamos los tres numeros y los mostramos por pantalla
	if(num1 <= num2 && num1<= num3) 
	{ if(num2 <= num3) System.out.println(" "+num1+ " " +num2+ " " +num3);}
		else System.out.println(" "+num1+" "+num3+" "+num2);

	
	if(num2 <= num1 && num2<= num3) 
	   { if(num1 <= num3) System.out.println(" "+num2+ " " +num1+ " " +num3);}
		else System.out.println(" "+num2+" "+num3+" "+num1);

	
	if(num3 <= num1 && num3<= num2) 
	  {if(num1 <= num2) System.out.println(" "+num3+ " " +num1+ " " +num2);}
		else System.out.println(" "+num3+" "+num2+" "+num1);

	
	
	
	
	}	
} 
