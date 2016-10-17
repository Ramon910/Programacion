/** 
 * autoevaluacion.java
 * Programa que compara dos numeros y te dice el mayor
 * 
 */

import java.util.Scanner;

public class autoevaluacion 
{
    public static void main(String argumentos[]) {
        
        //la siguiente linea establece una entrada por tecaldo
        //necesitamos la libreria juvil.util
        Scanner teclado = new Scanner(System.in);

        int num ;               // creamor la variable de tipo int num
       
        // ponemos la variable num a 1 y tenemos tres sentencias que nos muestra por pantalla.
        num = 1 ;
        System.out.println("Hola, Soy un modesto ");
        System.out.print("programa de ordenador...\n");
        System.out.println("Mi número de orden es el " + num + " por ser el primero.");

        // pedimos dos numeros mediante la entrada por tecaldo 
        // los guardamos en la variable dato1 y dato2 de tipo int
        System.out.println("Escribe dos números...\n");
        int dato1 = teclado.nextInt();
        int dato2 = teclado.nextInt();

        // nos muestra por pantalla los numeros que hemos introducido
        System.out.println("Dato1: " + dato1);
        System.out.println("Dato2: " + dato2);

        // compara los dos numeros y nos dice el mayor o si son iguales
        String mensaje = "";

        if (dato1 == dato2) {
            mensaje = "Ninguno de los dos es mayor... ";
        }

        if (dato1 > dato2) {
            mensaje = "El mayor es: " + dato1;
        }

        if (dato2 > dato1) {
            mensaje = "El mayor es: " + dato2;
        }

        System.out.println(mensaje);
    }

}
