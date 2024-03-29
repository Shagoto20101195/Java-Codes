
// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class MinimizingCoins
{
  static int nmax = (int)1e9;
  static int mod = (int)1e9 + 7;
  static int n, x;
  static int [] arr;
  static int [] memo;
  static int dp(int x)
  {
// Iterative DP    
    for(int i = 1; i<=x; i++)
    {
      for(int j = 0; j<n; j++)
      {
        if(i - arr[j] < 0)
        {
          continue;
        }
    // Taking minimum of all possible combinations
        memo[i] = Math.min(memo[i - arr[j]] + 1, memo[i]);
      }
    }
    
/* Recursive DP   
    if(memo[x] != nmax)
    {
      return memo[x];
    }
    
    for(int i = 0; i<n; i++)
    {
      if(x - arr[i] < 0)
      {
        continue;
      }
      
      memo[x] = Math.min(dp(x - arr[i]) + 1, memo[x]);
    }
*/    
    return memo[x];
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    n = read.nextInt();
    x = read.nextInt();
    arr = new int[n];
    memo = new int[x+10];
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextInt();
    }
    
    Arrays.fill(memo, nmax);
    memo[0] = 1; // Only one way to get to 0
    int ans = dp(x);
    
    if(ans >= nmax)
    {
      System.out.println(-1);
    }
    else
    {
      System.out.println(ans-1);
    }
  }
}
