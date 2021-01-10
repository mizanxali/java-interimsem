import java.util.ArrayList;

 /*class AryListDemo {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> a2 = new ArrayList<String>();
		
		a2.add("Melbourne");
		a2.add("Adilade");
		a2.add("Singapor");
		a2.add("California");
	
		System.out.println("Size of a2: "+a2.size()) ;
		
		
	}
	
	
	
}*/


// import the util package
import java.util.*;

//main or driver class
public class ArrayListDemo {

   public static void main(String args[]) {
      
	  Integer x = 125;
	  
	  
	  List<String> l5 = new ArrayList<String>();
	  
	// create an empty array list
      ArrayList<String> al = new ArrayList<String>();
      
      
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("Cricket"); //add the element at end of array
      al.add("Adelade");
      al.add("Europe");
      al.add("Brisben");
      al.add("Denmark");
     //al.add(x);                   //in older java this will give you a runtime error if Generic Type not supplied.
     //java is Type safe.  Collections and Generic frameworks provides Type safety
        al.add(1, "Australia"); // add will add element at particular index.
       System.out.println("Size of al after additions: " + al.size());
      // display the array list
      System.out.println("Contents of al: " + al);
      // Remove elements from the array list
      al.remove("Brisben"); //to remove particular element
      al.remove(2);   // to remove the element at index.
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);  
     //Using Iterator 
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next()); }  
      
   }
}