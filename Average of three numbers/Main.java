import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner num = new Scanner(System.in);
      int n1 = num.nextInt();
      int n2 = num.nextInt();
      int n3 = num.nextInt();
      int sum = n1+n2+n3;
      int Avg = sum/3;
      System.out.println(Avg);
	}
}