import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();    int sum = 1;
    factorial_number(n,sum);
  }
  public static void factorial_number(int n,int sum)
  {
      if(n == 0)
      {
        System.out.print(sum);
        return ;
      }
      else
      {
        sum = sum * n;
        factorial_number((n-1),sum);
      }
  }
}