//Written by Shagoto
import java.util.*;
public class PashmakAndFlowers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int [] arr = new int[n];
    int min = 0;
    int max = 0;
    
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextInt();
      
      if(i == 0)
      {
        min = arr[i];
        max = arr[i];
      }
      else if(arr[i] > max)
      {
        max = arr[i];
      }
      else if(arr[i] < min)
      {
        min = arr[i];
      }
    }
    
    int maxCount = 0;
    int minCount = 0;
    for(int i = 0; i<n; i++)
    {
      if(arr[i] == max)
      {
        maxCount++;
      }
      else if(arr[i] == min)
      {
        minCount++;
      }
    }
    
    long count = 0;
    if(max == min)
    {
      count = (long)n * ((long)n-1) / 2;
    }
    else
    {
      count = (long)maxCount*(long)minCount;
    }
    
    System.out.println(max-min+" "+count);
  }
}