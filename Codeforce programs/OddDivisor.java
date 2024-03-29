// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class OddDivisor
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
      if(n % 2 == 1)
      {
        System.out.println("YES");
      }
      else if(n % 2 == 0)
      {
        while(n % 2 == 0)
        {
          n /= 2;
          
          if(n % 2 == 1)
          {
            break;
          }
        }
        
        if(n > 1)
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
}