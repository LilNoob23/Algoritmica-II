
import java.util.*;

public class ejercicio7 {

	public static void main(String args[]) {
		
		int tamFinal=0;
		int[] arrayIngr = new int[5];
		
		Scanner entrada = new Scanner(System.in);
		ejercicio7 obj = new ejercicio7(); 
		
		arrayIngr[0]=12;
		arrayIngr[1]=14;
		arrayIngr[2]=16;
		arrayIngr[3]=18;
		arrayIngr[4]=20;
		
		System.out.println("Ingrese el tamaño final del arreglo: ");
		tamFinal=entrada.nextInt();
		
		int[] arrayFinal = new int[tamFinal];
		
		arrayFinal=obj.ampliarArray(arrayIngr, tamFinal);
		
		System.out.println("Para verificar la ampliación, imprimiremos el último valor: ");
		System.out.println(arrayFinal[tamFinal-1]);
		
	}
	
	public static int[] ampliarArray(int[] unArray, int factor) {
		
		int[] arrayAmplia = new int[factor];
		
		int tam=unArray.length;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<tam; i++) {
			
			arrayAmplia[i]=unArray[i];
			
		}
		
		for(int j=tam; j<factor; j++) {
			
			System.out.println("Escriba el valor de la posición "+(j)+" del array ampliado: ");
			arrayAmplia[j]=teclado.nextInt();
			
		}
		
		return arrayAmplia;
		
	}
	
	
}
