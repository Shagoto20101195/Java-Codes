//Written by Shagoto
import java.util.*;
public class TwoButtons
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    int count = 0;
    
    if(m <= n)
    {
      System.out.println(n - m);
    }
    else
    {
      while (n != m) 
      {
        if (m % 2 != 0 || n > m) 
        {
          m++;
        } 
        else 
        {
          m /= 2;
        }
        count++;
      }
      System.out.println(count);
    }
  }
}