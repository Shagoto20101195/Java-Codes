import java.util.*;
import java.io.*;
public class ancestorAggregate
{
  static int nmax = (int)2e5 + 10;
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static Pair [][] ancestor = new Pair[nmax][20];
  static int [] val = new int[nmax];
  
  static void dfs(int u, int par)
  {
    for(int i = 0; i<20; i++)
    {
      ancestor[u][i] = new Pair(-1, -1);
    }
    
    if(par == -1)
    {
      ancestor[u][0] = new Pair(par, val[u]);
      
      for(int i = 1; i<20; i++)
      {
        int v = ancestor[u][i-1].first;
        int temp = ancestor[u][i-1].second;
        
        if(v == -1)
        {
          break;
        }
        
        ancestor[u][i].first = ancestor[v][i-1].first;
        ancestor[u][i].second = ancestor[v][i-1].second + temp;
      }
    }
    
    for(Integer v: arr[u])
    {
      if(v == par)
      {
        continue;
      }
      
      dfs(v, u);
    }
  }
  
  // O(log n)
  static Pair getAncestor(int u, int k)  // (kth ancestor, value upto kth ancestor (inclusive))
  {
    int sum = 0;
    
    for(int i = 0; i<20; i++)
    {
        if((k & (1<<i)) != 0)
        {
            sum += ancestor[u][i].second;
            u = ancestor[u][i].first;
            if(u == -1)
            {
                return new Pair(-1, -1);
            }
        }
    }
    
    sum += val[u];
    return new Pair(u, sum);
  }
  
  // Binary Lifting
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int q = read.nextInt();
    
    for(int i = 0; i<=n; i++)
    {
      arr[i] = new ArrayList<Integer>();
    }
    
    for(int i = 1; i<=n; i++)
    {
      val[i] = read.nextInt();
    }
    
    for(int i = 0; i<n-1; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr[u].add(v);
      arr[v].add(u);
    }
    
    dfs(1, -1);
  }
}

class Pair
{
  int first;
  int second;
  
  public Pair(int v1, int v2)
  {
    first = v1;
    second = v2;
  }
}