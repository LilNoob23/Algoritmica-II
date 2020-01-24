package Iterativa;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		
		int numIngr=0;
		int res=0;
		int cantPar=0;
		
		numIngr=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a evaluar: "));
		
		while(numIngr != 0) {
			
			res=numIngr%10;
			numIngr=numIngr/10;
			
			if(res%2 == 0) {
				cantPar++;
			}
			
		}
		
		System.out.println("La cantidad de cifras pares es "+cantPar);

	}

}
