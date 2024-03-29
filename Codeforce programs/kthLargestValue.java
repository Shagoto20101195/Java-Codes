import java.util.*;
import java.io.*;
public class kthLargestValue
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int q = read.nextInt();
    int [] arr = new int[n+1];
    int count0 = 0;
    int count1 = 0;
    for(int x = 1; x<=n; x++)
    {
      arr[x] = read.nextInt();
      if(arr[x] == 0)
      {
        count0++;
      }
      else
      {
        count1++;
      }
    }
    
    for(int i = 0; i<q; i++)
    {
      int type = read.nextInt();
      int v = read.nextInt();
      if(type == 1)
      {
        if(arr[v] == 0)
        {
          count1++;
          count0--;
        }
        else
        {
          count0++;
          count1--;
        }
        
        arr[v] = 1 - arr[v];
      }
      else
      {
        if(v <= count1)
        {
          System.out.println(1);
        }
        else
        {
          System.out.println(0);
        }
      }
    }
  }
}