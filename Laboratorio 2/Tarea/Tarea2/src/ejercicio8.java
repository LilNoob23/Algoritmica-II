
public class ejercicio8 {

	public static void main(String[] args) {
		
		int[] array1 = new int[5];
		array1[0]=18;
		array1[1]=20;
		array1[2]=6;
		array1[3]=14;
		array1[4]=23;

		ejercicio8 obj = new ejercicio8();
		
		obj.mostrarArray(array1);
		
	}

	public static void mostrarArray(int[] array) {
		
		
		
		for(int i=0; i<array.length; i++) {
			
			System.out.print(array[i]+" ");
			
		}
		
	}
	
	
	
}
