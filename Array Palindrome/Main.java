import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0;i <= (arr_size-1);i++)
      {
        arr[i] = in.nextInt();
      }
      int temp[] = new int[arr_size];
      int arr_idx = 0;
      for(int idx = (arr_size - 1);idx >= 0;idx--)
      {
        temp[arr_idx] = arr[idx];
        arr_idx++;
      }
      boolean is_palindrome = true;
      for(int index = 0;index <= (arr_size - 1);index++)
      {
        if(arr[index] != temp[index])
        {
          is_palindrome = false;
          break;
        }
      }
      if(is_palindrome == false)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}