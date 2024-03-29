import java.util.*;
public class Task7
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int x = read.nextInt();
    int y = read.nextInt();
    
    int [] arr1 = new int[x];
    int [] arr2 = new int[y];
    
    int max1 = 0;
    for(int i = 0; i<x; i++)
    {
      arr1[i] = read.nextInt();
      
      if(arr1[i] > max1)
      {
        max1 = arr1[i];
      }
    }
    
    int [] aux = new int[max1 + 1];
    for(int i = 0; i<x; i++)
    {
      aux[arr1[i]]++;
    }
    
    int max2 = 0;
    for(int i = 0; i<y; i++)
    {
      arr2[i] = read.nextInt();
      
      if(arr2[i] > max2)
      {
        max2 = arr2[i];
      }
    }
    
    int [] count = new int[max2+1];
    count[0] = aux[0];
    for(int i = 1; i<=max2; i++)
    {
      if(i <= max1)
      {
        count[i] = count[i-1] + aux[i];
      }
      else
      {
        count[i] = count[i-1];
      }
    }
    
    for(int i = 0; i<y; i++)
    {
      System.out.print(count[arr2[i]]+" ");
    }
    System.out.println();
  }
}