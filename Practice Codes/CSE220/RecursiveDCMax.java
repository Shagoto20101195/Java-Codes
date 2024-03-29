import java.util.*;
public class RecursiveDCMax
{
  static int max(int [] arr, int l, int r)
  {
    if(l == r)
    {
      return arr[l];
    }
    
    int mid = (l + r) / 2;
    return Math.max(max(arr, l, mid), max(arr, mid + 1, r));
  }
  
  public static void main(String [] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] arr = new int[n];
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextInt();
    }
    
    System.out.println(max(arr, 0, n-1));
  }
}