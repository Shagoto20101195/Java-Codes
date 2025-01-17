// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class DiceCombinations
{
  static int mod = (int)1e9 + 7;
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    // General idea: to get that sum, one obviously had to add any 1 to 6 num in last step
    // Therefore check all cases from 1 to 6
    // I.e memo[x] = memo[x-1] + memo[x-2] + ... memo[x-6]
    long [] memo = new long[(int)1e6+10];
    int n = read.nextInt();
    memo[0] = 1; // setting base case, only one way to reach 0 i.e by minusing any 1 to 6 num
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=6; j++)
      {
        if(i - j < 0)
        {
          break;
        }
        memo[i] = (memo[i] + memo[i-j]) % mod;
      }
    }
    
    System.out.println(memo[n]);
  }
}