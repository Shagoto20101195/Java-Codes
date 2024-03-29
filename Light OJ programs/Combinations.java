// May the Father of Understanding guide us
import java.util.*;
public class Combinations
{
  static int mod = 1000003;
  static long modex(long a, long n, long m)
  {
    if(n == 1)
    {
      return a % m;
    }
    
    long y = modex(a, n / 2, m);
    y = y * y % m;
    
    if(n % 2 == 1)
    {
      y = y * a % m;
    }
    
    return y;
  }
  
  static long [] fact = new long[1000005];
  static void setfact()
  {
    fact[0] = 1;
    for(int i = 1; i<=1000000; i++)
    {
      fact[i] = i * fact[i - 1] % mod;
    }
  }
  
  static long nCr(int n, int r)
  {
    long ans = fact[n];
    ans = ans * modex(fact[r], mod-2, mod) % mod;
    ans = ans * modex(fact[n - r], mod-2, mod) % mod;
    return ans;
  }
  
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    setfact();
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int r = read.nextInt();
      System.out.println("Case "+x+": "+nCr(n, r));
    }
  }
}