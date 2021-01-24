class Exception2 { 
   public static void main(String args[]) 
   {
            int arr[] ={1,2,3,4,5};
            /* The array has 5 elements but we want to display the 8th element value. 
             * It will throw 'ArrayIndexOutOfBoundsException'
            */
            try {
            System.out.println(arr[7]);
            } 
            catch(Exception e) {
            	System.out.println("Something wrong.");
            }
            finally {
            	System.out.println("I will be there regardless of error in try.");
            }
} 
}