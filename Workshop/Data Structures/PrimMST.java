// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class PrimMST
{
  // Minimum Spanning Tree using Prim's Algorithm
  // Similar like dijkstra
  // May not work with disconnected components
  static int nmax = 10000+5;
  static int [] dist = new int[nmax]; // Will hold the cost of edge for spanning tree
  static boolean [] completed = new boolean[nmax]; // mark node which are done
  static void prim(int source, int n, ArrayList<Edge> [] arr)
  {
    PriorityQueue<Edge> pq = new PriorityQueue<Edge>(new Edge());
    
    dist[source] = 0;
    pq.add(new Edge(source, 0));
    
    while(pq.size() > 0)
    {
      int u = pq.peek().node;
      int d = pq.peek().cost;
      pq.poll();
      
      // If previously marked then continue and no need to proceed
      if(completed[u])
      {
        continue;
      }
      completed[u] = true;
      
      for(Edge i: arr[u])
      {
        // If the cost to the adjacent node is less than infinity and not visited previously
        // Then relax the cost and add new pair to Priority Queue
        if(i.cost < dist[i.node] && !completed[i.node])
        {
          dist[i.node] = i.cost;
          pq.add(new Edge(i.node, dist[i.node]));
        }
      }
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    // Creating graph and adding edges and cost with Edge class
    // Different Edge class compared to Kruskal but same with dijkstra
    int n = read.nextInt();
    int e = read.nextInt();
    
    ArrayList<Edge> [] arr = new ArrayList[n+1];
    for(int i = 0; i<n+1; i++)
    {
      arr[i] = new ArrayList<Edge>();
      dist[i] = (int)1e9;
    }
    
    for(int i = 0; i<e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      int c = read.nextInt();
      
      arr[u].add(new Edge(v, c));
      arr[v].add(new Edge(u, c));
    }
    
    // Start prim algo from a source
    prim(1, n, arr);
    long mst = 0;
    for(int i = 1; i<=n; i++)
    {
      System.out.println(dist[i]); // The minimum edge cost chosen
      mst += dist[i];
    }
    
    System.out.println(mst); // Spanning tree cost
  }
}

class Edge implements Comparator<Edge>
{
  int node;
  int cost;
  
  public Edge()
  {
  }
  
  public Edge(int x, int y)
  {
    node = x;
    cost = y;
  }
  
  public int compare(Edge n1, Edge n2)
  {
    return n1.cost - n2.cost;
  }
}