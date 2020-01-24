package selectiva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio6 {

	public static void main(String args[]) throws IOException {
		
		int lado1=0;
		int lado2=0;
		int lado3=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese el valor del lado 1: ");
		String entrada = br.readLine();
		lado1=Integer.parseInt(entrada);
		System.out.println("Ingrese el valor del lado 2: ");
		entrada = br.readLine();
		lado2=Integer.parseInt(entrada);
		System.out.println("Ingrese el valor del lado 3: ");
		entrada = br.readLine();
		lado3=Integer.parseInt(entrada);
		
	
		if(lado1>0&&lado2>0&&lado3>0) {
			
			if(((Math.abs(lado3-lado2)<lado1)&&(lado1<Math.abs(lado2+lado3)))&&((Math.abs(lado3-lado1)<lado2)&&(lado2<Math.abs(lado1+lado3)))&&((Math.abs(lado2-lado1)<lado3)&&(lado1<Math.abs(lado1+lado2)))) {
				
				
				System.out.println("El triángulo de lados "+lado1+", "+lado2+" y "+lado3+" existe"); 
				
				if((lado1==lado2)&&(lado2==lado3)) {
					
					System.out.println("El triángulo es un equilátero");
					
				}else if((lado1==lado2)||(lado2==lado3)||(lado1==lado3)) {
					
					System.out.println("El triángulo es un iscóceles");
					
				}else {
					
					System.out.println("El triángulo es un escaleno");
					
				}
		
				
			}else {
				
				System.out.println("Al no cumplir la condición de lados, el triángulo no existe");
				
			}
			
		}else {
			
			System.out.println("Al no ser todos los lados positivos, el triángulo no existe");
			
		}
		
		
		
	}
	
}
