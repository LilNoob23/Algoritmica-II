package ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class SetNoRepetidas {

	public static void main(String[] args) {
		
		String frase = "De ese mar surgieron tus lágrimas, lágrimas de melancolía.";
		
		Set<String> palabras = new HashSet<>();
		
		String fraseFinal = "";
		fraseFinal = frase.toUpperCase();
		fraseFinal = fraseFinal.replace(",", "");
		fraseFinal = fraseFinal.replace(".", "");
		String[] array1 = new String[9];
		String delimiter = " ";
		array1 = fraseFinal.split(delimiter);
		
		for(int i=0; i<array1.length; i++){
			
			palabras.add(array1[i]);
			
		}
//		
//		for(int i=0; i<array1.length; i++) {
//			
//			System.out.println(array1[i]);
//			
//		}
		
		//System.out.println(array1.length);
		//System.out.println(palabras.size());
		
		int cantidad = array1.length - 2*(array1.length - palabras.size());
		
		System.out.println("El número de elementos no repetidos es " + cantidad);
		
	}
	
}
