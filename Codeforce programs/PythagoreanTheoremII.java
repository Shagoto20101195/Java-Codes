// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class PythagoreanTheoremII
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    long [] sqr = new long[15001];
    for(int i = 1; i<=15000; i++)
    {
      sqr[i] = i*i;
    }
    
    long n = read.nextLong();
    long count = 0;
    
    for(long i = 1; i<=n; i++)
    {
      for(long j = i+1; j<=n; j++)
      {
        long temp = (i*i) + (j*j);
        
        if(temp == sqr[(int)Math.sqrt(temp)] && temp <= n*n)
        {
          count++;
        }
      }
    }
    
    System.out.println(count);
  }
}