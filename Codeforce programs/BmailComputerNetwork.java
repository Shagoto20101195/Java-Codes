// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class BmailComputerNetwork
{
  static boolean [] visited = new boolean[200000+1];
  static int [] parent = new int[200000+1];
  static void dfs(int u, ArrayList<Integer> [] arr)
  {
    visited[u] = true;
    
    for(Integer i: arr[u])
    {
      if(!visited[i])
      {
        parent[i] = u;
        dfs(i, arr);
      }
    }
  }
  
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    ArrayList<Integer> [] arr = new ArrayList[n+1];
    ArrayList<Integer> path = new ArrayList<Integer>();
    
    for(int i = 0; i<n+1; i++)
    {
      arr[i] = new ArrayList<Integer>();
    }
    
    for(int i = 0; i<n-1; i++)
    {
      int u = read.nextInt();
      
      arr[i+2].add(u);
      arr[u].add(i+2);
    }
    
    for(int i = 1; i<=n; i++)
    {
      if(!visited[i])
      {
        dfs(i, arr);
      }
    }
    
    int cur = n;
    path.add(1);
    path.add(n);
    while(parent[cur] != 1)
    {
      path.add(parent[cur]);
      cur = parent[cur];
    }
    
    Collections.sort(path);
    for(int i = 0; i<path.size(); i++)
    {
      System.out.print(path.get(i)+" ");
    }
  }
}