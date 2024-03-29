// May The Father of Understanding Guide Us
import java.util.*;
public class FavoriteSequence
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] arr1 = new int[n/2];
      int [] arr2 = new int[n - (n/2)];
      for(int i = 0; i<n/2; i++)
      {
        arr1[i] = read.nextInt();
      }
      for(int i = 0; i<n-(n/2); i++)
      {
        arr2[i] = read.nextInt();
      }
      
      int count = 0;
      int index1 = 0; 
      int index2 = n - (n/2);
      while(count != n)
      {
        if(count == n - 1)
        {
          System.out.print(arr2[0]);
        }
        else if(count % 2 == 0)
        {
          System.out.print(arr1[index1]+" ");
          index1++;
        }
        else
        {
          System.out.print(arr2[index2 - 1]+" ");
          index2--;
        }
        count++;
      }
      System.out.println();
    }
  }
}