//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Customer1 {
    private String name;
    private int points;
    //Constructor and standard getters
Customer1(String n, int p) {
	name = n;
	points = p;
}

int  getPoints() {
	//System.out.println("Points = "+points);
	return points;
}
String getName() {
	//System.out.println("Name is "+name);
	return name;
}
/*boolean get100() {
	return this.points>100;
}*/
} // class ends here

public class Shop1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer1 john = new Customer1("John", 78);
Customer1 hary = new Customer1("Hary", 102);
Customer1 boy = new Customer1("Boy", 109);
List<Customer1> customers = Arrays.asList(john, hary, boy); // this point


//usage of collect and Collectors 1
List<String> withHigh = customers.stream().filter(c-> c.getPoints()>100).map(Customer1::getName).collect(Collectors.toList());	
withHigh.forEach(System.out::println);	


//usage of collect and Collectors 2
int totalPoints = customers.stream().collect(Collectors.summingInt(Customer1::getPoints));
System.out.println("Total points to customers per month- " + totalPoints);

Double avgPoints = customers.stream().collect(Collectors.averagingInt(Customer1::getPoints));
System.out.println("Average of points to customers- " + avgPoints);
}

//List<String> names = customers.stream().map(Customer1::getName).collect(Collectors.toList());	
//names.forEach(System.out::println);
/*Iterator<Customer> cust = withHigh.iterator();
while( cust.hasNext() )
    System.out.println( cust.next() );*/

//System.out.println(withHigh.iterator());	

//custMore.stream().filter(c-> c.get100()).forEach(System.out::println(withHigh);
//Collection<Customer> customerList = new ArrayList<Customer>();
//customers.forEach(p-> System.out.println(custMore));	
//customers.stream().filter(p ->p.price> 100).map(p ->p.price).forEach(p-> System.out.println(p.toString()));
//customerList.stream().filter(p ->p.getPoints()> 100).forEach(p-> System.out.println(p.getPoints()));


}

/*
 // Java program with Optional Class 
import java.util.Optional; 
public class OptionalDemo{ 
	public static void main(String[] args) { 
		String[] words = new String[10]; 
		Optional<String> checkNull = 
					Optional.ofNullable(words[5]); 
		if (checkNull.isPresent()) { 
			String word = words[5].toLowerCase(); 
			System.out.print(word); 
		} else
			System.out.println("word is null"); 
	} 
} 
 */
