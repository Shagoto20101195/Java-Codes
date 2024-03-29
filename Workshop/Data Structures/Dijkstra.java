// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class Dijkstra
{
  static int nmax = 10000+10;
  static int [] dist = new int[nmax]; // Min cost to this node (dist[i]) from source node
  static int [] link = new int[nmax]; // To mark the node by which min cost is achieved 
  static void dijkstra(int source, ArrayList<Edge> [] arr)
  {
    // PriorityQueue for keeping low cost pairs prioritized (at peek)
    // (new Edge()) for telling it to implement(sort) by Edge class 
    PriorityQueue<Edge> pq = new PriorityQueue<Edge>(new Edge());
    dist[source] = 0; // Initializing source distance as 0
    pq.add(new Edge(source, 0)); // Adding source to Queue
    
    while(pq.size() > 0)
    {
      int u = pq.peek().node;
      int d = pq.peek().cost;
      pq.poll();
      
      // If not true copy then continue
      // E.g. (u, 10), (u, 5), (u, 2)
      // To make sure same pair not used again
      if(dist[u] != d)
      {
        continue;
      }
      
      for(Edge i: arr[u])
      {
        // If cost is less, then 'relax' by lowering it
        if(d + i.cost < dist[i.node])
        {
          link[i.node] = u; // Marking the parent node with lower cost 
          dist[i.node] = d + i.cost; // Updating total cost from source to this node
          pq.add(new Edge(i.node, dist[i.node])); // Adding updated pair (pair cant be removed)
        }
      }
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    // arr[i].get(nodenumber - 1).node for getting adjacent node
    // arr[i].get(nodenumber - 1).cost for going to that node by adjacent edge
    ArrayList<Edge> [] arr = new ArrayList[nmax];
    int n = read.nextInt();
    int e = read.nextInt();
    
    for(int i = 0; i<n+1; i++)
    {
      arr[i] = new ArrayList<Edge>(); // Assigning node-cost pair to every source node
      dist[i] = (int)1e9; // Setting every distance to infinity
    }
    
    for(int i = 0; i<e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      int c = read.nextInt();
      
      arr[u].add(new Edge(v, c));
      arr[v].add(new Edge(u, c));
    }
    
    dijkstra(1, arr); // Calling from node 1 (can be done from other nodes too)
    for(int i = 1; i<=n; i++)
    {
      System.out.println("Distance from 1 to "+i+" is "+dist[i]);
    }
  }
}

/*
* Making a custom Edge class (adjacent node and cost)
* For easy comparing and handling of the node-cost pair
*/
class Edge implements Comparator<Edge>
{
  int node;
  int cost;
  
  // Empty constructor idk why
  public Edge()
  {
  }
  
  // Making a node-cost pair from Edge Class
  public Edge(int x, int y)
  {
    node = x;
    cost = y;
  }
  
  // Comparing cost for ascending sort of node-cost pairs
  // By default ascending sort
  // If +ve then n2 chosen
  // 0 or -ve then n1 chosen
  // The cost can be long, so use: return (int)(n1.cost - n2.cost);
  public int compare(Edge n1, Edge n2)
  {
    return n1.cost - n2.cost;
  }
}