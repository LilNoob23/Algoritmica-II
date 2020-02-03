package pe.edu.unmsm.agenda;

import javax.swing.JOptionPane;

public class Menu {

	
	public int  mostrarMenu() {
		
		System.out.println("\tMENU");
		System.out.println("1.- Añadir contacto");
		System.out.println("2.- Eliminar contacto");
		System.out.println("3.- Mostrar contactos");
		System.out.println("4.- Salir");
		int opc = Integer.parseInt(JOptionPane.showInputDialog("Digite una opción: "));
		
		return opc;
		
	}
	
	public void desarrollarMenu(Contacto[] list) {
		
		int opc;
		String rpta;
		
		Agenda agenda1 = new Agenda();
		Menu menu1 = new Menu();
		
		do {
			
			System.out.println("\n\n\n\n\n\n\n\n");
			
			opc=menu1.mostrarMenu();
			
			while(opc<1||opc>4) {
				
				System.out.println("\n\n\n\n\n\n\n\n");
				System.out.println("ERROR");
				System.out.println("¡Ingrese una opción válida!");
				opc=menu1.mostrarMenu();
				
			}
			
			switch(opc) {
			
			case 1: agenda1.adicionarContacto(list);break;
			case 2: agenda1.removerContacto(list);break;
			case 3: agenda1.mostrarContactos(list);break;
			case 4: System.out.println("Gracias por usar el programa");break;
				
			}
			
			if(opc!= 4) {
				
				rpta = JOptionPane.showInputDialog("¿Desea continuar en el menú?(S/N)");
				
				while(rpta.charAt(0)!='S' && rpta.charAt(0)!='N' ) {
					
					System.out.println("\n\n\n\n\n\n\n\n");
					System.out.println("ERROR");
					System.out.println("Ingresar una opción válida");
					rpta=JOptionPane.showInputDialog("¿Desea continuar  en el menú?(S/N)");
					
				}
				
			}else {
				
				rpta = "N";
				
			}
			
			
			
		}while(rpta.charAt(0)=='S'||rpta.charAt(0)=='s');
		
	}
	
}
