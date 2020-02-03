package FigGeo;

import java.util.Scanner;

public class Principal {

	static Scanner entrada = new Scanner(System.in); 
	
	public static void main(String args[]) {
		
		escogerFigura();
		
		
	}
	
	public static void escogerFigura() {
		
		int eleccion;
		char rpta;
		
		do {
			
			do {
				
				System.out.println("Escoja la posición de la figura de la cual desea hallar el área: ");
				System.out.println("1.- Cuadrado");
				System.out.println("2.- Rectángulo");
				System.out.println("3.- Triángulo");
				System.out.println("4.- Círculo");
				System.out.println("Elección: ");
				eleccion = entrada.nextInt();
				
			}while(eleccion<1||eleccion>4);

			switch(eleccion) {
			
			case 1: calcularAreaCuadrado();
				break;
			case 2: calcularAreaRectangulo();
				break;
			case 3: calcularAreaTriangulo();
				break;
			case 4: calcularAreaCirculo();
				break;
				default: System.out.println("Ingrese un valor correcto");
			}
			
			System.out.print("Desea hallar otra área(s/n) => ");
			rpta=entrada.next().charAt(0);
			System.out.println("");
			
		}while(rpta=='s'||rpta=='S');
		
		System.out.println("Gracias por usar el programa");
		
	}
	
	public static void calcularAreaCuadrado() {
		
		double lado1;
		
		System.out.println("Ingrese el valor del lado: ");
		lado1 = entrada.nextDouble();
		
		Cuadrado cuadrado = new Cuadrado(lado1);
		
		System.out.println(cuadrado.toString());
		System.out.println("El área es "+cuadrado.calcularArea());
		
	}
	
	public static void calcularAreaRectangulo() {
		
		double base;
		double altura;
		
		System.out.println("Ingrese el valor de la base: ");
		base = entrada.nextDouble();
		
		System.out.println("Ingrese el valor de la altura: ");
		altura = entrada.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(base, altura);
		
		System.out.println(rectangulo.toString());
		System.out.println("El área es "+rectangulo.calcularArea());
		
	}
	
	public static void calcularAreaTriangulo() {
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.println("Ingrese el valor del primer lado: ");
		lado1 = entrada.nextDouble();
		System.out.println("Ingrese el valor del lado segundo: ");
		lado2 = entrada.nextDouble();
		System.out.println("Ingrese el valor del tecer lado: ");
		lado3 = entrada.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		
		System.out.println(triangulo.toString());
		System.out.println("El área es "+triangulo.calcularArea());
		
	}
	
	public static void calcularAreaCirculo() {
		
		double radio;
		
		System.out.println("Ingrese el valor del radio: ");
		radio = entrada.nextDouble();
		
		Circulo circulo = new Circulo(radio);
		
		System.out.println(circulo.toString());
		System.out.println("El área es "+circulo.calcularArea());
		
	}
	
}
