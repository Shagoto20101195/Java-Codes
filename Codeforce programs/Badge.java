// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class Badge
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] arr = new int[n+1];
    int [] hole = new int[n+1];
    for(int i = 1; i<=n; i++)
    {
      arr[i] = read.nextInt();
    }
    
    for(int i = 1; i<=n; i++)
    {
      int cur = i;
      hole[i]++;
      while(hole[cur] != 2)
      {
        cur = arr[cur];
        hole[cur]++;
      }
      
      System.out.print(cur+" ");
      Arrays.fill(hole, 0);
    }
  }
}