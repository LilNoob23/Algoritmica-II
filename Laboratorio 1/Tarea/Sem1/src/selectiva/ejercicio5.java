package selectiva;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String args[]) {
		
		int m=0;
		int n=0;
		int q=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el valor de m: ");
		m=entrada.nextInt();
		System.out.println("Digite el valor de n: ");
		n=entrada.nextInt();
		System.out.println("Digite el valor de q: ");
		q=entrada.nextInt();
		
		if((m%n==0)&&(m%q==0)) {
			System.out.println("El número "+m+" es múltiplo de "+n+" y "+q);
		}else {
			System.out.println("El número "+m+" no es múltiplo de "+n+" y "+q);
		}
		
	}
	
}
