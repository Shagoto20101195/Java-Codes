// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class AtCoderKnapsack1
{
  static long inf = (long)1e9;
  static int nmax = (int)1e5 + 10;
  static long [] value = new long[nmax];
  static long [] weight = new long[nmax];
  static long [][] memo = new long[105][nmax];
  
  static long dp(int n, int taken)
  {
    if(n == 0)
    {
      if(taken == 0)
      {
        return 0;
      }
      else
      {
        return -inf;
      }
    }
    
    if(memo[n][taken] != -1)
    {
      return memo[n][taken];
    }
    
    memo[n][taken] = dp(n-1, taken);
    if(taken >= weight[n])
    {
      memo[n][taken] = Math.max(memo[n][taken], dp(n-1, taken - (int)weight[n]) + value[n]);
    }
    
    return memo[n][taken];
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int w = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      weight[i] = read.nextLong();
      value[i] = read.nextLong();
    }
    
    for(int i = 0; i<=n; i++)
    {
      for(int j = 0; j<=w; j++)
      {
        memo[i][j] = -1;
      }
    }
    
    long ans = -inf;
    for(int i = 0; i<=w; i++)
    {
      ans = Math.max(ans, dp(n, i));
    }
    
    System.out.println(ans);
  }
}