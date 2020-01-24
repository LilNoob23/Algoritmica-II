package secuencial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio6 {

	public static void main(String args[]) throws IOException {
		
		int primNum=0;
		int segNum=0;
		int res=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Ingrese el primer número que representará el día y mes\n"
							+ " de su nacimiento, por ejemplo 1 de julio será 107: ");
		String entrada = br.readLine();
		primNum=Integer.parseInt(entrada);
		System.out.println("Ingrese el segundo número, representado por su edad:");
		entrada = br.readLine();
		segNum=Integer.parseInt(entrada);
		
		res=(primNum*2+5)*50+segNum+365-615;
		
		System.out.println("El resultado es :"+res);
		
	}
	
}
