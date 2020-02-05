package preg4y5;

import java.util.Scanner;

public class MinusAMayus {

	public static void main(String args[]) {
		
		String cadInicial="";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n\t¡¡Convertiremos la cadena que usted ingrese a mayúsculas!!");
		System.out.println("\nIngrese la cadena a convertir:");
		cadInicial = entrada.nextLine();
		
		MinusAMayus conver1 = new MinusAMayus();
	
		System.out.println("\nLa cadena convertida a maýuscula es:"); 
		System.out.println(conver1.converMay(cadInicial));
		
	}
	
	public String converMay(String cadIngr) {
		
		String cadFinal = cadIngr;
		
		int tamaño = cadIngr.length();
		
		for( int i = 0; i < tamaño; i++) {
				
			char letra = cadIngr.charAt(i);
			
			if(letra>=97 && letra<=122 ) {
				
				char letraM = (char)((int)letra-32);
				
				cadFinal = cadFinal.replace(letra, letraM);
				
			}
			
		}
		
		return cadFinal;
		
	}
	
}
