// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class SimpleBFS
{
  static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
  static int nmax = 10000+10;
  static boolean [] visited = new boolean[nmax];
  static int [] parent = new int[nmax];
  static void bfs(int u)
  {
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(u);
    visited[u] = true;
    System.out.println("Visited "+u);
    while(q.size() > 0)
    {
      u = q.poll();
      for(Integer i: arr.get(u))
      {
        if(!visited[i])
        {
          System.out.println("Marking "+i+" from "+u);
          q.add(i);
          visited[i] = true;
          parent[i] = u;
        }
      }
    }
  }
  
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int e = read.nextInt();
    
    for(int i = 0; i<n+1; i++)
    {
      arr.add(new ArrayList<Integer>());
    }
    
    for(int i = 0; i<e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr.get(u).add(v);
      arr.get(v).add(u);
    }
    
    for(int i = 1; i<=n; i++)
    {
      if(!visited[i])
      {
        System.out.println("Calling bfs at "+i);
        bfs(i);
      }
      else
      {
        System.out.println("Visited "+i+" from "+parent[i]);
      }
    }
  }
}