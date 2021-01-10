import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		
		int A[] = new int[] {12, 24, 36, 48, 60};
		
		int B[] = new int[] {12, 24, 36, 48, 65};
		
		for(int i=0; i<A.length; i++) {
			
			
			
		int n = A[i];
		System.out.println("Array element of A:"+n);
		
		}
		

		boolean result = Arrays.equals(A, B);
		System.out.println("\n Are two arrays equal? "+result);
		
	
	}

}
