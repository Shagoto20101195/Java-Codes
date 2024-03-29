// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class BalancedRemainders
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int c1 = 0;
      int c2 = 0;
      int c0 = 0;
      for(int i = 0; i<n; i++)
      {
        int v = read.nextInt();
        
        if(v % 3 == 1)
        {
          c1++;
        }
        else if(v % 3 == 2)
        {
          c2++;
        }
        else
        {
          c0++;
        }
      }
      
      int count = 0;
      while(c1 != c2 || c2 != c0 || c1 != c0)
      {
        if(Math.max(c1, Math.max(c2, c0)) == c2)
        {
          c2--;
          c0++;
        }
        else if(Math.max(c1, Math.max(c2, c0)) == c1)
        {
          c1--;
          c2++;
        }
        else
        {
          c0--;
          c1++;
        }
        
        count++;
      }
      
      System.out.println(count);
    }
  }
}