import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int mat[][] = new int[r][c];
    for(int i = 0;i < r;i++)
    {
      for(int j = 0;j < c;j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    int transpose[][] = new int[c][r];
    for(int i = 0;i < r;i++)
    {
      for(int j = 0;j < c;j++)
      {
        transpose[j][i] = mat[i][j];
      }
    }
    for(int i = 0;i < r;i++)
    {
      for(int j = 0;j < c;j++)
      {
        System.out.print(transpose[i][j]+" ");
      }
      System.out.print("\n");
    }  
  }
}