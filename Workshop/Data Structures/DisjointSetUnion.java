// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class DisjointSetUnion
{
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
    
    // Number of nodes;
    int n = read.nextInt();
    
    // Initially making master of each node as itself and size of 1
    for(int i = 1; i<=n; i++)
    {
      makeset(i);
    }
    
    int e = read.nextInt();
    for(int i = 1; i<=e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      boolean res = unite(u, v);
      if(res)
      {
        System.out.println("Edge was between two different components");
      }
      else
      {
        System.out.println("Edge was between same component");
      }
    }
  }
}