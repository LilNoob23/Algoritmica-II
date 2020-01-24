
import java.io.*;

public class ejercicio2 {
	
	public static void main(String args[]) throws IOException {
		
		String cadIngr="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese una cadena para invertirla: ");
		cadIngr=br.readLine();
		
		ejercicio2 obj1 = new ejercicio2();
		
		System.out.println("El valor invertido de la cadena ingresada es: ");
		System.out.println(obj1.invertirTexto(cadIngr));
		
	}
	
	public static String invertirTexto(String cadInic) {
		
		String cadFinal="";
		
		int tam=cadInic.length();
		
		for(int i=tam-1; i>=0; i--) {
			
			cadFinal = cadFinal + cadInic.charAt(i);
			
		}
		
		return cadFinal;
		
	}
	
}
