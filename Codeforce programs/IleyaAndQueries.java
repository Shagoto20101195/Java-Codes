//Written by Shagoto
import java.util.*;
public class IleyaAndQueries
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    String s = read.nextLine();
    int n = s.length();
    int [] arr = new int[s.length()+1];
    
    for(int i = 1; i<n; i++)
    {
      if(s.charAt(i) == s.charAt(i-1))
      {
        arr[i] = 1;
      }
    }
    
    for(int i = 1; i<=n; i++)
    {
      arr[i] += arr[i-1];
    }
    
    int m = read.nextInt();
    for(int i = 1; i<=m; i++)
    {
      int l = read.nextInt();
      int r = read.nextInt();
      
      System.out.println(arr[r-1] - arr[l-1]);
    }
  }
}