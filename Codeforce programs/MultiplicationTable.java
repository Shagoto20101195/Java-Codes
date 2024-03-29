//Written by Shagoto
import java.util.*;
public class MultiplicationTable
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int x = read.nextInt();
    int count = 0;
    
    if((long)n*(long)n < (long)x)
    {
      System.out.println(count);
    }
    else
    {
      for(int i = 1; i<=(int)Math.sqrt(x); i++)
      {
        if(i * i == x)
        {
          count++;
        }
        else if((x % i == 0) && (x / i <= n))
        {
          count += 2;
        }
      }
      
      System.out.println(count);
    }
  }
}