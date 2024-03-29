//Written by Shagoto
import java.util.Scanner;
public class VanyaandFence
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int width = 0;
    int x = 1;
    int n = read.nextInt();
    if(n>=1 && n<=1000)
    {
      int h = read.nextInt();
      if(h>=1 && h<=1000)
      {
        while(x<=n)
        {
          int a = read.nextInt();
          if(a > h)
          {
            width = width + 2;
          }
          else if(a == h)
          {
            width = width + 1;
          }
          else
          {
            width = width + 1;
          }
          
          x = x + 1;
        }
        
        System.out.println(width);
      }
    }
  }
}