import java.util.*;
import java.io.*;
public class Divisors
{
  static int nmax = 200005;
  static ArrayList<Pair> [] buckets = new ArrayList[nmax]; // (L, i)
  static int [] ans = new int[nmax];
  static ArrayList<Integer> [] multiples = new ArrayList[nmax];
  static ArrayList<Integer> [] divisors = new ArrayList[nmax];
  
  static void sieve()
  {
    for(int i = 1; i<nmax; i++)
    {
      for(int j = i; j<nmax; j+=i)
      {
        // j's are multiple of i
        divisors[j].add(i);
        
        if(i != j)
        {
          multiples[i].add(j);
        }
      }
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    for(int i = 0; i<nmax; i++)
    {
      buckets[i] = new ArrayList<>();
      multiples[i] = new ArrayList<>();
      divisors[i] = new ArrayList<>();
    }
    
    sieve();
    
    int n = read.nextInt();
    int q = read.nextInt();
    int [] input = new int[n+1];
    
    for(int i = 1; i<=n; i++)
    {
      input[i] = read.nextInt();
    }
    
    for(int i = 0; i<q; i++)
    {
      int l = read.nextInt();
      int r = read.nextInt();
      
      buckets[r].add(new Pair(l, i));
    }
    
    build(n); // add
    
    int [] occurences = new int[n+1];
    HashMap<Integer, Integer> last = new HashMap<>(); // last[x] = last occurence of x
    
    for(int r = 1; r<=n; r++)
    {
      // update
      
      int x = input[r];
      
      occurences[x] = r;
      
      for(Integer y: divisors[x])
      {
        if(occurences[y] == 0)
        {
          continue;
        }
        
        update(occurences[y], +1);
      }
      
      for(Integer y: multiples[x])
      {
        if(occurences[y] == 0)
        {
          continue;
        }
        
        update(occurences[y], +1);
      }
      
      for(Pair p: buckets[r])
      {
        int l = p.first;
        int i = p.second;
        ans[i] = query(l, r);
      }
    }
    
    for(int i = 0; i<q; i++)
    {
      System.out.println(ans[i]);
    }
  }
}

class Pair
{
  int first;
  int second;
  
  public Pair(int x, int y)
  {
    first = x;
    second = y;
  }
}