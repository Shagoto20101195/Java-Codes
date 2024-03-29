// Source: https://cses.fi/problemset/task/1679

import java.util.*;
import java.io.*;
public class topsortDFS
{
  static int nmax = (int)1e5 + 10;
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static ArrayList<Integer> topsort = new ArrayList<>();
  static int [] vis = new int[nmax]; // 0 - not visited; 1 - visiting; 2 - visited
  
  static boolean dfs(int u)
  {
    vis[u] = 1;
    
    for(Integer v : arr[u])
    {
      if(vis[v] == 2)
        continue;
      if(vis[v] == 1)
        return false;
      if(dfs(v) == false)
        return false;
    }
    
    vis[u] = 2;
    topsort.add(u);
    return true;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    
    for(int i = 0; i<=n; i++)
    {
      arr[i] = new ArrayList<>();
    }
    
    for(int i = 0; i<m; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr[u].add(v);
    }
    
    for(int i = 1; i<=n; i++)
    {
      if(vis[i] == 0)
      {
        if(dfs(i) == false)
        {
          System.out.println("IMPOSSIBLE");
          return;
        }
      }
    }
    
    for(int i = topsort.size() - 1; i>=0; i--)
    {
      System.out.print(topsort.get(i)+" ");
    }
    System.out.println();
  }
}