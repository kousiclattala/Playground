import java.util.Scanner;
class Main
{
  public static int sum_of_num(int n)
  {
    int num = 0,sum = 0;
    while (num <= n)
    {
      sum = sum + num;
      num++;
    }
    return sum;
  }
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int res = sum_of_num(n1);
      System.out.println(res);
	}
}