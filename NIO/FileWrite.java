
import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Stream;

class FileWrite
{
    public static void main(String[] args)
    {
        Stream<String> stream;
        try
        {
            File f1 = new File("D:\\myfile.txt");
            f1.createNewFile();

            String str="Write this string to my file";
            FileWriter fw = new FileWriter(f1) ;
            fw.write(str);
            fw.close();

            //f1.close();

            Path pf = Paths.get("D:\\myfile.txt");
            List<String> l1 = Files.readAllLines(pf); //read all file lines as List
            System.out.println(l1);

            stream = Files.lines(pf); //read all file lines as List
            // System.out::println is the action to be done on each element, i.e., line in the file
            stream.forEach(System.out::println);
        }
        catch (IOException  e)
        {
            e.printStackTrace();
        }
    }
}

