//Written by Shagoto
import java.util.Scanner;
public class FindPrime
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int T = read.nextInt();
    if(T>=1 && T<=50)
    {
      for(int x = 1; x<=T; x++)
      {
        int N = read.nextInt();
        
        if(N>=10 && N <=500)
        {
          int beforePrime = 0;
          int afterPrime = 0;
          
          for(int i = 2; i<N; i++)
          {
            int count = 0;
            for(int j = 1; j<=i; j++)
            {
              if(i % j == 0)
              {
                count++;
              }
            }
            
            if(count == 2)
            {
              beforePrime = i;
            }
          }
          
          for(int i = N+1; i<510; i++)
          {
            int count = 0;
            
            for(int j = 1; j<=i; j++)
            {
              if(i % j == 0)
              {
                count++;
              }
            }
            
            if(count == 2)
            {
              afterPrime = i;
              break;
            }
            else
            {
              continue;
            }
          }
          
          System.out.println(beforePrime+" "+afterPrime);
        }
      }
    }
  }
}