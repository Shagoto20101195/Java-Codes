//Written by Shagoto
import java.util.*;
public class FindingMinDifInArray
{
  static int minDif(int[] arr, int n) 
  { 
    Arrays.sort(arr); 
    int diff = Integer.MAX_VALUE; 
    
    for (int i=0; i<n-1; i++) 
      if (arr[i+1] - arr[i] < diff) 
      diff = arr[i+1] - arr[i]; 
    
    return diff; 
  } 
  
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] a = new int[n];
      for(int i = 0; i<n; i++)
      {
        a[i] = read.nextInt();
      }
      
      System.out.println(minDif(a, a.length));
    }
  }
}