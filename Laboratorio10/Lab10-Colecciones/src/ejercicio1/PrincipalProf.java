package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PrincipalProf {

	public static void main(String args[]){
		
		//Input
		String himno = "Adelante San Marcos glorioso, adelante tú siempre estarás";
		//Output
		
		//Llevar esto a un ArrayList
		//Posteriormente aplicar una heurìstica e imprimir
		List<String> inversion = new ArrayList<String>();
		String cad;
		int pos1 = himno.indexOf(" ");
		int pos2 = 0;
		inversion.add(himno.substring(0, pos1));
		while(himno.indexOf(" ", pos1+1)>0){
			pos2 = himno.indexOf(" ", pos1);
			inversion.add(himno.substring(pos1, pos2));
			pos1 = pos2;
		}
		
		System.out.println(":> " + inversion.toString());
		
	}
	
}
