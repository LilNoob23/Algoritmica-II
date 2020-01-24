package selectiva;

import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String args[]) {
		
		int anio=0;
		
		anio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del año para verificar si es bisiesto:"));
		
		if(((anio%4==0)||(anio%400==0))&&(anio%100!=0)) {
			System.out.println("El año "+anio+" es bisiesto");
		}else {
			System.out.println("El año "+anio+" no es bisiesto");
		}
		
	}
	
}
