//Written by Shagoto
import java.util.*;
public class Games
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] a = new int[n];
    int [] b = new int[n];
    
    for(int i = 0; i<n; i++)
    {
      a[i] = read.nextInt();
      b[i] = read.nextInt();
    }
    
    int count = 0;
    for(int i = 0; i<n; i++)
    {
      for(int j = 0; j<n; j++)
      {
        if(i == j)
        {
          continue;
        }
        else if(a[i] == b[j])
        {
          count++;
        }
      }
    }
    
    System.out.println(count);
  }
}