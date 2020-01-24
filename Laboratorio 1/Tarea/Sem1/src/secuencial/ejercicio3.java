package secuencial;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String args[]) {
		
		int a = 0;
		int b = 0;
		int aux1 = 0;
		int aux2 = 0;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer número: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo número"));
		
		aux1=a;
		aux2=b;
		b=aux1;
		a=aux2;
		
		System.out.println("El valor de a es ahora "+a+
				" y el valor de b es "+b);
		
	}
	
}
