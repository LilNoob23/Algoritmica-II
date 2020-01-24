package laboratorio;

import java.util.Scanner;

public class ejercTriang {

	public static void main(String args[]) {
		
		double x1=0; 
		double y1=0;
		double x2=0; 
		double y2=0;
		double x3=0; 
		double y3=0;
		double lado1=0;
		double lado2=0;
		double lado3=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite la abcisa de la primera coordenada: ");
		x1=entrada.nextInt();
		System.out.println("Digite la ordenada de la primera coordenada: ");
		y1=entrada.nextInt();
		System.out.println("Digite la abcisa de la segunda coordenada: ");
		x2=entrada.nextInt();
		System.out.println("Digite la ordenada de la segunda coordenada: ");
		y2=entrada.nextInt();
		System.out.println("Digite la abcisa de la tercera coordenada: ");
		x3=entrada.nextInt();
		System.out.println("Digite la ordenada de la tercera coordenada: ");
		y3=entrada.nextInt();
		
		lado1=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		lado2=Math.sqrt(Math.pow((x3-x2), 2)+Math.pow((y3-y2),2));
		lado3=Math.sqrt(Math.pow((x3-x1), 2)+Math.pow((y3-y1),2));
		
		if((lado1==lado2)&&(lado2==lado3)) {
			System.out.println("El triángulo de lados "+lado1+","+lado2+" y "+lado3+" es equilátero");
		}else if((lado1==lado2)||(lado1==lado3)||(lado2==lado3)) {
			System.out.println("El triángulo de lados "+lado1+","+lado2+" y "+lado3+" es isósceles");
		}else{
			System.out.println("El triángulo de lados "+lado1+","+lado2+" y "+lado3+" es escaleno");
		}
		
		
	}
	
}
