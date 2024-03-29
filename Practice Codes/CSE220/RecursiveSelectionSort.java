import java.util.*;
public class RecursiveSelectionSort
{
  static int [] ss(int [] arr, int l)
  {
    if(l == 0)
    {
      return arr;
    }
    
    int max = arr[l];
    int maxIndex = l;
    for(int i = 0; i<l; i++)
    {
      if(arr[i] > max)
      {
        max = arr[i];
        maxIndex = i;
      }
    }
    
    int temp = arr[l];
    arr[l] = max;
    arr[maxIndex] = temp;
    
    return ss(arr, l-1);
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
    
    int [] sorted = ss(arr, n-1);
    for(int i = 0; i<n; i++)
    {
      System.out.print(sorted[i]+" ");
    }
    System.out.println();
  }
}