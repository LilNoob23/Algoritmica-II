package ejercicio3_1;

public class LogicaPascal {

	public static void rellenarNumeros(int[][] tabla_num, int orden) {
		
		for (int i = 0; i < orden; i++) {

			for (int j = 0; j < orden; j++) {

				tabla_num[i][j] = 0;

			}

		}

		tabla_num[0][orden/2] = 1;

		for (int i = 1; i < orden / 2 + 1; i++) {

			for (int j = 0; j < orden; j++) {

				if(j == 0) {

					int valorAnt = 0;
					int valorPos = tabla_num[i-1][j+1];
					int valorFin = valorAnt + valorPos;
					tabla_num[i][j] = valorFin;
					
					
				}else if(j == (orden-1)){
					
					int valorAnt = tabla_num[i-1][j-1];
					int valorPos = 0;
					int valorFin = valorAnt + valorPos;
					tabla_num[i][j] = valorFin;
					
				}else {
					
					int valorAnt = tabla_num[i-1][j-1];
					int valorPos = tabla_num[i-1][j+1];
					int valorFin = valorAnt + valorPos;
					tabla_num[i][j] = valorFin;

				}
					
				}
				
			}
		
	}
	
	public static void mostrarNumeros(int[][] tabla_num, int filas, int columnas) {
		
		for(int i = 0; i < filas; i++) {
			
			for(int j = 0; j < columnas; j++) {
				
				System.out.println(tabla_num[i][j] + " ");
				
			}
			
			System.out.println("");
			
		}
		
	}
	
	public static int[][] obtenerNumeros(int orden){
		
		int[][] tabla_num = new int[orden][orden];
		rellenarNumeros(tabla_num, orden);
		return tabla_num;
		
	}
	
}
