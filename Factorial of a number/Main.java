import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0,product = 1;
      for (int num = 1;num <= n; ++num)
      {
        product = product * num;
      }
      System.out.println(product);
	}
}