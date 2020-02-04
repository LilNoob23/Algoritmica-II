package Ejercicio1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		
		double a;
		double b;
		double c;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Resolveremos una ecuación cuadrática del tipo: ");
		System.out.println("\tax^2 + bx + c");
		
		System.out.println("\nDigite el valor de a: ");
		a = teclado.nextDouble();
		
		System.out.println("\nDigite el valor de b: ");
		b = teclado.nextDouble();
		
		System.out.println("\nDigite el valor de c: ");
		c = teclado.nextDouble();
		
		EcuacionCuadratica ecuac1 = new EcuacionCuadratica(a, b, c);
		
		if(ecuac1.getDiscriminante() > 0) {
			
			System.out.println("\nLos valores de las raíces son: ");
			System.out.println("r1 = " + ecuac1.getRaiz1());
			System.out.println("r2 = " + ecuac1.getRaiz2());
			
		}else if(ecuac1.getDiscriminante() == 0) {
			
			System.out.println("\nTiene una solución única:");
			System.out.println("r = " + ecuac1.getRaiz1());
			
		}else {
			
			System.out.println("\nLa ecuación no tiene raíces reales");
			
		}
		
	}

	
}
