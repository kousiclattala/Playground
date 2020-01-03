import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      switch(n)
      {
        case 1:
          if(n==1)
            System.out.println("One");
          else
          {
            System.out.println("Invalid");
          }
          break;
        case 2:
          if(n==2)
            System.out.println("Two");
          else
          {
            System.out.println("Invalid");
          }break;
         case 3:
          if(n==3)
            System.out.println("Three");
          else
          {
            System.out.println("Invalid");
          }break;
         case 4:
          if(n==4)
            System.out.println("Four");
          else
          {
            System.out.println("Invalid");
          }break;
         case 5:
          if(n==5)
            System.out.println("Five");
          else
          {
            System.out.println("Invalid");
          }break;
        default:
          System.out.println("Invalid");  
	}
}
}