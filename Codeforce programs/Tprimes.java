//Written by Shagoto
import java.util.*;
public class Tprimes
{
  static boolean [] sieve()
  {
    boolean [] prime = new boolean[1000000+1]; 
    for(int i=0; i<1000000; i++)
    {
      prime[i] = true;
    }
    for(int p = 2; p*p<=1000000; p++) 
    { 
      if(prime[p] == true) 
      { 
        for(int i = p*p; i<=1000000; i += p)
        {
          prime[i] = false;
        }
      } 
    }
    return prime;
  }
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    boolean [] arr = sieve();
    int n = read.nextInt();
    for(int x = 1; x<=n; x++)
    {
      long a = read.nextLong();
      
      long temp = (long)Math.sqrt(a);
      
      if(temp * temp == a && a != 1)
      {
        if(arr[(int)temp] == true)
        {
          System.out.println("YES");
        }
        else
        {
          System.out.println("NO");
        }
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}