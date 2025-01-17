//Written by Shagoto

//import java.lang.*;
//import javafx.util.*;
import java.util.*;
import java.io.*;
public class TemplateAndFormula
{
// -------- Generating Prime Numbers Using Bit-wise sieve --------
//  static ArrayList<Integer> primes = new ArrayList<Integer>();
//  static int [] mark = new int[50000000+5];
//  static BitSet bs = new BitSet(1000001);
//  static void sieve()
//  {
//    primes.add(2);
//    bs.set(1,true);
//    for(int i = 4; i<=1000000; i+=2)
//    {
//      bs.set(i,true);
//    }
//    
//    for(int i = 3; i<=1000000; i+=2)
//    {
//      if(!bs.get(i))
//      {
//        primes.add(i);
//        for(int j = 3; i*j<=1000000; j+=2)
//        {
//          bs.set(i*j,true);
//        }
//      }
//    }
//  }
  
// -------- Optimised Sieve to find k-th prime number --------
//  static boolean [] mark = new boolean[90000001];
//  static int [] primes = new int[90000001];
//  static int primeCount = 1;
//  static void optSieve(int n)
//  {
//   /* mark[0] = true;
//    mark[1] = true;
//    for(int i = 4; i<=n; i+=2)
//    {
//      mark[i] = true;
//    }*/
//    
//    primes[1] = 2;
//    primeCount++;
//    for(int i = 3; i<=n; i+=2)
//    {
//      if(!mark[i])
//      {
//        primes[primeCount] = i;
//        primeCount++;
//        for(int j = 3*i; j<=n; j+=2*i)
//        {
//          mark[j] = true;
//        }
//      }
//    }
//  }
  
// -------- Optimized Factorization --------
//  static boolean [] mark = new boolean[9000001];
//  static int [] primes = new int[9000001];
//  static int count = 0;
//  static void optsieve()
//  {
//    int n = 9000001;
//    for(int i = 3; i<=n; i+=2)
//    {
//      if(!mark[i])
//      {
//        for(int j = 3*i; j<=n; j+=2*i)
//        {
//          mark[j] = true;
//        }
//      }
//    }
//    
//    for(int i = 2; i<9000001; i++)
//    {
//      if(mark[i])
//      {
//        continue;
//      }
//      primes[count] = i;
//      count++;
//    }
//  }
//  
//  static ArrayList<Integer> factorize(int n)
//  {
//    ArrayList<Integer> primef = new ArrayList<Integer>();
//    for(int i = 0; primes[i]*primes[i] <=n; i++)
//    {
//      if(i % primes[i] == 0)
//      {
//        while((i % primes[i] == 0))
//        {
//          n /= primes[i];
//          primef.add(primes[i]);
//        }
//      }
//    }
//    
//    if(n > 1)
//    {
//      primef.add(n);
//    }
//    return primef;
//  }
  
// -------- Sigma and Tau Function --------
//  static int [] tau = new int[90000001];
//  static int [] sigma = new int[90000001];
//  static void getTauSigma()
//  {
//    for(int i = 1; i<900001; i++)
//    {
//      for(int j = i; j<900001; j+=i)
//      {
//        tau[j]++;
//        sigma[j] += i;
//      }
//    }
//  }
  
// -------- Permutation with repetition Using Recursion (call rec(0, n) in main)--------  
//  static int [] arr = new int[100];
//  static void rec(int pos, int n)
//  {
//    if(pos == n)
//    {
//      for(int i = 0; i<n; i++)
//      {
//        System.out.print(arr[i]+" ");
//      }
//      System.out.println();
//      return;
//    }
//    
//    for(int i = 1; i<=n; i++)
//    {
//      arr[pos] = i;
//      rec(pos + 1, n);
//    }
//    arr[pos] = 0;
//  }
  
// -------- Lowerbound --------
//  static int lowerBound(long [] arr, long x)
//  {
//    int low = 0;
//    int high = arr.length - 1;
//    int mid = 0;
//    while(low < high)
//    {
//      mid = (start + end) / 2;
//      int mid = (low + high) / 2;
//      
//      if(arr[mid] == x)
//      {
//        return mid;
//      }
//      else if(arr[mid] > x)
//      {
//        high = mid - 1;
//      }
//      else
//      {
//        low = mid + 1;
//      }
//    }
//    
//    if(arr[mid] > x)
//    {
//      if(mid - 1 >= 0 && arr[mid - 1] < x)
//      {
//        return mid - 1;
//      }
//      return -1;
//    }
//    return mid;
//  }
  
// -------- Upperbound --------
//  static int upperBound(long [] arr, long x)
//  {
//    int low = 0;
//    int high = arr.length;
//    int mid = 0;
//    
//    while(low < end)
//    {
//      mid = (low + high) / 2;
//      
//      if(arr[mid] == x)
//      {
//        return x;
//      }
//      else if(arr[mid] < x)
//      {
//        low = mid + 1;
//      }
//      else
//      {
//        high = mid - 1;
//      }
//    }
//    
//    if(arr[mid] < x)
//    {
//      return mid + 1;
//    }
//    
//    return mid;
//  }
  
// -------- Binary to Decimal --------
//  static int decimal(String s)
//  {
//    int ret = 0;
//    for(int i = 0, j = s.length()-1; j>=0; i++, j--)
//    {
//      if(s.charAt(j) == '1')
//      {
//        ret |= (1<<i);
//      }
//    }
//    return ret;
//  }
  
// -------- Decimal to Binary --------
//  static String binary(int x)
//  {
//    String ret = "";
//    for(int i = 31; i>=0; i--)
//    {
//      int mask = (1<<i);
//      if((x & mask) != 0)
//      {
//        ret += "1";
//      }
//      else
//      {
//        ret += "0";
//      }
//    }
//    return ret;
//  }
  
// -------- Prefix Sum --------
// If zero indexed, add 1  
// pref.add(0)  
// pref.get(r) - pref.get(l - 1)
// xor(l, r) = pref[r]^pref[l - 1]
  
// -------- Safe Mod --------
//  static int safeMod(int n, int d)
//  {
//    int ans = n % d;
//    if(ans < 0)
//    {
//      ans += n;
//    }
//    return ans;
//  }
  
// -------- Mod Expo (returns a^n % m)--------
//  static long modex(long a, long n, long m)
//  {
//    if(n == 0)
//    {
//      return 1;
//    }
//    
//    if(n == 1)
//    {
//      return a % m;
//    }
//    
//    long y = modex(a, n / 2, m);
//    y = y * y % m;
//    
//    if(n % 2 == 1)
//    {
//      y = y * a % m;
//    }
//    
//    return y;
//  }
  
// -------- Ceil --------
//  static int ceil(int n, int x)
//  {
//    if(n / x * x != n)
//    {
//      return n / x + 1;
//    }
//    return n / x;
//  }
  
// -------- Phi Function --------
//  static int phi(int n) 
//  { 
//    int ret = n;  
//    for(int i = 2; i*i <= n; i++) 
//    { 
//      if(n % i == 0)  
//      { 
//        while(n % i == 0) 
//        {
//          n /= i; 
//        }
//        ret -= ret / i; 
//      } 
//    } 
//    
//    if(n > 1) 
//    {
//      ret -= ret / n; 
//    }
//    return ret; 
//  }
  
// -------- Sieve Phi --------
//  static int [] phi = new int[100005];
//  static boolean [] mark = new boolean[100005];
//  static void sievePhi()
//  {
//    for(int i = 1; i<=100000; i++)
//    {
//      phi[i] = i;
//    }
//    
//    for(int i = 2; i<=100000; i++)
//    {
//      if(mark[i])
//      {
//        continue;
//      }
//      
//      phi[i]--;
//      for(int j = i+i; j<=100000; j+=i)
//      {
//        mark[j] = true;
//        phi[j] = phi[j] - phi[j]/i;
//      }
//    }
//  }
  
// -------- Digits of Factorial --------  
//  static long factorialDigit(long n)
//  {
//    if(n == 1 || n == 0)
//    {
//      return 1;
//    }
//    
//    long ans = (long)(((n + 0.5)*Math.log(n) - n + 0.5*Math.log(2*Math.PI)) / Math.log(10)) + 1;
//    return ans;
//  }
  
// -------- EGCD --------
//  static int gcd(int a, int b, int x, int y)
//  {
//    if (b == 0) {
//      x = 1;
//      y = 0;
//      return a;
//    }
//    int x1 = 0, y1 = 0;
//    int d = gcd(b, a % b, x1, y1);
//    x = y1;
//    y = x1 - y1 * (a / b);
//    return d;
//  }
  
// -------- GCD of Two Numbers --------  
//  static int gcd(int a, int b)
//  {
//    if(b == 0)
//    {
//      return a;
//    }
//    return gcd(b, a % b);  
//  }
  
// -------- LCM of two Numbers --------
//  static int lcm(int a, int b)
//  {
//    return (a * b) / gcd(a, b);
//  }
  
//  -------- Binary Search --------
//  static int binarySearch(int [] arr, int x)
//  {
//    int low = 0;
//    int high = arr.length - 1;
//    
//    while(low <= high)
//    {
//      int mid = (low + high) / 2;
//      
//      if(arr[mid] == x)
//      {
//        return mid;
//      }
//      else if(arr[mid] > x)
//      {
//        high = mid - 1;
//      }
//      else
//      {
//        low = mid + 1;
//      }
//    }
//    return -1;
//  }
  
// -------- Making a Graph/Tree --------
//  int n = read.nextInt();
//  int e = read.nextInt();
//  ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
//  for(int i = 0; i<n+1; i++)    <-- Initializing arraylist for every node
//  {
//    arr.add(new ArrayList<Integer>());
//  }
//  
//  for(int i = 0; i<e; i++)     <-- Adding edges
//  {
//    int u = read.nextInt();
//    int v = read.nextInt();
//    
//    arr.get(u).add(v);
//    arr.get(v).add(u);    <-- Not needed if directed graph
//  }
  
// -------- Simple DFS (after making graph) --------
//  static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
//  static int nmax = 10000+10;
//  static boolean [] visited = new boolean[nmax];
//  static void dfs(int u)
//  {
//    visited[u] = true;
//    
//    for(Integer i: arr.get(u))
//    {
//      if(!visited[i])
//      {
//        dfs(i);
//      }
//    }
//  }
  
// -------- Simple BFS  (after making graph) --------
//  static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
//  static int nmax = 10000+10;
//  static boolean [] visited = new boolean[nmax];
//  static int [] parent = new int[nmax];
//  static void bfs(int u)
//  {
//    Queue<Integer> q = new LinkedList<Integer>();
//    q.add(u);
//    visited[u] = true;
//    System.out.println("Visited "+u);
//    while(q.size() > 0)
//    {
//      u = q.poll();
//      for(Integer i: arr.get(u))
//      {
//        if(!visited[i])
//        {
//          System.out.println("Marking "+i+" from "+u);
//          q.add(i);
//          visited[i] = true;
//          parent[i] = u;
//        }
//      }
//    }
//  }
  
  public static void main(String[]args) throws IOException
  {
    /*    
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader read = new BufferedReader(isr);
     */
    // BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner read = new Scanner(System.in);
    
    
  }
}

// -------- Creating own Class --------
//class className
//{
//  int v1;
//  int v2;
//  public className(int x, int y)
//  {
//    v1 = x;
//    v2 = y;
//  }
// 
//  public String toString()
//  {
//    return v1+" "+v2;
//  }
//}

// -------- For Comparision or Sorting --------
// *Paste it in the main class*
//Collections.sort(arr, new Comparator<className>(){
//      public int compare(className a, className b)
//      {
//        if(a.v1 == b.v1)
//        {
//          return b.v2 - a.v2;
//        }
//        else
//        {
//          return a.v1 - b.v1;
//        }
//      }
//    });