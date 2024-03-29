//Written by Shagoto
import java.util.*;
public class RainbowDashFluttershy
{
  /*
  static ArrayList<Integer> primes = new ArrayList<Integer>();
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
      int n = read.nextInt();
      
      System.out.println(n / 2 + 1);
    }
  }
}