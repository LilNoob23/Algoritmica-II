package Ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {
		
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Resolveremos un sistema de ecuaciones lineales del tipo:");
		System.out.println("\tax + by = e");
		System.out.println("\tcx + dy = f");
		
		System.out.println("\nDigite el valor de a:");
		a = entrada.nextDouble();
		
		System.out.println("\nDigite el valor de b:");
		b = entrada.nextDouble();

		System.out.println("\nDigite el valor de c:");
		c = entrada.nextDouble();

		System.out.println("\nDigite el valor de d:");
		d = entrada.nextDouble();

		System.out.println("\nDigite el valor de e:");
		e = entrada.nextDouble();

		System.out.println("\nDigite el valor de f:");
		f = entrada.nextDouble();
		
		EcuacionLineal ecuac1 = new EcuacionLineal(a, b, c, d, e, f);
		
		if(ecuac1.esResoluble()) {
			
			System.out.println("\nEl resultado es :");
			System.out.println("x = " + ecuac1.getX());
			System.out.println("y = " + ecuac1.getY());
			
		}else {
			
			System.out.println("\nLa ecuación no tiene solución");
		}

	}
	
}
