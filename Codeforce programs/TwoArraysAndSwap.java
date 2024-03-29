//Written by Shagoto
import java.util.*;
public class TwoArraysAndSwap
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int k = read.nextInt();
      
      int [] a = new int[n];
      int [] b = new int[n];
      int sum = 0;
      for(int i = 0; i<n; i++)
      {
        a[i] = read.nextInt();
        sum += a[i];
      }
      for(int i = 0; i<n; i++)
      {
        b[i] = read.nextInt();
      }
      
      Arrays.sort(a);
      Arrays.sort(b);
      
      if(k == 0)
      {
        System.out.println(sum);
      }
      else
      {
        for(int i = 0; i<k; i++)
        {
          if(b[n-i-1] > a[i])
          {
            sum = sum - a[i] + b[n-i-1];
          }
        }
        System.out.println(sum);
      }
    }
  }
}