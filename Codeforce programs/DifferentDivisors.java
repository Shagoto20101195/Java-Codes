// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class DifferentDivisors
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int d = read.nextInt();
      int n = d+1;
      int m = 0;
      
      while(true)
      {
        boolean check = true;
        for(int i = 2; i<=(int)Math.sqrt(n); i++)
        {
          if(n % i == 0)
          {
            check = false;
            break;
          }
        }
        
        if(check)
        {
          m = n + d;
          break;
        }
        else
        {
          n++;
        }
      }
      
      while(true)
      {
        boolean check = true;
        for(int i = 2; i<=(int)Math.sqrt(m); i++)
        {
          if(m % i == 0)
          {
            check = false;
            break;
          }
        }
        
        if(check)
        {
          break;
        }
        else
        {
          m++;
        }
      }
      
      System.out.println(n*m);
    }
  }
}