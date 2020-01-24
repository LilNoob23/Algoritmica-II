package Iterativa;

import javax.swing.JOptionPane;

public class ejercicio8 {

	public static void main(String[] args) {
		
		int n=0;
		int sum=0;
		int val=1;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos de la serie(par):"));
		
		int[] array=new int[n];
		
		for(int i=0; i<n; i+=2) {
			array[i]=val;
			array[i+1]=val*2;
			val++;
		}

		for(int i=0; i<n; i++) {
			sum=sum+array[i];
		}
		
		System.out.print("La suma de la serie es "+sum);
		
	}

}
