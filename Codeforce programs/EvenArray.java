//Written by Shagoto
import java.util.*;
public class EvenArray
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] arr = new int[n];
      
      int count = 0;
      int check = 0;
      int odd = 0;
      int even = 0;
      
      for(int i = 0; i<n; i++)
      {
        arr[i] = read.nextInt();
        
        if(arr[i] % 2 == 0)
        {
          even++;
        }
        else
        {
          odd++;
        }
        
        if(i % 2 == arr[i] % 2 && check == 0)
        {
          check = 0;
        }
        else
        {
          check = -1;
        }
      }
      
      if(check == 0)
      {
        System.out.println(count);
      }
      
      else if(n % 2 == 1 && even - odd == 1)
      {
        for(int i = 0; i<n; i++)
        {
          if(i % 2 != arr[i] % 2)
          {
            count++;
          }
        }
        
        System.out.println(count / 2);
      }
      
      else if(n % 2 == 0 && even == odd)
      {
        for(int i = 0; i<n; i++)
        {
          if(i % 2 != arr[i] % 2)
          {
            count++;
          }
        }
        
        System.out.println(count / 2);
      }
      else
      {
        System.out.println(-1);
      }
    }
  }
}