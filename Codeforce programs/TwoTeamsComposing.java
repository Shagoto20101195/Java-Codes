//Written by Shagoto
import java.util.*;
public class TwoTeamsComposing
{
 public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
      int n = read.nextInt();
      int [] arr = new int[n];
      int max = 0;
      
      for(int i = 0; i<n; i++)
      {
        arr[i] = read.nextInt();
        
        if(a.containsKey(arr[i]))
        {
          int temp = a.get(arr[i]) + 1;
          a.put(arr[i], temp);
          if(temp > max)
          {
            max = temp;
          }
        }
        else
        {
          a.put(arr[i], 1);
          
          if(max == 0)
          {
            max = 1;
          }
        }
      }
      
      if(n == 1)
      {
        System.out.println(0);
      }
      else if(a.size() == n || a.size() == 1)
      {
        System.out.println(1);
      }
      else if(a.size() - 1 >= max)
      {
        System.out.println(max);
      }
      else
      {
        if(max > a.size())
        {
          System.out.println(a.size());
        }
        else
        {
          System.out.println(a.size() - 1);
        }
      }
    }
  }
}