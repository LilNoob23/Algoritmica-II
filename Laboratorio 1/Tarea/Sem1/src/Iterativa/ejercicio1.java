package Iterativa;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String args[]) {
		
		int num1=0;
		int num2=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del primer número: ");
		num1=entrada.nextInt();
		System.out.println("Ingrese el valor del segundo número: ");
		num1=entrada.nextInt();
			
			System.out.println("Los divisores comunes son: ");
			
			for(int i=2; i<=num2 || i<=num1; i++) {
				
				if(num1 % i == 0 && num2 % i == 0) {
					
					System.out.print (i+" ");
					
				}
				
			}
			
	
}
	
}
