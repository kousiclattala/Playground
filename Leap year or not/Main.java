import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int Year = in.nextInt();
      if(Year%4!=0 && Year%100!=0 || Year%400!=0)
        System.out.println("Non Leap year");
      else
        System.out.println("Leap year");
    }
}