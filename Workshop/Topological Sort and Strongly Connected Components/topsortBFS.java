// Source: https://cses.fi/problemset/task/1679

import java.util.*;
import java.io.*;
public class topsortBFS
{
  static int nmax = (int)1e5 + 10;
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static ArrayList<Integer> topsort = new ArrayList<>();
  static int [] indegree = new int[nmax];
  
  static void bfs(int n)
  {
    Queue<Integer> q = new LinkedList<>();
    
    for(int i = 1; i<=n; i++)
    {
      if(indegree[i] == 0)
      {
        q.add(i);
      }
    }
    
    while(!q.isEmpty())
    {
      int u = q.poll();
      topsort.add(u);
      
      for(Integer v: arr[u])
      {
        indegree[v]--;
        if(indegree[v] == 0)
        {
          q.add(v);
        }
      }
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
    }
    
    for(int i = 0; i<m; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      arr[u].add(v);
      indegree[v]++;
    }
    
    bfs(n);
    
    if(topsort.size() != n)
    {
      System.out.print("IMPOSSIBLE");
    }
    else
    {
      for(Integer x: topsort)
      {
        System.out.print(x+" ");
      }
    }
    System.out.println();
  }
}