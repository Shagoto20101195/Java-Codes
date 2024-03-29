import java.util.*;
import java.io.*;
public class SubtreeQuery
{
  static int nmax = (int)2e5 + 10;
  static int clk = 0;
  static ArrayList<Integer> [] arr = new ArrayList[nmax];
  static int [] val = new int[nmax];
  static int [] dfsarr = new int[nmax];
  static int [] st = new int[nmax];
  static int [] en = new int[nmax];
  
  static void dfs(int u, int par)
  {
    clk++; 
    st[u] = clk;
    dfsarr[clk] = u;
    
    for(Integer i: arr[u])
    {
      if(i == par)
      {
        continue;
      }
      
      dfs(i, u);
    }
    
    en[u] = clk;
  }
  
  
  // -------------- Segment Tree --------------
  
  static long [] tree = new long[nmax*4];
  static void build(int id, int l, int r)
  {
    if(l == r)
    {
      tree[id] = val[dfsarr[l]];
      return;
    }
    
    int mid = (l+r) / 2;
    
    build(2*id, l, mid);
    build(2*id+1, mid+1, r);
    
    tree[id] = (tree[2*id] + tree[2*id+1]);  // merge
    return;
  }
  
  // O(log n)
  static void update(int id, int l, int r, int k, int u){
    if(l == r){
      tree[id] = u;
      return;
    }
    
    int mid = (l+r)/2;
    
    if(k <= mid)
      update(2*id, l, mid, k, u);
    else
      update(2*id+1, mid+1, r, k, u);
    
    tree[id] = (tree[2*id] + tree[2*id+1]);       /// merge
    return;
  }
  
/// O(log n)
  static long  query(int id, int l, int r, int a, int b){
    if(b < l || r < a)  /// disjoint case
      return 0;
    if(a <= l && r <= b)
      return tree[id];
    
    int mid = (l+r) / 2;
    
    long p = query(2*id, l, mid, a, b);
    long q = query(2*id+1, mid+1, r, a, b);
    return (p + q);
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int q = read.nextInt();
    
    for(int i = 0; i<=n; i++)
    {
      arr[i] = new ArrayList<Integer>();
    }
    
    for(int i = 1; i<=n; i++)
    {
      val[i] = read.nextInt();
    }
    
    for(int i = 0; i<n-1; i++)
    {
      int u = read.nextInt();
      int v = read.nextInt();
      
      arr[u].add(v);
      arr[v].add(u);
    }
    
    dfs(1, -1);
    build(1, 1, n);
    
    for(int i = 0; i<q; i++)
    {
      int t = read.nextInt();
      
      if(t == 1)
      {
        int s = read.nextInt();
        int x = read.nextInt();
        update(1, 1, n, st[s], x);
      }
      else
      {
        int s = read.nextInt();
        
        long ans = query(1, 1, n, st[s], en[s]);
        System.out.println(ans);
      }
    }
  }
}