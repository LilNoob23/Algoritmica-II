package secuencial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio5 {

	public static void main(String args[]) throws IOException {
		
		double angRad=0;
		double minutos=0;
		double segundos=0;
		double grados=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		System.out.println("Ingrese el valor del ángulo en radianes: ");
		String entrada = br.readLine();
		angRad=Integer.parseInt(entrada);
		
		//aux=Math.round(aux*100)/100d;
		
		grados=angRad*180/3.1415;
		minutos=grados%1;
		grados=grados/1;
		
		minutos=minutos*60;
		segundos=minutos*60;
		minutos=minutos/1;
		
		segundos=segundos*60;
		
		int gradosF=(int)grados;
		int minutosF=(int)minutos;
		int segundosF=(int)segundos;
		
		System.out.println("El ángulo "+angRad+" rad equivale a "+gradosF+
				"\n grados sexagesimales, "+minutosF+" minutos y "+segundosF+" segundos");
		
	}
	
}
