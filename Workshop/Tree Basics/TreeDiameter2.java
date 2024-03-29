import java.util.*;
import java.io.*;
public class TreeDiameter2
{
  static int nmax = (int)1e5 + 10;
  static int [] height = new int[nmax];
  static int [] maxlen = new int[nmax];
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  
  static void dfs(int u, int parent)
  {
    height[u] = 0;
    int [] h = {0, 0, 0};
    
    for(Integer i: arr[u]){
      if(i == parent)
      {
        continue;
      }
      
      dfs(i, u);
      height[u] = Math.max(height[u], height[i]+1);
      h[0] = height[i]+1;
      Arrays.sort(h);
    }
    
    maxlen[u] = Math.max(h[1] + h[2], height[u]);
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
    
    dfs(1, -1);
    
    int ans = 0;
    for(int i = 1; i<=n; i++)
    {
      ans = Math.max(ans, maxlen[i]);
    }
    
    System.out.println(ans);
  }
}