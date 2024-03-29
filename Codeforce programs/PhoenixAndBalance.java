//Written by Shagoto
import java.util.*;
public class PhoenixAndBalance
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      
      if(n == 2)
      {
        System.out.println(2);
      }
      else
      {
        int [] a = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<n; i++)
        {
          a[i] = (int)Math.pow(2, i+1);
          
          if(i < (n / 2) - 1 || i == n-1)
          {
            sum1 += a[i];
          }
          else
          {
            sum2 += a[i];
          }
        }
        
        System.out.println((int)Math.abs(sum1 - sum2));
      }
    }
  }
}