//Written by Shagoto
import java.util.*;
public class Main
{
  static ArrayList<Integer> primes = new ArrayList<Integer>();
  static BitSet bs = new BitSet(10000001);
  static void sieve()
  {
    primes.add(2);
    for(int i = 4; i<=10000000; i+=2)
    {
      bs.set(i,true);
    }
    
    for(int i = 3; i<=10000000; i+=2)
    {
      if(!bs.get(i))
      {
        primes.add(i);
        for(int j = 3; i*j<=10000000; j+=2)
        {
          bs.set(i*j,true);
        }
      }
    }
  }
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    sieve();
    int n = read.nextInt();
    System.out.println(primes.get(n-1));
  }
}