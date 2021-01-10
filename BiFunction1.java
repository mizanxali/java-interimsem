import java.util.function.BiFunction;
import java.math.*;
public class BiFunction1 {
	public static void main(String args[])
{
	BiFunction<Double> bi = t -> t.round(d1, d2);
			
	bi.round(5.4, 3.8, (d1, d2) -> Math.round(d1, d2));
}
}


