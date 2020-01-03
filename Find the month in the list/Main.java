import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	List <String> ls = new LinkedList<String>();
      	String month = br.readLine();
      	String[] arr = month.split(",");
      	for(int i = 0;i < arr.length;i++)
        {
          ls.add(arr[i]);
        }
      	System.out.println(ls);
      	System.out.println("Size of the linked list: "+ls.size());
      	System.out.println("Is LinkedList empty? "+ls.isEmpty());
      	String mn = br.readLine();
      	System.out.println("Does LinkedList contains "+mn+"?");
      	boolean s = ls.contains(mn);
      	System.out.println(s);
    }
}