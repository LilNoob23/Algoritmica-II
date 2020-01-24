import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String args[]) {
		
		String cadIngr = "";
		
		ejercicio6 obj = new ejercicio6();
		
		cadIngr=JOptionPane.showInputDialog("Escriba la cadena a evaluar: ");
		
		
		System.out.println("La cadena ingresada tiene "+obj.contarPalabras(cadIngr)+" palabras");
		
	}
	
	public static int contarPalabras(String cad) {
		
		int cantPalabras=1;
		cad=cad.trim();
		int tamaño=cad.length();
		char compar1=' ';
		
		for(int i=tamaño-1; i>0; i--) {
			
			char compar2 = cad.charAt(i);
			char compar3 = cad.charAt(i-1);
			
			if((compar1==compar2)&&(compar2!=compar3)) {
				
				cantPalabras++;
				
			}
			
		}
		
		return cantPalabras;
		
	}
	
}
