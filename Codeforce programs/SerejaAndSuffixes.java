//Written by Shagoto
import java.util.*;
public class SerejaAndSuffixes
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int m = read.nextInt();
    
    int [] arr = new int[n];
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextInt();
    }
    
    HashSet<Integer> check = new HashSet<Integer>();
    int [] ans = new int[n+1];
    for(int i = n - 1; i>=0; i--)
    {
      check.add(arr[i]);
      ans[i] = check.size();
    }
    
    for(int x = 1; x<=m; x++)
    {
      int q = read.nextInt();
      System.out.println(ans[q - 1]);
    }
  }
}