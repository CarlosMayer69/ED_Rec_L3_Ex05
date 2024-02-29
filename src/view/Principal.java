package view;

import controller.FibonacciRecController;

public class Principal {

		public static void main(String[] args) {
			
			FibonacciRecController fr = new FibonacciRecController();
	        // Testando a função para valores de 1 a 20
	        int n = 20; // Posição desejada na série de Fibonacci
	        
	        int fib = fr.fib(n);
	        
	        System.out.println("Fibonacci de posição " + n + " é: " + fib);
	    }

}
