// Unfinished, problem with pair sorting
import java.util.*;
import java.io.*;
public class TreeDiameter3
{
  static int nmax = (int)1e5 + 10;
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static Pair [][] farthest = new Pair[nmax][3];
  
  static void dfs1(int u, int par)
  {
    for(int i = 0; i<3; i++)
    {
      farthest[u][i] = new Pair(0, u);
    }
    
    for(Integer v: arr[u])
    {
      if(v == par)
      {
        continue;
      }
      
      dfs1(v, u);
      farthest[u][0] = new Pair(farthest[v][2].first+1, farthest[v][2].second);
      Arrays.sort(farthest[u]);
    }
  }
  
  static void dfs2(int u, int par)
  {
    if(par != -1)
    {
      if(farthest[u][2].second == farthest[par][2].second)
      {
        farthest[u][0] = new Pair(farthest[par][1].first+1, farthest[par][1].second); // second farthest
      }
      else
      {
        farthest[u][0] = new Pair(farthest[par][2].first+1, farthest[par][2].second); // farthest
      }
      Arrays.sort(farthest[u]);
    }
    
    for(Integer v: arr[u])
    {
      if(v == par)
      {
        continue;
      }
      
      dfs2(v, u);
    }
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
    
    dfs1(1, -1);
    dfs2(1, -1);
    
    for(int i = 1; i<=n; i++)
    {
      System.out.println(i+" "+" -> "+farthest[i][2].second+" "+farthest[i][2].first);
    }
  }
}

class Pair
{
  int first;
  int second;
  
  public Pair(int f, int s)
  {
    first = f;
    second = s;
  }
}