// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class EvenSubsetSumProblem
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] sum = new int[n+1];
      for(int i = 1; i<=n; i++)
      {
        int v = read.nextInt();
        sum[i] = sum[i-1] + v;
      }
      
      boolean check = true;
      for(int i = 0; i<=n; i++)
      {
        if(!check)
        {
          break;
        }
        
        for(int j = i+1; j<=n; j++)
        {
          if(Math.abs(sum[j] - sum[i]) % 2 == 0)
          {
            System.out.println(j - i);
            for(int k = i+1; k<=j; k++)
            {
              System.out.print(k+" ");
            }
            
            check = false;
            break;
          }
        }
      }
      
      if(check)
      {
        System.out.println(-1);
      }
      else
      {
        System.out.println();
      }
    }
  }
}