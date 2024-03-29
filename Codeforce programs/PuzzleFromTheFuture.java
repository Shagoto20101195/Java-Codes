// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class PuzzleFromTheFuture
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      read.nextLine();
      String b = read.nextLine();
      int [] a = new int[n];
      int [] d = new int[n];
      
      if(b.charAt(0) == '1')
      {
        d[0] = 2;
      }
      else
      {
        d[0] = 1;
      }
      
      for(int i = 0; i<n; i++)
      {
        int temp = Integer.parseInt(""+b.charAt(i));
        if(i == 0)
        {
          a[0] = 1;
        }
        else if(d[i-1] == 2)
        {
          if(temp == 1)
          {
            a[i] = 0;
            d[i] = 1;
          }
          else
          {
            a[i] = 1;
            d[i] = 1;
          }
        }
        else if(d[i-1] == 1)
        {
          if(temp == 0)
          {
            a[i] = 0;
            d[i] = 0;
          }
          else
          {
            a[i] = 1;
            d[i] = 2;
          }
        }
        else if(d[i-1] == 0)
        {
          if(temp == 0)
          {
            a[i] = 1;
            d[i] = 1;
          }
          else
          {
            a[i] = 1;
            d[i] = 2;
          }
        }
      }
      
      for(int i = 0; i<n; i++)
      {
        System.out.print(a[i]);
      }
      System.out.println();
    }
  }
}