package view;

import controller.FibonacciRecController;

public class Principal {

		public static void main(String[] args) {
			
			FibonacciRecController fr = new FibonacciRecController();
	        // Testando a fun��o para valores de 1 a 20
	        int n = 20; // Posi��o desejada na s�rie de Fibonacci
	        
	        int fib = fr.fib(n);
	        
	        System.out.println("Fibonacci de posi��o " + n + " �: " + fib);
	    }

}
