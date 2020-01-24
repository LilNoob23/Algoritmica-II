
import java.util.*;

public class ejercicio3 {

	public static void main(String args[]) {
		
		
		String cadTec="";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba la cadena a evaluar: ");
		cadTec=teclado.nextLine();
		
		ejercicio3 obj = new ejercicio3();
		
		if(obj.esPalindromo(cadTec)) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
	
	}
	
	public static boolean esPalindromo(String cadIngr) {
		
		String cadIngr1="";
		String cadInv="";
		
		cadIngr1=cadIngr.replace(" ", "");
		cadIngr1=cadIngr1.toUpperCase();
		
		int tam=cadIngr1.length();
		
		for(int i=tam-1; i>=0; i--) {
			
			cadInv = cadInv + cadIngr1.charAt(i);
			
		}
		
		if(cadInv.equals(cadIngr1)) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
