public class TryWithFinally{
	
public static void main(String[] args) {
    try{        
        String str = "OnlineTutorials";
        System.out.println("value of stringVariable "+str);      
    }finally {
        System.out.println("finally block executed");       
    }
}
}

//Finally block mainly used to perform release of resources clean up 
//or session closing or database connection closing task.