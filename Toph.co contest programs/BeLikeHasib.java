//Written by Shagoto
import java.util.*;
public class BeLikeHasib
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long x = read.nextLong();
    
    long low = 1;
    long high = n;
    long count = 0;
    
    while(low<=high)
    {
      long mid = (low+high) / 2;
      
      if(high == low)
      {
        System.out.println(count);
        break;
      }
      else if(x > mid)
      {
        low = mid + 1;
        count++;
      }
      else
      {
        high = mid;
        count++;
      }
    }
  }
}