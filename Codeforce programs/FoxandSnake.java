//Written by Shagoto
import java.util.Scanner;
public class FoxandSnake
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    int count = 0;
    
    for(int i = 1; i<=n; i++)
    {
      if(i % 2 == 1)
      {
        for(int j = 1; j<=m; j++)
        {
          System.out.print("#");
        }
      }
      else if(count % 2 == 0 && i % 2 == 0)
      {
        for(int j = 1; j<m; j++)
        {
          System.out.print(".");
        }
        System.out.print("#");
        count++;
      }
      else if(count % 2 == 1 && i % 2 == 0)
      {
        System.out.print("#");
        for(int j = 1; j<m; j++)
        {
          System.out.print(".");
        }
        count++;
      }
      System.out.println();
    }
  }
}