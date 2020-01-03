import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      TreeMap<String,String> tm = new TreeMap<String,String>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String name;
      String value;
      int num = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+num);
      for(int i = 0;i<num;i++)
      {
        name = br.readLine();
        value = br.readLine();
        tm.put(name,value);
      }
      System.out.println(tm);
      String in = br.readLine();
      System.out.println("Enter the index to be removed:"+in);
      tm.remove(in);
      System.out.println(tm);
      String name1 = br.readLine();
      System.out.println("Enter the index to insert:"+name1);
      String value1 = br.readLine();
      System.out.println("Enter the value to be inserted:"+value1);
      tm.put(name1,value1);
      System.out.println(tm);
    }
}