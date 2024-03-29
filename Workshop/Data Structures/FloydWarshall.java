// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class FloydWarshall
{
  static int nmax = 500; // v^3 complexity, so less than 1000 nodes needed
  static int [][] dist = new int[nmax][nmax];
  static void floydwarshall(int n)
  {
    for(int k = 1; k<=n; k++)
    {
      for(int i = 1; i<=n; i++)
      {
        for(int j = 1; j<=n; j++)
        {
          dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
        }
      }
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int e = read.nextInt();
    
    // Initializing distances from one to another as infinity
    // If same nodes then assign 0
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=n; j++)
      {
        if(i == j)
        {
          dist[i][j] = 0;
        }
        else
        {
          dist[i][j] = (int)1e9;
        }
      }
    }
    
    // Taking edge and cost input and assigning them
    for(int i = 0; i<e; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      int c = read.nextInt();
      
      // For handling parallel edges which may have different costs, example:
      // 1 3 10
      // 1 3 5
      // We need min cost (by comparing with previous cost)
      dist[u][v] = Math.min(c, dist[u][v]);
      dist[v][u] = Math.min(c, dist[v][u]);
    }
    
    // Calling floydwarshall
    floydwarshall(n);
    
    // Printing min cost from one node to another
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=n; j++)
      {
        System.out.println("Cost from "+i+" to "+j+" is "+dist[i][j]);
      }
    }
  }
}