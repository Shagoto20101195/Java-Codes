import java.util.Scanner;
public class Problem16
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=i; j++)
      {
        if(i==1 || j==i || i==n || j==1)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
  }
}