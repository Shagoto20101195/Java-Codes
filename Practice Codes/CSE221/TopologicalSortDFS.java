import java.util.*;
import java.io.*;
public class TopologicalSortDFS
{
  static int nmax = (int)1e5 + 5;
  static boolean [] visited = new boolean[nmax];
  static int time = 0;
  static int [] tt = new int[nmax];
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static ArrayList<Integer> topsort = new ArrayList<>();
  
  static void dfs(int u)
  {
    for(Integer i: arr[u])
    {
      if(!visited[i])
      {
        time++;
        dfs(i);
      }
    }
    
    visited[u] = true;
    tt[u] = ++time;
    topsort.add(u);
  }
  
  public static void main(String [] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int e = read.nextInt();
    
    for(int i = 1; i<=n; i++)
    {
      arr[i] = new ArrayList<>();
    }
    
    for(int i = 0; i<e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr[u].add(v);
    }

    for(int i = 1; i<=n; i++)
    {
      if(!visited[i])
      {
        dfs(i);
      }
    }
    
    for(int i = topsort.size()-1; i>=0; i--)
    {
      System.out.println("Node: "+topsort.get(i)+" Ending time:"+tt[topsort.get(i)]);
    }
  }
}

/*

5
7
1 2
2 3
2 4
4 3
1 4
1 5
5 4

7
10
1 4
1 5
1 7
6 7
3 4
3 5
5 6
2 3
2 5
2 6
*/