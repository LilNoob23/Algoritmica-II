package ejercicio1;

import javax.swing.JOptionPane;

public class llamado {

	public static void main(String args[]) {
		
		llamado prueba = new llamado();
		
		System.out.println(prueba.division(8, 0));
		
	}
	
	public double suma(double a, double b) {

		double r = a + b;
		return r;
	}

	public double resta(double a, double b) {
		double r = a - b;
		return r;
	}

	public double multiplicacion(double a, double b) {
		double r = a * b;
		return r;
	}

	public double division(double a, double b) {
		double r;
		
		if(b == 0) {
			
			int valor1 = (int)a;
			int valor2 = (int)b;
			
			try {
				
				r=valor1/valor2;
				
			}catch(ArithmeticException ex) {
				
				r=0;
				JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
				
			}
			
		}else {
			
			r=a/b;
			
		}
		
		
		return r;
	}

}
