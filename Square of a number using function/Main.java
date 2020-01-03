import java.util.Scanner;
class Main
{
  public static int square_of_num(int n)
  {
    int square = n * n;
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int square = square_of_num(n1);
      System.out.print(square);
    }
	} 
