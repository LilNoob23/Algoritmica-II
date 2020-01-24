package tareaAvanzClase;

import java.io.*;

public class ejercicio1 {

	public static void main(String args[]) throws IOException {
		
		String cadena = new String();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		cadena = br.readLine();
		
		System.out.println("La cadena escrita fue "+cadena);
		
	}
	
}
