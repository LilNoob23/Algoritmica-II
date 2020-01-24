package laboratorio;

import javax.swing.JOptionPane;

public class ejercicioReversa {

	public static void main(String args[]) {
		
		String palabra1="";
		String palabra2="";
		
		palabra1=JOptionPane.showInputDialog("Escriba la palabra a invertir: ");
		
		int tam=palabra1.length();
		
		for(int i=tam-1; i>=0; i--) {
			
			palabra2 += palabra1.charAt(i);
			
		}
		
		System.out.println("La palabra al revés es "+palabra2);
		
	}
	
}
