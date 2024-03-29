import java.util.*;
public class RecursiveInsertionSort
{
  static int [] isort(int [] arr, int l)
  {
    if(l == arr.length)
    {
      return arr;
    }
    
    for(int i = l - 1; i>=0; i--)
    {
      if(arr[i] > arr[i+1])
      {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
      }
      else
      {
        break;
      }
    }
    
    return isort(arr, l+1);
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
    
    int [] sort_arr = isort(arr, 0);
    for(int i = 0; i<n; i++)
    {
      System.out.print(sort_arr[i]+" ");
    }
    System.out.println();
  }
}