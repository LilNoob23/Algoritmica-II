package Iterativa;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {

		int numIngr=0;
		int cantCifras=0;
		
		numIngr=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del n�mero: "));
		
		System.out.print("El n�mero "+numIngr);
		
		do {
			numIngr=numIngr/10;
			cantCifras++;
		}while(numIngr!=0);
		
		System.out.println(" tiene "+cantCifras+" cifras");
		
	}

}
