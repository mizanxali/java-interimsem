//To create generic class
//import java.util.*;
class Foo<T> {  //Generic Type T
	T obj;
//constructor is required to assign the value of obj to generic type.
	Foo (T obj) { 
		this.obj = obj;
				}
	//this method is to return the object value/obj 
	public T getObject() { 
		return this.obj; 
	}
}
//Driver class
public class Generic1 {

	public static void main(String[] args) {

// we used Integer type here
Foo<Integer> iobj = new Foo<Integer>(254); 

System.out.println(iobj.getObject());


//We used same generic class to hold String objects.
Foo<String>  sobj = new Foo<String>("Hello my Generic Class");
System.out.println(sobj.getObject());
}
}
