// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class FibsievesBirthday
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
      long row = 0;
      long col = 0;
      long grid = 0;
      
      if((long)Math.sqrt(n) * (long)Math.sqrt(n) == n)
      {
        grid = (long)Math.sqrt(n);
      }
      else
      {
        grid = (long)Math.sqrt(n) + 1;
      }
      
      if(grid % 2 == 0)
      {      
        row = grid;
        col = grid;
        
        long corner = grid*grid - (grid - 1);
        long dif = n - corner;
        if(dif > 0)
        {
          row -= dif;
        }
        else
        {
          col -= Math.abs(dif);
        }
      }
      else
      {
        col = grid;
        row = grid;
        
        long corner = grid*grid - (grid - 1);
        long dif = n - corner;
        if(dif > 0)
        {
          col -= dif;
        }
        else
        {
          row -= Math.abs(dif);
        }
      }
      
      System.out.println("Case "+x+": "+col+" "+row);
    }
  }
}