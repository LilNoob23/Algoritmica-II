package secuencial;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String args[]) {
		
		int suma=0;
		int num=0;
		
		num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números: "));
		
		for(int i=1; i<=num; i++) {
			suma += Math.pow(i, 3);
		}
		
		System.out.println("El valor de la suma de cubos es "+suma);
	}
	
}
