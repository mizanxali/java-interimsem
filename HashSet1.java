import java.util.*;  

class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements
	 
	 Set<String> myhash = new HashSet<String>(); // to 
	 
    HashSet<String> set=new HashSet<String>();  // one way to create the object of HashSet.
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Four");
           myhash.add("Hello");
           set.remove("One");
           System.out.println(set.size());
           
           Iterator<String> i = set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  

//add() method is _overridden___ method.