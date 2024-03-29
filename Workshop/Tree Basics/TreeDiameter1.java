import java.util.*;
import java.io.*;
public class TreeDiameter1
{
  static int nmax = (int)1e5 + 10;
  static int [] depth = new int[nmax];
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  
  static int bfs(int u, int n)
  {
    Queue<Integer> q = new LinkedList<Integer>();
    for(int i = 1; i<=n; i++)
    {
      depth[i] = -1;
    }
    
    q.add(u);
    depth[u] = 0;
    
    while(!q.isEmpty())
    {
      u = q.poll();
      
      for(Integer i: arr[u])
      {
        if(depth[i] == -1)
        {
          depth[i] = depth[u] + 1;
          q.add(i);
        }
      }
    }
    
    return u;
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
    
    int f = bfs(1, n);
    int e = bfs(f, n);
    
    System.out.println(depth[e]);
    System.out.println(f+" "+e);
  }
}