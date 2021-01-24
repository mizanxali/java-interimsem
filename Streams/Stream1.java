import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;

public class Stream1
{
     public static void main(String[] args)
     {
    	 Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
         stream.forEach(p -> System.out.println(p*3));
         //2
         Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9});
         stream1.forEach(p -> System.out.print(" "+ p+9)); 
         //3
         List<Integer> l1 = new ArrayList();
         for (int i =0; i<10; i++) {
        	 l1.add(i);	
         }
         
         Stream<Integer> stream3 = l1.stream();
         stream3.forEach(p->System.out.println(p));    
         
         //4      
         List<String> students = new ArrayList();
         students.add("Vipul");
         students.add("Nirati");
         students.add("Anukur");
         students.add("Vimal");
         students.add("Anjali");
         // application of intermidiate operations and chaining of stream operations.
         students.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
     }
}