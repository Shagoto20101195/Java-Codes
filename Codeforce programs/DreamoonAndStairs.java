//Written by Shagoto
import java.util.*;
public class DreamoonAndStairs
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int m = read.nextInt();
    
    int twostep = n / 2;
    int step = 0;
    
    if(n % 2 == 0)
    {
      step = twostep;
    }
    else
    {
      step = twostep + 1;
    }
    
    if(n < m)
    {
      System.out.println(-1);
    }
    else
    {
      while(twostep > 0)
      {
        if(step % m == 0)
        {
          break;
        }
        else
        {
          step++;
          twostep--;
        }
      }
      
      System.out.println(step);
    }
    
  }
}