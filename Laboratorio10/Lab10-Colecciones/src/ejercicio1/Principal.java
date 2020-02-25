package ejercicio1;

import java.util.ArrayList;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		String cadenaIngr = "Adelante San Marcos glorioso, adelante tú siempre estarás.";

		List<String> cadenaFin = new ArrayList<String>();

		String[] array1 = new String[8];

		String delimiter = " ";

		array1 = cadenaIngr.split(delimiter);

//		for(int i=0; i<array1.length; i++) {
//			
//			System.out.println(array1[i]);
//			
//		}
//		
		
		for (int i = 0; i < array1.length; i++) {

			int j = 0;

			cadenaFin.add(j, array1[i]);

		}

//		for(int i = 0; i<7; i++) {
//			
//			System.out.println(cadenaFin[i]);
//			
//		}
		
		System.out.println(":> " + cadenaFin.toString());

	}

}