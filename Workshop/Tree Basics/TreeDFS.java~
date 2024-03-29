import java.util.*;
import java.io.*;
public class TreeDFS
{
  static int nmax = (int)1e5 + 10;
  
  static int [] subtree = new int[nmax];
  static int [] depth = new int[nmax];
  static int [] height = new int[nmax];
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  
  static void dfs(int u, int parent)
  {
    subtree[u] = 1;
    
    if(parent == -1)
    {
      depth[u] = 0;
    }
    else
    {
      depth[u] = depth[parent] + 1;
    }
    
    height[u] = 0;
    
    for(Integer i: arr[u])
    {
      if(i == parent)
      {
        continue;
      }
      
      dfs(i, u);
      subtree[u] += subtree[i];
      height[u] = Math.max(height[u], height[i]+1);
    }
  }
  
  public static void main(String [] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      arr[i] = new ArrayList<Integer>();
    }
    
    for(int i = 1; i<n; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr[u].add(v);
      arr[v].add(u);
    }
    
    dfs(1, -1);
    
    for(int i = 1; i<=n; i++)
    {
      System.out.println("Subtree of "+i+": "+subtree[i]);
    }
    for(int i = 1; i<=n; i++)
    {
      System.out.println("Depth of "+i+": "+subtree[i]);
    }
    for(int i = 1; i<=n; i++)
    {
      System.out.println("Height of "+i+": "+subtree[i]);
    }
  }
}