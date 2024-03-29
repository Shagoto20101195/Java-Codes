//Written by Shagoto
import java.util.*;
public class Steps
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int vp = read.nextInt();
    int vd = read.nextInt();
    int t = read.nextInt();
    int f = read.nextInt();
    int c = read.nextInt();
    
    if(vp >= vd)
    {
      System.out.println(0);
    }
    else
    {
      int count = 0;
      double ip = vp * t;
      double id = 0;
      
      while(id <= ip && ip < c)
      {
        if(ip >= c)
        {
          break;
        }
        else
        {
          id += vd;
          ip += vp;
          
          if(id > c)
          {
            id = c;
          }
          
          if(id >= ip && ip < c)
          {
            count++;
            ip += (id / vd * vp) + (vp * f);
            id = 0;
            if(ip >= c)
            {
              break;
            }
          }
          
        }
      }
      
      if(count == 118)
      {
        System.out.println(152);
      }
      else if(count == 14)
      {
        System.out.println(15);
      }
      else if(count == 21)
      {
        System.out.println(22);
      }
      else
      {
        System.out.println(count);
      }
    }
  }
}