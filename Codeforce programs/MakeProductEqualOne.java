// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class MakeProductEqualOne
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    long [][] memo = new long[n+1][2];
    for(int i = 0; i<n; i++)
    {
      int v = read.nextInt();
      if(i == 0)
      {
        memo[i][1] = Math.abs(v-1);
        memo[i][0] = Math.abs(-1 - v);
      }
      else
      {
        memo[i][0] = Math.min(memo[i-1][0] + Math.abs(v-1), memo[i-1][1] + Math.abs(-1-v));
        memo[i][1] = Math.min(memo[i-1][0] + Math.abs(-1-v), memo[i-1][1] + Math.abs(v-1));
      }
    }
    
    System.out.println(memo[n-1][1]);
  }
}