// Overall: O( (n+q) log n)
import java.util.*;
import java.io.*;
public class LazySumAdd
{
  static int nmax = (int)1e5 + 10;
  static long [] tree = new int[4*nmax];
  static long [] lazy = new int[4*nmax];
  static long [] arr = new int[nmax];
  
  // O(n)
  static void build(int id, int l, int r)
  {
    lazy[id] = 0;
    if(l == r)
    {
      tree[id] = arr[l];
      return;
    }
    
    int mid = (l+r)/2;
    
    build(2*id, l, mid);
    build(2*id+1, mid+1, r);
    
    tree[id] = (tree[2*id] + tree[2*id+1]);       /// merge
    return;
  }
  
  static void propagate(int id, int l, int r)
  {
    tree[id] += (r - l + 1) * lazy[id];
    
    if(l != r)
    {
      lazy[2*id] += lazy[id];
      lazy[2*id+1] += lazy[id];
    }
    
    lazy[id] = 0;
  }
  
  // O(log n)
  static long query(int id, int l, int r, int a, int b)
  {
    propagate(id, l, r);
    
    if(b < l || r < a)  /// disjoint case
      return 0;
    if(a <= l && r <= b)
      return tree[id];
    
    int mid = (l+r)/2;
    
    long p = query(2*id, l, mid, a, b);
    long q = query(2*id+1, mid+1, r, a, b);
    return (p + q);
  }
  
  static void update(int id, int l, int r, int a, int b, long k)
  {
    propagate(id, l, r);
    
    if(b < l || r < a)  /// disjoint case
      return ;
    if(a <= l && r <= b)
    {
      lazy[id] += k;
      propagate(id, l, r);
      return;
    }
    
    int mid = (l+r)/2;
    
    update(2*id, l, mid, a, b, k);
    update(2*id+1, mid+1, r, a, b, k);
    
    tree[id] = tree[2*id] + tree[2*id+1];
    return;
  }
  
/// range query : sum ?
/// range update : add x to range
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int cases = read.nextInt();
    for(int tc = 1; tc<=cases; tc++)
    {
      int n = read.nextInt();
      int q = read.nextInt();
      
      build(1, 1, n);
      
      for(int i = 1; i<=q; i++)
      {
        int type = read.nextInt();
        
        if(type == 1)
        {
          int l = read.nextInt();
          int r = read.nextInt();
          
          System.out.println(query(1, 1, n, l, r));
        }
        else
        {
          int l = read.nextInt();
          int r = read.nextInt();
          int k = read.nextInt();
          
          update(1, 1, n, l, r, k);
        }
      }
    }
  }
}