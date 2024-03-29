//Written by Shagoto
import java.util.*;
public class RequiredRemainder
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int a = 1; a<=t; a++)
    {
      int x = read.nextInt();
      int y = read.nextInt();
      int n = read.nextInt();
      
      if(y == 0)
      {
        System.out.println(n / x * x);
      }
      else
      {
        int m = n;
        n /= x;
        n *= x;
        int temp1 = n - (x-y);
        int temp2 = n + y;
        
        if(temp2 <= m)
        {
          System.out.println(temp2);
        }
        else
        {
          System.out.println(temp1);
        }
      }
    }
  }
}