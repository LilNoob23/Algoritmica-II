package Iterativa;

import java.io.*;

public class ejercicio3 {

	public static void main(String args[]) throws IOException{
		
		int numIngr=0;
		int cantDiv=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite el valor del número: ");
		String entrada = br.readLine();
		numIngr=Integer.parseInt(entrada);
		
		for(int i=1; i<=numIngr; i++) {
			
			if(numIngr%i==0) {
				
				cantDiv++;
				
			}
			
		}
		
		if(cantDiv==2) {
			
			System.out.println("Es primo");
			
		}else {
			
			System.out.println("No es primo");
			
		}
		
	}
	
}
