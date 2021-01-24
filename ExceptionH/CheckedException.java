import java.io.*;

class CheckedException { 
   public static void main(String args[]) throws IOException
   {
            FileInputStream fis = null;
            /*The constructor FileInputStream(File filename)
            * throws a checked exception FileNotFoundException */
            
            fis = new FileInputStream("G:/java.txt");
            int k;
            /* Method read() of FileInputStream class throws
            * a checked exception: IOException
      */
            while(( k = fis.read() ) !=-1)
            {
                            System.out.print((char)k);
            }
            /*The method close() closes the file input stream
            * throws IOException*/
                
            fis.close();    
                
   }
}