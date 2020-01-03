import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        int offset = ch + 26;
        offset = (offset - key);
        ch = (char)(offset);
      }
      if(ch >= 'A' && ch <= 'Z')
      {
        ch = (char)(ch - key);
      }
      System.out.print(ch);
    }
}