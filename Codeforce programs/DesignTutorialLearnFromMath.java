//Written by Shagoto
import java.util.*;
public class DesignTutorialLearnFromMath
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    
    if((n % 2 == 0) && ((n/2) % 2 == 0))
    {
      System.out.println((n/2) +" "+(n/2));
    }
    else if((n % 2 == 0) && ((n/2) % 2 != 0))
    {
      System.out.println((n-4)+" "+4);
    }
    else
    {
      for(int i = 4; i>0; i+=2)
      {
        int prime = 0;
        
        for(int j = 2; j<=(int)Math.sqrt(n-i); j++)
        {
          if((n-i) % j == 0)
          {
            prime = 0;
            break;
          }
          else
          {
            prime = 1;
          }
        }
        
        if(prime == 0)
        {
          System.out.println(i+" "+(n-i));
          break;
        }
      }
    }
  }
}