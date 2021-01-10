import java.util.function.Function;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9; 
		
		modify(n, val->val+100);
		modify(n, val -> val+1000);
		modify(n, val-> val+258);
		
		
	}	
		static void modify(int v, Function<Integer, Integer>	function) {
			int result = function.apply(v);
			System.out.println(result);
		}

}
