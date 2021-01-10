import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Collections1 {

	public static void main(String[] args) {
	
		String[] suits = {"Heart", "Diamond", "Spade", "Club"};

		List<String> l1  = Arrays.asList(suits); //this
			
		System.out.printf("UnSorted :%s%n", l1); // print the list

		Collections.sort(l1); 			// using method from Collections class/interface
		
		System.out.printf("Sorted :%s%n", l1); 
		
		Collections.sort(l1, Collections.reverseOrder());
		
		System.out.printf("Reverse Sorted :%s%n", l1);
	}

}
