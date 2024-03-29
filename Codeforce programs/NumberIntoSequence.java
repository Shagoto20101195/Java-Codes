// May The Father of Understanding Guide Us
import java.util.*;
public class NumberIntoSequence
{
  static HashMap<Long, Integer> fact(long n)
  {
    HashMap<Long, Integer> ret = new HashMap<Long, Integer>();
    for(long i = 2; i<=(long)Math.sqrt(n); i++)
    {
      if(n % i == 0)
      {
        while(n % i == 0)
        {
          if(ret.containsKey(i))
          {
            int t = ret.get(i) + 1;
            ret.put(i, t);
          }
          else
          {
            ret.put(i, 1);
          }
          n /= i;
        }
      }
    }
    
    if(n > 1)
    {
      ret.put(n, 1);
    }
    
    return ret;
  }
  
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long n = read.nextLong();
      HashMap<Long, Integer> arr = fact(n);
      
      long ans = 1;
      long maxfact = 0;
      int maxCount = -1;
      int minCount = 50000;
      for(Long i: arr.keySet())
      {
        int temp = maxCount;
        maxCount = Math.max(maxCount, arr.get(i));
        minCount = Math.min(minCount, arr.get(i));
        
        if(temp != maxCount)
        {
          maxfact = i;
        }
      }
      
      System.out.println(maxCount);
      for(Long i: arr.keySet())
      {
        if(maxCount == 1 && minCount == 1)
        {
          ans *= i;
        }
        else if(maxfact == i)
        {
          for(int j = 1; j<=arr.get(i)-1; j++)
          {
            System.out.print(maxfact+" ");
          }
          ans *= maxfact;
        }
        else
        {
          ans *= (long)Math.pow(i, arr.get(i));
        }
      }
      
      if(ans != 1)
      {
        System.out.println(ans);
      }
    }
  }
}