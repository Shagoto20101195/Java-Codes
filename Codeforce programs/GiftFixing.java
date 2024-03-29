//Written by Shagoto
import java.util.*;
public class GiftFixing
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
      int n = read.nextInt();
      int [] can = new int[n];
      int [] or = new int[n];
      long minC = Integer.MAX_VALUE;
      long minO = Integer.MAX_VALUE;
      
      for(int i = 0; i<n; i++)
      {
        can[i] = read.nextInt();
        minC = Math.min(minC, can[i]);
      }
      
      for(int i = 0; i<n; i++)
      {
        or[i] = read.nextInt();
        minO = Math.min(minO, or[i]);
      }
      
      long difC = 0;
      for(int i = 0; i<n; i++)
      {
        difC += Math.abs(minC - can[i]);
      }
      
      long difO = 0;
      for(int i = 0; i<n; i++)
      {
        difO += Math.abs(minO - or[i]);
      }
      
      if(n == 1)
      {
        System.out.println(0);
      }
      else if(difO == 0 && difC == 0)
      {
        System.out.println(0);
      }
      else if(difO == 0)
      {
        System.out.println(difC);
      }
      else if(difC == 0)
      {
        System.out.println(difO);
      }
      else
      {
        long count = 0;
        for(int i = 0; i<n; i++)
        {
          count += Math.max(can[i] - minC, or[i] - minO);
        }
        
        System.out.println(count);
      }
    }
  }
}