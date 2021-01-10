import java.util.*;

public class Deque1 {

	
	public static void main(String[] args) {
	
		
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		
		Deque<String> ndeque = new ArrayDeque<>(); // create ArrayDeque object like this also.
		Deque<String> ldeque = new LinkedList<>(); // create LinkedList object from Deque.
		
		ArrayDeque<String> ard = new ArrayDeque<String>(); // create ArrayDeque object from ArrayDeque class
		ard.addFirst("Argon");
		ard.add("Xenon");
		ard.add("Neon");
		ard.offerLast("Helium");
		
		ard.addLast("Hydrogen");
		
		
		ArrayDeque<String> ard_clone = new ArrayDeque<String>(ard); 
		
		System.out.println(ard_clone);
		
		
	//System.out.println(ard.element());	
		ArrayDeque<String> ard1 = new ArrayDeque<String>();
		ard1.addFirst("Argon");
		ard1.add("Xenon");
		ard1.add("Neon");
		ard1.offerLast("Helium");
		
		ard1.addLast("Hydrogen");
		
		if(ard.element().equals(ard1.element()))
		{
			System.out.println("HI");
		}
		
		
}
	
	
	
}
