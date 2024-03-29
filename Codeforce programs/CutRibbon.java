// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class CutRibbon
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int [] memo = new int[4010];
    int [] len = new int[3];
    int n = read.nextInt();
    len[0] = read.nextInt();
    len[1] = read.nextInt();
    len[2] = read.nextInt();
    Arrays.sort(len);
    Arrays.fill(memo, -1);
    
    memo[0] = 0;
    for(int i = 1; i<=n; i++)
    {
      for(int j = 0; j<3; j++)
      {
        if(i - len[j] < 0)
        {
          continue;
        }
        memo[i] = Math.max(memo[i-len[j]], memo[i]);
      }
      
      if(memo[i] != -1)
      {
        memo[i]++;
      }
    }
    
    System.out.println(memo[n]);
  }
}