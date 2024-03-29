import java.util.*;
import java.io.*;
public class getAncestor
{
  static int nmax = (int)2e5 + 10;
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static int [][] ancestor = new int[nmax][20]; // 2^20 > 10^6
  // ancestor[x][i] = 2^i -th ancestor of x
  
  // O(n*log(n))
  static void dfs(int u, int par)
  {
    for(int i = 0; i<20; i++)
    {
      ancestor[u][i] = -1;
    }
    
    if(par != -1)
    {
      ancestor[u][0] = par;
      for(int i = 1; i<20; i++)
      {
        int v = ancestor[u][i-1];
        if(v == -1)
        {
          break;
        }
        
        ancestor[u][i] = ancestor[v][i-1];
      }
    }
    
    for(Integer v : arr[u])
    {
      if(v == par)
      {
        continue;
      }
      
      dfs(v, u);
    }
  }
  
  // O(log n)
  // Binary Lifting
  static int getAncestor(int u, int k)
  {
    for(int i = 0; i<20; i++)
    {
      if((k & (1<<i)) != 0)
      {
        u = ancestor[u][i];
        if(u == -1)
        {
          return -1;
        }
      }
    }
    return u;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int q = read.nextInt();
    
    for(int i = 0; i<=n; i++)
    {
      arr[i] = new ArrayList<Integer>();
    }
    
    for(int i = 2; i<=n; i++)
    {
      int boss = read.nextInt();
      arr[boss].add(i);
    }
    
    dfs(1, -1);
    for(int i = 0; i<q; i++)
    {
      int x = read.nextInt();
      int k = read.nextInt();
      
      System.out.println(getAncestor(x, k));
    }
  }
}