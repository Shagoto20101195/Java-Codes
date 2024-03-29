import java.util.*;
public class RecursiveDCBinarySearch
{
  static int bs(int [] arr, int l, int r, int source)
  {
    int mid = (l + r) / 2;
    
    if(arr[mid] == source)
    {
      return mid;
    }
    else if(arr[mid] > source)
    {
      return bs(arr, l, mid-1, source);
    }
    else if(arr[mid] < source)
    {
      return bs(arr, mid+1, r, source);
    }
    else
    {
      return -1;
    }
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
    
    // Assuming given a sorted array
    int source = read.nextInt();
    System.out.println(bs(arr, 0, n-1, source));
  }
}