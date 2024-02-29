/*
 * 5. 
 * Considere a s�rie de Fibonacci: 
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 *  
 * Que pode ser definida por :
 * Fib(n) = 1 se n=1 v n=2
 * Fib(n) = Fib(n-1) + Fib(n-2) se n>2
 * 
 * Escrever uma fun��o recursiva que, 
 * dado uma posi��o da s�rie, a fun��o retorne seu valor. 
 * Entrada limitada a 20
 * (Condi��o que deve ser testada na Main da aplica��o).
 * 
 * � O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a condi��o de parada;
 * 
 * � O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a rela��o de chamada dos passos.
 * 
*/

package controller;

public class FibonacciRecController {

	public FibonacciRecController() {
			
			super();
			
		}

	public static int fib(int n) {
		
	        // Condi��o de parada: se n for 1 ou 2, retorna 1
	        if (n == 1 || n == 2) {
	            return 1;
	        }
	        
	        // Rela��o de chamada dos passos: 
	        //soma dos dois n�meros anteriores na s�rie de Fibonacci
	        return fib(n - 1) + fib(n - 2);
	    }
}

	
