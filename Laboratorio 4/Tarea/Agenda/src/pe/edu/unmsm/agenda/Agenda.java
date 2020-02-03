package pe.edu.unmsm.agenda;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Agenda {
	

	public static void main(String args[]) {
		
		int numCont=0;
		
		Scanner entrada = new Scanner(System.in);
		Menu menu1 = new Menu();
		
		System.out.println("Ingrese la cantidad de contactos que tendrá la agenda: ");
		numCont=entrada.nextInt();
		
		Contacto[] listaCont = new Contacto[numCont]; 
		
		/*agenda1.adicionarContacto(listaCont);
		agenda1.adicionarContacto(listaCont);
		agenda1.adicionarContacto(listaCont);
		agenda1.adicionarContacto(listaCont);
		agenda1.adicionarContacto(listaCont);
		agenda1.removerContacto(listaCont);
		agenda1.mostrarContactos(listaCont);
		*/
		
		menu1.desarrollarMenu(listaCont);
		
	}
	
	public void adicionarContacto(Contacto[] lista) {
		
		int posicion=Integer.parseInt(JOptionPane.showInputDialog("Ecribe el valor de la posición que se agregará: "));
			
		if(lista[posicion]==null) {
			
			String nombres = JOptionPane.showInputDialog("Ingrese los nombres del contacto: ");
			
			String apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos: ");
				
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
				
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario: "));
				
			lista[posicion] = new Contacto(nombres, apellidos, edad, salario);
			
			
		}else {
			
			System.out.println("El espacio ya se encuentra ocupado");
			
		}
		
	}
	
	public void removerContacto(Contacto[] lista) {
		
		int posicion=Integer.parseInt(JOptionPane.showInputDialog("Ecribe el valor de la posición que se borrará: "));
		
		lista[posicion] = new Contacto("", "", 0, 0);
		
	}
	
	public void mostrarContactos(Contacto[] lista) {
		
		for(int i=0; i<lista.length; i++) {
			
			System.out.println("Contacto"+(i+1));
			System.out.println("Nombres: "+lista[i].getNombres());
			System.out.println("Apellidos: "+lista[i].getApellidos());
			System.out.println("Edad: "+lista[i].getEdad());
			System.out.println("Salario: "+lista[i].getSalario());
			
		}
		
	}
	
}
