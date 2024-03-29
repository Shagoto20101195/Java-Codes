//Written by Shagoto
import java.util.Scanner;
public class AlmostPrime
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int count = 0;
    
    if(n < 6)
    {
      System.out.println(0);
    }
    else
    {
      for(int x = 6; x<=n; x++)
      {
        int primeCount = 0;
        for(int i = 2; i<=x; i++)
        {
          int temp = 0;
          for(int j = 1; j<=(int)Math.sqrt(i); j++)
          {
            if(i % j == 0)
            {
              temp++;
            }
          }
          
          if(temp == 1)
          {
            if(x % i == 0)
            {
              primeCount++;
              if(primeCount > 2)
              {
                break;
              }
            }
          }
        }
        
        if(primeCount == 2)
        {
          count++;
        }
      }
      
      System.out.println(count);
    }
  }
}