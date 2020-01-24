package secuencial;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String args[]) {
		
		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		double dist=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el valor de la abcisa del primer punto: ");
		x1=entrada.nextInt();
		System.out.println("Digite el valor de la ordenada del primer punto: ");
		y1=entrada.nextInt();
		System.out.println("Digite el valor de la abcisa del segundo punto: ");
		x2=entrada.nextInt();
		System.out.println("Digite el valor de la abcisa del segundo punto: ");
		y2=entrada.nextInt();
		
		dist = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		System.out.println("La distancia entre los dos puntos es "+dist);
		
	}
	
}
