import java.io.*;

import javax.swing.JOptionPane;

public class ejercicio9 {

	public static void main(String args[]) throws IOException {
		
		String cadIngr1 ="";
		String cadIngr2 ="";
		String rpta = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ejercicio9 obj =new ejercicio9(); 
		
		System.out.println("¿Desea encriptar(E) o desencriptar(D)?(E/D) =>");
		rpta = br.readLine();
		
		
		
		if((rpta.contentEquals("E"))||(rpta.contentEquals("e"))) {

			cadIngr1=JOptionPane.showInputDialog("Ingrese la cadena a encriptar: ");
			System.out.println("La cadena encriptada es: "+ejercicio9.encriptar(cadIngr1));
			
		}
		
		if((rpta.contentEquals("D"))||(rpta.contentEquals("d"))) {
			
			cadIngr2=JOptionPane.showInputDialog("Ingrese la cadena a desencriptar: ");
			System.out.println("La cadena desencriptada es: "+ejercicio9.desencriptar(cadIngr2));
			
		}
		
	}
	
	public static String encriptar(String cadena1) {
		
		String cadena2="";
		
		cadena2=cadena1.toLowerCase();
		cadena2=cadena2.replace('a', '4');
		cadena2=cadena2.replace('e', '3');
		cadena2=cadena2.replace('i', '1');
		cadena2=cadena2.replace('o', '0');
		cadena2=cadena2.replace('u', '8');
		
	
		return cadena2;
		
	}
	
	public static String desencriptar(String cadena1) {
		
		String cadena3="";
		
		cadena3=cadena1.toLowerCase();
		cadena3=cadena3.replace('4', 'a');
		cadena3=cadena3.replace('3', 'e');
		cadena3=cadena3.replace('1', 'i');
		cadena3=cadena3.replace('0', 'o');
		cadena3=cadena3.replace('8', 'u');
		
		return cadena3;
		
		
	}
	
}
