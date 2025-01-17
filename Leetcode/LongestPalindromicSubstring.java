import java.util.*;
import java.io.*;
public class LongestPalindromicSubstring
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    int n = s.length();
    int [][] dp = new int[n+1][n+1];  // dp[i][j] = palindrome length of i and ends at char j
    
    for(int i = 0; i<=n; i++)
    {
      dp[0][i] = 1;
    }
    
    for(int i = 1; i<=n; i++)
    {
      dp[1][i] = 1;
    }
    
    int max = 1;
    String ans = ""+s.charAt(0);
    for(int i = 2; i<=n; i++)
    {
      for(int j = i; j<=n; j++)
      {
        // A string is palindrome if:
        // First and last char match
        // And the substring between them is palindrome
        // j - i = first char , j-1 = last char
        if(s.charAt(j-1) == s.charAt(j-i) && dp[i-2][j-1] == 1)
        {
          dp[i][j] = 1;
          
          if(i > max)
          {
            max = i;
            ans = s.substring(j-i, j);
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}