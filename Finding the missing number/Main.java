import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i = 0;i<= (arr_size - 1);i++)
        arr[i] = in.nextInt();
      int temp[] = new int[arr_size];
      int arr_idx = 0;
      for(int j = 0;j <= (arr_size -1);j++)
      {
        temp[arr_idx] = j+1;
        arr_idx++;
      }
      for(int idx1 = 0;idx1 <= (arr_size - 1);idx1++)
      {
        for(int idx2 = 0;idx2 <= (arr_size - 1);idx2++)
        {
          if(arr[idx1] == temp[idx2])
          {
            temp[idx2] = 0;
          }
        }
      }
      for(int indx = 0;indx <= (arr_size -1);indx++)
      {
        if(temp[indx] != 0)
        {
          System.out.println(temp[indx]);
        }
      }
    }
}