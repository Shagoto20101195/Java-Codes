import java.util.*;
import java.io.*;
public class SCC
{
  static int nmax = (int)1e5 + 10;
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static ArrayList<Integer> [] rev = new ArrayList[nmax];
  static ArrayList<Integer> nodes = new ArrayList<>();
  static boolean [] visited = new boolean[nmax];
  static int [] who = new int[nmax];
  
  static void dfs1(int u)
  {
    visited[u] = true;
    
    for(Integer i: arr[u])
    {
      if(visited[i])
      {
        continue;
      }
      
      dfs1(i);
    }
    
    nodes.add(u);
  }
  
  static void dfs2(int u, ArrayList<Integer> C, int id)
  {
    visited[u] = true;
    
    C.add(u);
    who[u] = id;
    
    for(Integer i: arr[u])
    {
      if(visited[i])
      {
        continue;
      }
      
      dfs2(i, C, id);
    }
  }
  
  public static void main(String [] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int m = read.nextInt();
    
    for(int i = 0; i<=n; i++)
    {
      arr[i] = new ArrayList<>();
      rev[i] = new ArrayList<>();
    }
    
    for(int i = 0; i<m; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr[u].add(v);
      rev[v].add(u);
    }
    
    for(int i = 1; i<=n; i++)
    {
      if(!visited[i])
      {
        dfs1(i);
      }
    }
    
    for(int i = 1; i<=n; i++)
    {
      visited[i] = false;
    }
    
    ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
    int id = 0;
    
    for(int i = nodes.size()-1; i>=0; i--)
    {
      int u = nodes.get(i);
      
      if(!visited[u])
      {
        comps.add(new ArrayList<>());
        dfs2(u, comps.get(comps.size()-1), ++id);
      }
    }
    
    for(int i = 0; i<comps.size(); i++)
    {
      for(int j = 0; j<comps.get(i).size(); j++)
      {
        System.out.print(comps.get(i).get(j)+" ");
      }
      System.out.println();
    }
    
    for(int i = 1; i<=n; i++)
    {
      System.out.println(i+" = "+who[i]);
    }
  }
}