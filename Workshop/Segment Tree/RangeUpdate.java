import java.util.*;
import java.io.*;
public class RangeUpdate
{
  static int nmax = (int)2e5 + 10;
  static long [] tree = new long[4*nmax];
  static long [] arr = new long[nmax];
  static long [] diff = new long[nmax];
  
  // O(n)
  static void build(int id, int l, int r)
  {
    if(l == r)
    {
      tree[id] = diff[l]; 
      return;
    }
    
    int mid = (l+r) / 2;
    
    build(2*id, l, mid);
    build(2*id+1, mid+1, r);
    
    tree[id] = tree[2*id] + tree[2*id+1]; // merge
    return;
  }
  
  // O(log n)
  static void update(int id, int l, int r, int k, long u)
  {
    if(l == r)
    {
      tree[id] += u;
      return;
    }
    
    int mid = (l+r) / 2;
    
    if(k <= mid)
    {
      update(2*id, l, mid, k, u);
    }
    else
    {
      update(2*id+1, mid+1, r, k, u);
    }
    
    tree[id] = (tree[2*id] + tree[2*id+1]); // merge
    return;
  }
  
  // O(log n)
  static long query(int id, int l, int r, int a, int b)
  {
    if(b < l || r < a)  // disjoint case
        return 0;
    if(a <= l && r <= b)
        return tree[id];

    int mid = (l+r) / 2;

    long p = query(2*id, l, mid, a, b);
    long q = query(2*id+1, mid+1, r, a, b);
    return (p+q);
}
  
  
  public static void main(String [] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int q = read.nextInt();
    
    for(int i = 1; i<=n; i++)
    {
      arr[i] = read.nextInt();
    }
    
    for(int i = 1; i<=n; i++)
    {
      diff[i] = arr[i] - arr[i-1];
    }
    
    build(1, 1, n);
    for(int i = 0; i<q; i++)
    {
      int type = read.nextInt();
      
      if(type == 1)
      {
        int a = read.nextInt();
        int b = read.nextInt();
        int u = read.nextInt();
        
        update(1, 1, n, a, +u);
        
        if(b + 1 <= n)
        {
          update(1, 1, n, b+1, -u);
        }
      }
      else
      {
        int k = read.nextInt();
        long ans = query(1, 1, n, 1, k);
        System.out.println(ans);
      }
    }
  }
}

// Overall: O((n + q) log n)