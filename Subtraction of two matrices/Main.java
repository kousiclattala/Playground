import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row_size = sc.nextInt();
    int column_size = sc.nextInt();
    int mat1[][] = new int[row_size][column_size];
    for(int i = 0;i < row_size;i++)
    {
      for(int j = 0;j < column_size;j++)
      {
        mat1[i][j] = sc.nextInt();
      }
    }
    int mat2[][] = new int[row_size][column_size];
    for(int i = 0;i < row_size;i++)
    {
      for(int j = 0;j < column_size;j++)
      {
        mat2[i][j] = sc.nextInt();
      }
    }
    substraction_of_matrices(mat1,mat2,row_size,column_size);
  }
  public static void substraction_of_matrices(int mat1[][],int mat2[][],int row_size,int column_size)
  {
    int res[][] = new int[row_size][column_size];
    for(int i = 0;i < res.length;i++)
    {
      for(int j = 0;j < res[i].length;j++)
      {
        res[i][j] = mat1[i][j] - mat2[i][j]; 
      }
    }
    for(int i = 0;i < res.length;i++)
    {
      for(int j = 0;j < res[i].length;j++)
      {
        System.out.print(res[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}