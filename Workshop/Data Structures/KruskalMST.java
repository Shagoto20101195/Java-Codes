// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class KruskalMST
{
  // Minimum Spanning Tree Using Kruskal Algorithm
  static int nmax = 10000+5;
  static int [] master = new int[nmax]; // To store master
  static int [] size = new int[nmax]; // To store size of the component
  
  static void makeset(int u)
  {
    master[u] = u;
    size[u] = 1;
  }
  
  // To find master
  static int find(int u)
  {
    if(master[u] == u) // It means highest point (root) has been reached
    {
      return u;
    }
    
    // This is path compression
    return master[u] = find(master[u]); // Assigning the root to this node;
  }
  
  // To add edges and check if same component or not
  static boolean unite(int u, int v)
  {
    // Finding their masters
    u = find(u);
    v = find(v);
    
    if(u == v) // It means both have same master and for which they are in same component
    {
      return false;
    }
    
    // Making the bigger component master of the smaller one
    // Updating the bigger component's size after adding the smaller one
    if(size[u] < size[v])
    {
      master[u] = v;
      size[v] += size[u];
    }
    else
    {
      master[v] = u;
      size[u] += size[v];
    }
    
    // Returning true if the edge being added is of different components
    return true;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int e = read.nextInt();
    
    for(int i = 0; i<n+1; i++)
    {
      makeset(i);
    }
    
    // Making list for edges with from, to, cost
    ArrayList<Edge> edge = new ArrayList<Edge>();
    
    for(int i = 0; i<e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      int c = read.nextInt();
      
      edge.add(new Edge(u, v, c));
    }
    
    // Using Collections.sort in between to sort the weight in ascending order
    // Needs both compare method in both main class and Edge class to work
    Collections.sort(edge, new Comparator<Edge>(){  
      public int compare(Edge a, Edge b)
      {
        return a.cost - b.cost;
      }
    });
    
    // The cost of Spanning Tree
    int mst_cost = 0;
    // Iterating through edges
    for(Edge i: edge)
    {
      int u = i.node1;
      int v = i.node2;
      
      // If both have same parent it means a cycle will be formed
      // Or that there already exists a path to go from u to v
      // So this edge is not taken
      if(find(u) == find(v))
      {
        continue;
      }
      
      // Else the nodes are connected
      // Note: unite returns boolean, but it doesn't matter
      // The cost being added
      unite(u, v);
      mst_cost += i.cost;
      System.out.println("Taking "+u+" to "+v+" with cost "+i.cost);
    }
    
    System.out.println(mst_cost);
  }
}

class Edge implements Comparator<Edge>
{
  int node1;
  int node2;
  int cost;
  
  public Edge(int x, int y, int z)
  {
    node1 = x;
    node2 = y;
    cost = z;
  }
  
  public int compare(Edge n1, Edge n2)
  {
    return n1.cost - n2.cost;
  }
}