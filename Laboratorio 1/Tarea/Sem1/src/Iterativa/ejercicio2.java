package Iterativa;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String args[]) {
		
		int numIngr=0;
		int divisor = 2;
		
		numIngr=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a factorizar: "));
		
		while(numIngr != 1) {
			
			if(numIngr%divisor == 0) {
				
				System.out.print(divisor + " *");
				
				numIngr = numIngr / divisor;
				
			}else {
				
				divisor++;
				
			}
			
		}
		
	}
	
}
