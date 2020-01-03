import java.util.Scanner;
class Main{
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
    int x = 0;
    if(n1 > n2)
    {
      x = n1;
    }
    else
    {
      x = n2;
    }
    int min_element = 0,greater_number = 0;
    if(x > min_element)
      greater_number = x;
    else
      greater_number = min_element;
    return greater_number;
  }    
}