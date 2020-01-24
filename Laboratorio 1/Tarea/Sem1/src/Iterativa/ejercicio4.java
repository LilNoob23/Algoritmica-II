package Iterativa;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String args[]) {
		
		int numIngr=0;
		int sumDiv=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del número: ");
		numIngr=entrada.nextInt();
		
		for(int i=1; i<numIngr; i++) {
			
			if(numIngr%i==0) {
			
				sumDiv = sumDiv + i;
				
			}
			
		}
		
		if(sumDiv==numIngr) {
			
			System.out.println("El número "+numIngr+" es un número perfecto");
			
		}else {
			
			System.out.println("El número "+numIngr+" no es un número perfecto");
		}
		
	}
	
}
