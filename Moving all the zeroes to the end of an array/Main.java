import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
		Scanner in = new Scanner(System.in);
		int arr_size = in.nextInt();
		int arr[] = new int[arr_size];
		for(int index = 0;index <= (arr_size-1);index++)
		{
			arr[index] = in.nextInt();
		}
		segregate(arr_size,arr);
		for(int index = 0;index <= (arr_size-1);index++)
		{
			System.out.print(arr[index]+" ");
		}
	}
	public static void segregate(int arr_size,int arr[])
	{
		int zero_count = 0;
		int temp[] = new int[arr_size];
		int temp_size = 0;
		for(int index = 0;index <= (arr_size-1);index++)
		{
			if(arr[index] == 0)
			{
				zero_count++;
			}
			else
			{
				temp[temp_size] = arr[index];
				temp_size++;
			}
		}
		int arr_index = 0;
		for(int index = 0;index < temp_size;index++)
		{
			arr[arr_index] = temp[index];
			arr_index++;
		}
		for(int index = (arr_size-1);index >= arr_index;index--)
		{
			arr[index] = 0;
			arr_size--;
		}
	}
}

    
