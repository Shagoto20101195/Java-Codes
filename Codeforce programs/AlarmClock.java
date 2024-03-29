//Written by Shagoto
import java.util.*;
public class AlarmClock
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long a = read.nextInt();
      long b = read.nextInt();
      long c = read.nextInt();
      long d = read.nextInt();
      
      if(b >= a)
      {
        System.out.println(b);
      }
      else
      {
        if(d >= c)
        {
          System.out.println(-1);
        }
        else
        {
          if((a - b) % (c - d) == 0)
          {
            long count  = (a - b) / (c - d);
            System.out.println(b + (count*c));
          }
          else
          {
            long count  = (a - b) / (c - d) + 1;
            System.out.println(b + (count*c));
          }
        }
      }
    }
  }
}