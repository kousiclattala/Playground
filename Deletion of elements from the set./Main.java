import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> ts = new TreeSet<String>();
      String n = br.readLine();
      String [] arr = n.split(",");
      for(int i = 0;i <arr.length;i++)
      {
        ts.add(arr[i]);
      }
      System.out.println(ts);
      Object arr1[] = ts.toArray();
      int m = arr1.length-1;
      while(ts.isEmpty()!=true)
      {
        Object s = arr1[m];
        ts.remove(s);
        System.out.println(ts);
        --m;
      }
      
    }
}