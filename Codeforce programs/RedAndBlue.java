// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class RedAndBlue
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    read.nextLine();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] arr1 = new int[n+1];
      for(int i = 1; i<=n; i++)
      {
        arr1[i] = arr1[i-1] + read.nextInt();
      }
      
      int m = read.nextInt();
      int [] arr2 = new int[m+1];
      for(int i = 1; i<=m; i++)
      {
        arr2[i] = arr2[i-1] + read.nextInt();
      }
      
      int sum = 0;
      for(int i = 1; i<=n; i++)
      {
        for(int j = 0; j<=m; j++)
        {
          sum = Math.max(sum, arr1[i]+arr2[j]);
        }
      }
      
      for(int i = 1; i<=m; i++)
      {
        for(int j = 0; j<=n; j++)
        {
          sum = Math.max(sum, arr1[j]+arr2[i]);
        }
      }
      
      System.out.println(sum);
    }
  }
}