import java.util.*;
public class ZeroOneKnapsack
{
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int kW = read.nextInt();
    
    int [] val = new int[n+1];
    int [] weight = new int[n+1];
    
    for(int i = 1; i<=n; i++)
    {
      weight[i] = read.nextInt();
    }
    
    for(int i = 1; i<=n; i++)
    {
      val[i] = read.nextInt();
    }
    
    int [][] dp = new int[n+1][kW+1];
    
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=kW; j++)
      {
        if(weight[i] > j)
        {
          dp[i][j] = dp[i-1][j];
        }
        else
        {
          dp[i][j] = Math.max(val[i] + dp[i-1][j - weight[i]], dp[i-1][j]);
        }
      }
    }
    
    System.out.println(dp[n][kW]);
  }
}