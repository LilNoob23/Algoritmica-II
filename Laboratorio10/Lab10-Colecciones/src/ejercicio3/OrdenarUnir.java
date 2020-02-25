package ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class OrdenarUnir {

	public static void main(String[] args) {

		int A[] = { 1, 3, 5, 7, 10 };
		int B[] = { 2, 3, 7, 9, 10, 11, 15 };

		Set<Integer> C = new HashSet<>();

		int m = A.length;
		int n = B.length;

		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			
			if(A[i] > B[j]) {
				C.add(B[j]);
				j++;
			}else if(A[i] < B[j]){
				C.add(A[i]);
				i++;
			}else{
				C.add(A[i]);
				i++;
				j++;
			}
				
		}
		
		if(j >= n) {
			while(i < m) {
				C.add(A[i]);
				i++;
			}
		}else if(i >= m) {
			while(j < n) {
				C.add(B[j]);
				j++;
			}
		}
		
		System.out.println(":> " + C.toString());
		
	}

}
