package selectiva;

import java.io.*;

public class ejercicio3 {

	public static void main(String args[]) throws IOException {
		
		int num1=0;
		int num2=0;
		int num3=0;
		int numMayor=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese el primer n�mero para encontrar el valor medio: ");
		String entrada=br.readLine();
		num1 = Integer.parseInt(entrada);
		System.out.println("Ingrese el segundo n�mero: ");
		entrada=br.readLine();
		num2 = Integer.parseInt(entrada);
		System.out.println("Ingrese el tercer n�mero: ");
		entrada=br.readLine();
		num3 = Integer.parseInt(entrada);
		
		if((num1>num2&&num2>num3)||(num3>num2&&num2>num1)) {
			System.out.println("El n�mero intermedio es "+num2);
		}else if((num2>num1&&num1>num3)||(num3>num1&&num1>num2)){
			System.out.println("El n�mero intermedio es "+num1);
		}else if((num1>num3&&num3>num2)||(num2>num3&&num3>num1)) {
			System.out.println("El n�mero intermedio es "+num3);
		}
		
	}
	
}
