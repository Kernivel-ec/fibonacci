package com.kernivel.fibonacci;

/*
 *
 * @author ING. Roberto Calero
 * www.kernivel.com
 *
 */

/*
 * Reto #3
 * LA SUCESIÓN DE FIBONACCI
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci");
        // Recuerda que long tienes mas capacidad de bits y puede almacenas numeros grandes en comparacion con int
        //Se da una explicacion al final del codigo.
        long numeroUno = 0, numeroDos = 1;
        
        for(int x = 1 ; x <= 50; x++){
            
            System.out.println(numeroUno);
            long aux = numeroUno + numeroDos;
            numeroUno = numeroDos;
            numeroDos = aux;
            
        }
        
    }
    
}

/*
* Si utilizas int surgira un problema, que al tener cantidades demasiado grandes ocurre que se obtienen
* valores fuera del rango de bits que soporta int, lo cual genera valores negativos.
* Puedes utilizar este codigo para verificar.
* La utilizacion correcta de variables y sus tipos en entornos profesionales son de vital impotancia,
* lo sucedido en este codigo es un ejemplo de ello.
*
* int numeroUno = 0, numeroDos = 1;
*        
*        for(int x = 1 ; x <= 50; x++){
*            
*            System.out.println(numeroUno);
*            int aux = numeroUno + numeroDos;
*            numeroUno = numeroDos;
*            numeroDos = aux;
*            
*        }
*/
