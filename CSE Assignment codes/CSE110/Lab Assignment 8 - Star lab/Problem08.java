import java.util.Scanner;
public class Problem08
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i =1; i<=n; i++)
    {
      for(int j=1; j<=n-i; j++)
      {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}