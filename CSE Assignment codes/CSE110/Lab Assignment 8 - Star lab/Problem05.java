import java.util.Scanner;
public class Problem05
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}