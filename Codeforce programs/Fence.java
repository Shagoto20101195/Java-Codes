//Written by Shagoto
import java.util.*;
public class Fence
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int k = read.nextInt();
    
    int sum = 0;
    int index = 0;
    int [] arr = new int[n];
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextInt();
      
      if(i < k)
      {
        sum += arr[i];
      }
    }
    
    int min = sum;
    for(int i = k; i<n; i++)
    {
      sum = sum - arr[i - k] + arr[i];
      
      if(sum < min)
      {
        min = sum;
        index = i - k + 1;
      }
    }
    
    System.out.println(index + 1);
    
  }
}