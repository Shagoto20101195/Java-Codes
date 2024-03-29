//Written by Shagoto
import java.util.*;
public class EvenOdds
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long k = read.nextLong();
    
    long temp = 0;
    long ans = 0;
    if(n % 2 == 0)
    {
      temp = n / 2;
    }
    else
    {
      temp = n / 2 + 1;
    }
    
    if(k <= temp)
    {
      ans = 2 * k - 1;
    }
    else
    {
      ans = (k - temp) * 2;
    }
    
    System.out.println(ans);
  }
}