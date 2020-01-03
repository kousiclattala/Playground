import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(gcd_of_3_numbers(n1,n2,n3));
	}
  public static int gcd_of_3_numbers(int n1,int n2,int n3)
  {
    int gcd =0,min_element = 0;
    if(n1 < n2)
      min_element = n1;
    else
      min_element = n2;
    while(min_element >= 1)
    {
      if(((n1 % min_element)==0)&&((n2 % min_element)==0))
      {
        gcd = min_element;
        break;
      }
      min_element--;
    }
    int max_element = 0,result = 0;int n4 = gcd;
    if(n4 < n3)
      max_element = n4;
    else
      max_element = n3;
    while(max_element >= 1)
    {
      if(((n4 % max_element)==0)&&((n3 % max_element)==0))
      {
        result = max_element;
        break;
      }
      max_element--;
    }
    return result;
  }
}