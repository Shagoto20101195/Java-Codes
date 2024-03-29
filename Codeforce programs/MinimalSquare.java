//Written by Shagoto
import java.util.*;
public class MinimalSquare
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      
      if(a == b)
      {
        System.out.println(4 * a * b);
      }
      else
      {
        if(a > b)
        {
          int temp = a;
          a = b;
          b = temp;
        }
        
        if(a == 1 || 2*a < b)
        {
          System.out.println(b * b);
        }
        else if(2*a == b)
        {
          System.out.println(2 * a * b);
        }
        else
        {
          System.out.println(4 * a * a);
        }
      }
    }
  }
}