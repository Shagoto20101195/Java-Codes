//Written by Shagoto
import java.util.*;
public class BuyAShovel
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int k = read.nextInt();
    int r = read.nextInt();
    
    if(k < 10 && r == k)
    {
      System.out.println(1);
    }
    else if(r % k == 0)
    {
      System.out.println(r / k);
    }
    else
    {
      int t = 1;
      while(true)
      {
        if((10*t) % k == 0)
        {
          System.out.println((10*t) / k);
          break;
        }
        else if((10*t + r) % k == 0)
        {
          System.out.println((10*t + r) / k);
          break;
        }
        else
        {
          t++;
        }
      }
    }
  }
}