//Written by Shagoto
import java.util.*;
public class InterestingDrinks
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int n = read.nextInt();
    int [] price = new int[n];
    
    for(int i = 0; i<n; i++)
    {
      price[i] = read.nextInt();
    }
    
    Arrays.sort(price);
    
    int q = read.nextInt();
    for(int x = 1; x<=q; x++)
    {
      int m = read.nextInt();
      
      if(m >= price[n-1])
      {
        System.out.println(n);
      }
      else if(m < price[0])
      {
        System.out.println(0);
      }
      else
      {
        int low = 0;
        int high = n-1;
        int ans = 0;
        
        while(low <= high)
        {
          int mid = (low + high) / 2;
          
          if(price[mid] <= m)
          {
            ans = (int)Math.max(ans,mid+1);
            low = mid + 1;
          }
          else
          {
            high = mid - 1;
          }
        }
        
        System.out.println(ans);
      }
    }
  }
}