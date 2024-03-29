//Written by Shagoto
import java.util.Scanner;
public class Problem20
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    
    for(int i = 1; i<=n; i ++)
    {
      for(int j = 1; j<=n-i; j++)
      {
        System.out.print(" ");
      }
      for(int j = 1; j<=2*i-1; j++)
      {
        if(i==1 || i==n || j==2*i-1 || j==1)
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