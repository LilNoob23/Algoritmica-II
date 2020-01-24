package Iterativa;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		int numIngr=0;
		int cociente=0;
		int sumCifras=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el valor del número: ");
		numIngr=entrada.nextInt();
		
		System.out.print("La suma de cifras de "+numIngr);
		
		do {
			
			sumCifras += numIngr % 10;
			numIngr=numIngr/10;
			
		}while(numIngr>0);

		System.out.println(" es "+sumCifras);
		
	}

}
