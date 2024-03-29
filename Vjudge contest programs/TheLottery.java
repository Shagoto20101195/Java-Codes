// May The Father of Understanding Guide Us
import java.util.*;
public class TheLottery
{
  static long gcd(long a, long b)
  {
    if(b == 0)
    {
      return a;
    }
    return gcd(b, a % b);  
  }
  
  static long lcm(long a, long b)
  {
    return (a * b) / gcd(a, b);
  }
  
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    while(read.hasNext())
    {
      long ans = 0;
      long n = read.nextLong();
      long m = read.nextLong();
      long [] arr = new long[(int)m];
      
      for(int i = 0; i<arr.length; i++)
      {
        arr[i] = read.nextLong();
      }
      
      for(int mask = 1; mask<=(1<<m)-1; mask++)
      {
        ArrayList<Long> temp = new ArrayList<Long>();
        for(int i = 0; i<(int)m; i++)
        {
          if((mask & (1<<i)) != 0)
          {
            temp.add(arr[i]);
          }
        }
        
        long last_lcm = 1;
        for(int i = 0; i<temp.size(); i++)
        {
          last_lcm = lcm(last_lcm, temp.get(i));
        }
        
        if(temp.size() % 2 == 1)
        {
          ans += n / last_lcm;
        }
        else
        {
          ans -= n / last_lcm;
        }
      }
      System.out.println(n - ans);
    }
  }
}