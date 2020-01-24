import java.util.Scanner;

public class Monedas {

	public static void main(String args[]) {
	
		int cantIngresada;
		int cont=0;
		int Monedas[] = new int[6];
		int Resultados[] = new int[6];
		Monedas[0]=100;
		Monedas[1]=50;
		Monedas[2]=25;
		Monedas[3]=10;
		Monedas[4]=5;
		Monedas[5]=1;
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Ingrese la cantidad de dinero: ");
		cantIngresada = entrada.nextInt();
		
		while(cantIngresada>0) {
			Resultados[cont]=cantIngresada/Monedas[cont];
			cantIngresada = cantIngresada%Monedas[cont];
			
			cont++;
		}
		
		System.out.println("Se tienen "+Resultados[0]+" reales, "
				+Resultados[1]+" monedas de 50 centavos, "
				+Resultados[2]+" monedas de 25 centavos, "
				+Resultados[3]+" monedas de 10 centavos, "
				+Resultados[4]+" monedas de 5 centavos y "
				+Resultados[5]+" monedas de 1 centavo");
	}
	
	}
