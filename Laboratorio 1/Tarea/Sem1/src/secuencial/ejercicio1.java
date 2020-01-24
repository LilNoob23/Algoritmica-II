package secuencial;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String args[]) {
		float radio=0;
		float altura=0;
	    final float PI =3.1416F;
	    float areaTotal=0;
		
		radio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del radio: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));
		
		areaTotal=2*PI*radio*altura+2*PI*radio*radio;
		
		System.out.println("El valor del area total del cilindro es "+areaTotal);
	}
	
}
