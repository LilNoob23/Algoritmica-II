package Iterativa;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String args[]) {
		
		long num=0;
		long falta=0;
		long numInver=0;
		long rest=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el valor que desea evaluar: ");
		num=entrada.nextLong();
		
		falta=num;
		numInver=0;
		rest=0;
		
		while(falta!=0) {
			
			rest=falta%10;
			numInver=numInver*10+rest;
			falta=falta/10;	
			
		}
		
		if(numInver==num)
			System.out.println("El número es capicúa");
		else
			System.out.println("El número no es capicúa");
	}
	
}
