//import java.util.function.Predicate;
import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9; 
		
		Function<Integer, Integer>	fun =val->val+100;  // lambda expression
		
		System.out.println(fun.apply(n));	
	}	
}