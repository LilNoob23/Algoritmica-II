
import java.util.Scanner;

public class ejercicio10 {

	public static void main(String args[]) {
		
		String cadIngr = "";
		String pass="";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el usuario: ");
		cadIngr=teclado.next();
		System.out.println("Ingrese la contraseña: ");
		pass=teclado.next();
		
		System.out.println(ejercicio10.autenticar(cadIngr, pass));
		
	}
	
	public static String autenticar(String login, String contra) {
		
		String rpta="";
		String verifica="";
		
		verifica=ejercicio9.encriptar(login);
		if(contra.contentEquals(verifica)) {
			
			rpta="Usuario autenticado";
			
		}else {
			
			rpta="Usuario no autenticado";
			
		}
		
		return rpta;
		
	}
	
	
}
