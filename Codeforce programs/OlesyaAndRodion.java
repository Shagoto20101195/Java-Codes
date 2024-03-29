//Written by Shagoto
import java.util.*;
public class OlesyaAndRodion
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int t = read.nextInt();
    
    if(n == 1 && t == 10)
    {
      System.out.println(-1);
    }
    else if(t == 10)
    {
      for(int i = 1; i<n; i++)
      {
        System.out.print(1);
      }
      System.out.print(0);
      System.out.println();
    }
    else
    {
      for(int i = 1; i<=n; i++)
      {
        System.out.print(t);
      }
      System.out.println();
    }
  }
}