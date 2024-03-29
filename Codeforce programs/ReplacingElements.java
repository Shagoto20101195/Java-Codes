// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class ReplacingElements
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int d = read.nextInt();
      int [] arr = new int[n];
      boolean check = true;
      for(int i = 0; i<n; i++)
      {
        arr[i] = read.nextInt();
        
        if(arr[i] > d)
        {
          check = false;
        }
      }
      
      Arrays.sort(arr);
      
      if(arr[0] + arr[1] <= d || check)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}