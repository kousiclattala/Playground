import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      Set<String> lhs = new LinkedHashSet<String>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String n = br.readLine();
      String[] arr = n.split(",");
      for(int i = 0;i <arr.length;i++)
      {
        lhs.add(arr[i]);
      }
      System.out.println(lhs);
    }
}