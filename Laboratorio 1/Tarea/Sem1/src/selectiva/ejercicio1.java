package selectiva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1 {

	public static void main(String args[]) throws IOException {
		
		int numIngr=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el número para determinar si es par o impar: ");
		String entrada=br.readLine();
		numIngr = Integer.parseInt(entrada);
		
		if(numIngr%2==0) {
			System.out.println("El número "+numIngr+" es par");
		}else {
			System.out.println("El número "+numIngr+" es impar");
		}
		
	}
	
}
