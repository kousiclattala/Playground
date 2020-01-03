import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();int sum = 0;
      sum_of_n_numbers(n,sum);
    }
  public static void sum_of_n_numbers(int n,int sum)
  {
    if(n == 0)
    {
      System.out.print(sum);
      return;
    }
    else
    {
      sum = sum + n;
      sum_of_n_numbers((n-1),sum); 
    }
  }
}