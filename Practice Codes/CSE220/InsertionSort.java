import java.util.*;
public class InsertionSort
{
  static int [] insertionsort(int [] arr)
  {
    for(int i = 0; i<arr.length; i++)
    {
      for(int j = i-1; j>=0; j--)
      {
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
        else
        {
          break;
        }
      }
    }
    
    return arr;
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
    
    int [] sort_arr = insertionsort(arr);
    for(int i = 0; i<n; i++)
    {
      System.out.print(sort_arr[i]+" ");
    }
    System.out.println();
  }
}