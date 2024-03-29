//Written by Shagoto
import java.util.*;
public class kthDivisor
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Long> a = new ArrayList<Long>();
    long n = read.nextLong();
    int k = read.nextInt();
    
    for(long i = 1; i<=(long)Math.sqrt(n); i++)
    {
      if(n % i == 0 && i*i != n)
      {
        a.add(i);
        a.add(n / i);
      }
      else if(n % i == 0 && i*i == n)
      {
        a.add(i);
      }
    }
    
    Collections.sort(a);
    if(k <= a.size())
    {
      System.out.println(a.get(k-1));
    }
    else
    {
      System.out.println(-1);
    }
  }
}