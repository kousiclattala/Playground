import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       LinkedHashMap <String,String> lhm = new LinkedHashMap<String,String>();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String name;
       String value;
       int num =Integer.parseInt(br.readLine());
       System.out.println("Enter the number of values to be inserted in map:"+num);
       for(int i = 0;i < num;i++)
       {
         name = br.readLine();
         value = br.readLine();
         lhm.put(name,value);
       }
      System.out.println(lhm);
      String in = br.readLine();
      System.out.println("Enter the index to be removed:"+in);
      lhm.remove(in);
      System.out.println(lhm);
      System.out.println("Size of map is : "+lhm.size());
    }
}