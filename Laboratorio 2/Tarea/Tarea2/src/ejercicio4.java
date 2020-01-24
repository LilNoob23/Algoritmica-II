
import java.io.*;

public class ejercicio4 {

	public static void main(String args[]) throws IOException {
		
		String cadIngr="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ejercicio4 obj = new ejercicio4();
		
		System.out.println("Escriba la cadena a evaluar: ");
		cadIngr=br.readLine();
		
		System.out.println("La cadena tiene "+obj.contarTodasVocales(cadIngr)+" vocales");
		
	}
	
	
	public static int contarTodasVocales(String cad) {
		
		int numVoc=0;
		String vocales = "aeiouAEIOU";
		int tam=cad.length();
		
		for(int i=tam-1; i>=0; i--) {
			
			for(int j=0; j<10; j++) {
				
				char prov1=cad.charAt(i);
				char prov2=vocales.charAt(j);
				
				if(prov1 == prov2) {
					
					numVoc++;
					
				}
				
			}
			
			
		}
		
		return numVoc;
		
	}
	
}
