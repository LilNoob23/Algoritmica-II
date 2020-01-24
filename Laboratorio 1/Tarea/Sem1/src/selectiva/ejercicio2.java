package selectiva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio2 {

	public static void main(String args[]) throws IOException{
		
		double primNum=0;
		double segNum=0;
		double res=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el primer número a operar: ");
		String entrada=br.readLine();
		primNum=Integer.parseInt(entrada);
		System.out.println("Ingrese el segundo número a operar: ");
		entrada=br.readLine();
		segNum=Integer.parseInt(entrada);
		
		if(primNum>0&&segNum>0) {
			res = primNum*segNum;
			System.out.println("Como ambos números son positivos el resultado de su multiplicación es "+res);
		}else {
			res = primNum + segNum;
			System.out.println("Al ser el caso contrario el resultado de su suma es "+res);
		}
		
	}
	
}
