//Written by Shagoto
import java.util.*;
public class ArrivalOfTheGeneral
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] a = new int[n];
    int max = 0;
    int min = 0;
    int minIndex = 0;
    int maxIndex = 0;
    int maxP = 0;
    int minP = 0;
    
    for(int i = 0; i<a.length; i++)
    {
      a[i] = read.nextInt();
      
      if(i == 0)
      {
        max = a[i];
        maxIndex = i;
        min = a[i];
        minIndex = i;
      }
      else if(a[i] > max)
      {
        max = a[i];
        maxIndex = i;
      }
      else if(a[i] <= min)
      {
        min = a[i];
        minIndex = i;
      }
    }
    
    maxP = maxIndex;
    minP = minIndex;
    int count = 0;
    while(maxIndex > 0)
    {
      int temp = a[maxIndex - 1];
      a[maxIndex] = temp;
      a[maxIndex - 1] = max;
      maxIndex--;
      count++;
    }
    
    while(minIndex < n-1)
    {
      int temp = a[minIndex + 1];
      a[minIndex] = temp;
      a[minIndex + 1] = min;
      minIndex++;
      count++;
    }
    
    if(maxP < minP)
    {
      System.out.println(count);
    }
    else
    {
      System.out.println(count - 1);
    }
  }
}