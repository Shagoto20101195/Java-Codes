//Written by Shagoto
import java.util.*;
public class Waiter
{
  static ArrayList<Integer> primes = new ArrayList<Integer>();
  static void sieve()
  {
    BitSet bs = new BitSet(9740);
    
    primes.add(2);
    for(int i = 4; i<9740; i+=2)
    {
      bs.set(i,true);
    }
    
    for(int i = 3; i<9740; i+=2)
    {
      if(!bs.get(i))
      {
        primes.add(i);
        
        for(int j = i*i; j<9740; j += i)
        {
          bs.set(j,true);
        }
      }
      else
      {
        continue;
      }
    }
  }
  
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    sieve();
    
    int n = read.nextInt();
    int q = read.nextInt();
    Stack<Integer> main = new Stack<Integer>();
    
    for(int i = 0; i<n; i++)
    {
      main.push(read.nextInt());
    }
    
    for(int i = 0; i<q; i++)
    {
      Stack<Integer> temp = new Stack<Integer>();
      Stack<Integer> remain = new Stack<Integer>();
      
      while(!main.empty())
      {
        int v = main.pop();
        
        if(v % primes.get(i) == 0)
        {
          temp.push(v);
        }
        else
        {
          remain.push(v);
        }
      }
      
      main = remain;
      
      while(!temp.empty())
      {
        System.out.println(temp.pop());
      }
    }
    
    while(!main.empty())
    {
      System.out.println(main.pop());
    }
  }
}