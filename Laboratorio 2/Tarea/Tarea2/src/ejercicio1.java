import javax.swing.JOptionPane;

public class ejercicio1 {
	
	public static void main(String args[]) {
		
		String cad1 ="";
		String cad2 ="";
		String cad3 ="";
		
		cad1=JOptionPane.showInputDialog("Digite la primera cadena a concatenar:");
		cad2=JOptionPane.showInputDialog("Digite la primera cadena a concatenar:");
		cad3=JOptionPane.showInputDialog("Digite la primera cadena a concatenar:");
		
		ejercicio1 obj1 = new ejercicio1();
		
		System.out.println("La cadena final es '"+obj1.concatenar(cad1, cad2, cad3)+"'");
		
	}
	
	public static String concatenar(String txtUno, String txtDos, String txtTres) {
		
		String txtFinal="";
		
		txtFinal = txtUno+" "+txtDos+" "+txtTres;
		
		return txtFinal; 
		
	}
	
}
