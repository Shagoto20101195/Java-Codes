// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class LastMinuteEnhancement
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] arr = new int[2*n+10];
      for(int i = 0; i<n; i++)
      {
        int v = read.nextInt();
        arr[v]++;
        if(arr[v] > 1)
        {
          arr[v+1]++;
        }
      }
      
      int count = 0;
      for(int i = 0; i<2*n+10; i++)
      {
        if(arr[i] > 0)
        {
          count++;
        }
      }
      
      System.out.println(count);
    }
  }
}