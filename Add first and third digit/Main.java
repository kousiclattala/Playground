import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner num = new Scanner(System.in);
      int n = num.nextInt();
      int n1 = (n/100);
      int n2 = (n%100)%10;
      int sum = n1+n2;
      System.out.println(sum);
	}
}