// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class AtCoderFrog1
{
  static int nmax = (int)1e5 + 10;
  static int [] cost = new int[nmax];
  static long [] memo = new long[nmax];
  static long dp(int n)
  {
    if(n == 1)
    {
      return 0;
    }
    
    if(n == 2)
    {
      return Math.abs(cost[1] - cost[2]);
    }
    
    if(memo[n] != -1)
    {
      return memo[n];
    }
    
    memo[n] = Math.min(dp(n-1) + Math.abs(cost[n] - cost[n-1]), dp(n-2) + Math.abs(cost[n] - cost[n-2]));
    return memo[n];
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    Arrays.fill(memo, -1);
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      cost[i] = read.nextInt();
    }
    
    System.out.println(dp(n));
  }
}