// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class SumOfCubes
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
      
      boolean check = false;
      for(long i = 1; i<=10000; i++)
      {
        if(n - (i*i*i) <= 0)
        {
          break;
        }
        else
        {
          long temp = (long)Math.cbrt(n - (i*i*i));
          if((temp*temp*temp) + (i*i*i) == n)
          {
            check = true;
            break;
          }
        }
      }
      
      if(check)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}