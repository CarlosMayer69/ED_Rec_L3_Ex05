/*
 * 5. 
 * Considere a série de Fibonacci: 
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 *  
 * Que pode ser definida por :
 * Fib(n) = 1 se n=1 v n=2
 * Fib(n) = Fib(n-1) + Fib(n-2) se n>2
 * 
 * Escrever uma função recursiva que, 
 * dado uma posição da série, a função retorne seu valor. 
 * Entrada limitada a 20
 * (Condição que deve ser testada na Main da aplicação).
 * 
 * • O Código deve apresentar, em formato de comentário, 
 * como foi definida a condição de parada;
 * 
 * • O Código deve apresentar, em formato de comentário, 
 * como foi definida a relação de chamada dos passos.
 * 
*/

package controller;

public class FibonacciRecController {

	public FibonacciRecController() {
			
			super();
			
		}

	public static int fib(int n) {
		
	        // Condição de parada: se n for 1 ou 2, retorna 1
	        if (n == 1 || n == 2) {
	            return 1;
	        }
	        
	        // Relação de chamada dos passos: 
	        //soma dos dois números anteriores na série de Fibonacci
	        return fib(n - 1) + fib(n - 2);
	    }
}

	
