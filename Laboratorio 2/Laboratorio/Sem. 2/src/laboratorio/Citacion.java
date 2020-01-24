package laboratorio;

import java.util.Scanner;

public class Citacion {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String inicial="";
		String sobreNom="";
		System.out.println("Ingrese su nombre completo: ");
		String nombre=teclado.nextLine().trim();
		int inicio = 0;
		int fin = nombre.indexOf(" ", inicio);
		while (fin != -1) {
			
			inicial += nombre.substring(inicio, inicio+1) +". ";
			inicio = fin +1;
			fin = nombre.indexOf(" ", inicio);
			
		}
		
		sobreNom = nombre.substring(inicio).toUpperCase();
		System.out.print(sobreNom + ", ");
		System.out.println(inicial.toUpperCase().trim());

	}

}
