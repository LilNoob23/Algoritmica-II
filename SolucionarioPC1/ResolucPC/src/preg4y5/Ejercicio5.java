package preg4y5;

public class Ejercicio5 {

	public static void main(String args[]) {
		
		int[] A = {1, 3, 6, 8, 10, 15, 19, 24, 74};
		int[] B = {2, 3, 7, 20, 24, 54};
		
		int m = A.length;
		int n = B.length;
		
		int[] C = new int[m+n];
		
		Ejercicio5.unirArrays(A, B, C, m, n);
		
		Ejercicio5.ordenarArray(C);
		
		int o = m+n-(Ejercicio5.determinarElementosRepetidos(C));
		
		int[] D = new int[o];
		
		Ejercicio5.eliminarElementosRepetidos(C, D);
		
		System.out.println("El resultado del array unido es: ");
		Ejercicio5.imprimirArray(D);
	
	}
	
	public static void unirArrays(int array1[], int array2[], int array3[], int m, int n) {
		
		for(int i=0; i<m; i++) {
			
			array3[i] = array1[i];
			
		}
		
		for(int j=m; j<m+n; j++) {
			
			array3[j] = array2[j-m];
			
		}
		
	}
	
	public static void ordenarArray(int array3[]) {
		
		int contadorIntercambios = 0;
		
		for(boolean ordenado=false; !ordenado; ) {
			
			for(int i=0; i < array3.length - 1; i++) {
				
				if(array3[i] > array3[i+1]) {
					
					int varAux =array3[i];
					array3[i] = array3[i+1];
					array3[i+1] = varAux;
					
					contadorIntercambios++;
					
				}
				
			}
			
			if(contadorIntercambios == 0) {
				
				ordenado = true;
				
			}
			
			contadorIntercambios = 0;
			
		}
		
	}
	
	public static int determinarElementosRepetidos(int arrayUnid[] ) {
		
		int contRepetidos=0;
		
		for(int i=1; i<arrayUnid.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(arrayUnid[i] == arrayUnid[j]) {
					
					contRepetidos++;
					
				}
				
			}
			
		}
		
		return contRepetidos;
		
	}
	
	public static void eliminarElementosRepetidos(int arrayInic[], int arrayFin[]) {
		
		int l=0;
		
		for(int i=1; i<arrayInic.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(arrayInic[i] == arrayInic[j]) {
					
					arrayInic[i] = 0;
					
				}
				
			}
			
		}
			
			for(int k=0; k<arrayFin.length; k++) {
				
				while(arrayFin[k] == 0) {
					
					if(arrayInic[l] != 0) {
						
						arrayFin[k] = arrayInic[l];
						
					}
						
						l++;
					
				}
					
				}
			
		}
	
	public static void imprimirArray(int array[]) {
		
		for(int p=0; p<array.length; p++) {
			
			System.out.println(array[p]);
			
		}
		
	}
		
	}
	
