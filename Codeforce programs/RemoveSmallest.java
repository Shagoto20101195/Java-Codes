//Written by Shagoto
import java.util.*;
public class RemoveSmallest
{
/*  static ArrayList<Integer> primes = new ArrayList<Integer>();
  static void sieve()
  {
    BitSet bs = new BitSet(100);
    primes.add(2);
    for(int i = 4; i<100; i+=2)
    {
      bs.set(i,true);
    }
    
    for(int i = 3; i<100; i+=2)
    {
      if(!bs.get(i))
      {
        primes.add(i);
        for(int j = i*i; j<100; j+=i)
        {
          bs.set(j,true);
        }
      }
    }
  }
  */
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      int n = read.nextInt();
      
      for(int i = 0; i<n; i++)
      {
        arr.add(read.nextInt());
      }
      
      Collections.sort(arr);
      boolean check = true;
      
      while(arr.size()>1)
      {
        if(Math.abs(arr.get(0) - arr.get(1)) <= 1)
        {
          arr.remove(arr.indexOf(Math.min(arr.get(0) , arr.get(1))));
        }
        else
        {
          check = false;
          break;
        }
      }
      
      if(check)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}