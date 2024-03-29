// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class Party
{
  static ArrayList<Integer> [] arr = new ArrayList[2005];
  static int max = 0;
  static void dfs(int u, boolean [] visited, int [] dist)
  {
    visited[u] = true;
    
    for(Integer i: arr[u])
    {
      if(!visited[i])
      {
        dist[i] = dist[u] + 1;
        max = Math.max(max, dist[i]);
        dfs(i, visited, dist);
      }
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    for(int i = 0; i<n+1; i++)
    {
      arr[i] = new ArrayList<Integer>();
    }
    
    for(int i = 1; i<=n; i++)
    {
      int v = read.nextInt();
      
      if(v == -1)
      {
        continue;
      }
      arr[v].add(i);
    }
    
    int ans = 0;
    for(int i = 1; i<=n; i++)
    {
      int [] dist = new int[n+1];
      boolean [] visited = new boolean[n+1];
      dfs(i, visited, dist);
      ans = Math.max(ans, max+1);
      max = 0;
    }
    
    System.out.println(ans);
  }
}