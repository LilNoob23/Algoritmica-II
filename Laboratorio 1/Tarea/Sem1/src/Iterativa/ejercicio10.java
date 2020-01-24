package Iterativa;

import java.io.*;

public class ejercicio10 {

	public static void main(String args[]) throws IOException {
		
		int n=0;
		int sumNumImp=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el valor del número 'n':");
		String entrada=br.readLine();
		n=Integer.parseInt(entrada);
		
		for(int i=1; i<=n; i++) {
			
			if(i%2!=0) {
				
				sumNumImp += i;
				
			}
			
		}
		
		System.out.println("La suma de los números impares del 1 al "+n+" es "+sumNumImp);
		
	}
	
}
