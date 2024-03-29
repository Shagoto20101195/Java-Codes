// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class SimpleDFS
{
  static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
  static int nmax = 10000+10;
  static boolean [] visited = new boolean[nmax];
  static void dfs(int u)
  {
    System.out.println("Dfs at "+u);
    visited[u] = true;
    
    for(Integer i: arr.get(u))
    {
      System.out.println("Looking at "+i+" from "+u);
      if(!visited[i])
      {
        System.out.println("Going to "+i+" from "+u);
        dfs(i);
      }
      else
      {
        System.out.println("Already visited "+i);
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
        System.out.println("Calling dfs at "+i);
        dfs(i);
      }
    }
  }
}