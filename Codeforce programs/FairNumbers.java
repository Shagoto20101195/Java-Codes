import java.util.*;
import java.io.*;
public class FairNumbers
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
      
      while(true)
      {
        int [] digit = new int[10];
        long temp = n;
        while(temp > 0)
        {
          digit[(int)(temp % 10)]++;
          temp /= 10;
        }
        
        int count = 0;
        for(int i = 1; i<=9; i++)
        {
          if(digit[i] > 0)
          {
            count++;
          }
        }
        
        int div = 0;
        for(int i = 1; i<=9; i++)
        {
          if(digit[i] > 0 && n % i == 0)
          {
            div++;
          }
        }
        
        if(div == count)
        {
          System.out.println(n);
          break;
        }
        else
        {
          n++;
        }
      }
    }
  }
}