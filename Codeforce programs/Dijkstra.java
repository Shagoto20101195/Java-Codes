// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class Dijkstra
{
  static int nmax = 100000+10;
  static long [] dist = new long[nmax];
  static int [] link = new int[nmax];
  static void dijkstra(int source, ArrayList<Edge> [] arr)
  {
    PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
    dist[source] = 0;
    pq.add(new Edge(source, 0));
    
    while(pq.size() > 0)
    {
      int u = pq.peek().node;
      long d = pq.peek().cost;
      pq.poll();
      
      if(dist[u] != d)
      {
        continue;
      }
      
      for(Edge i: arr[u])
      {
        if(d + i.cost < dist[i.node])
        {
          link[i.node] = u;
          dist[i.node] = d + i.cost;
          pq.add(new Edge(i.node, (long)dist[i.node]));
        }
      }
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(isr);
    
    ArrayList<Edge> [] arr = new ArrayList[nmax];
    String [] s = read.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int e = Integer.parseInt(s[1]);
    
    for(int i = 0; i<n+1; i++)
    {
      arr[i] = new ArrayList<Edge>();
      dist[i] = (long)1e18;
    }
    
    for(int i = 0; i<e; i++)
    {
      String [] temp = read.readLine().split(" ");
      int u = Integer.parseInt(temp[0]);
      int v = Integer.parseInt(temp[1]);
      long c = Long.parseLong(temp[2]);
      
      arr[u].add(new Edge(v, c));
      arr[v].add(new Edge(u, c));
    }
    
    dijkstra(1, arr);
    
    if(dist[n] == (long)1e18)
    {
      System.out.println(-1);
    }
    else
    {
      Stack<Integer> path = new Stack<Integer>();
      while(link[n] != 0)
      {
        path.push(n);
        n = link[n];
      }
      path.push(1);
      while(!path.empty())
      {
        System.out.print(path.pop());
        System.out.print(" ");
      }
    }
  }
}

class Edge implements Comparable<Edge>
{
  int node;
  long cost;
  
  public Edge(int x, long y)
  {
    node = x;
    cost = y;
  }
  
  public int compareTo(Edge n1)
  {
    return (int)(cost - n1.cost);
  }
}