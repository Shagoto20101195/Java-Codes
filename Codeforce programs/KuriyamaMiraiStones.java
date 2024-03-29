//Written by Shagoto
import java.util.*;
import java.io.*;
public class KuriyamaMiraiStones
{
// -------- Generating Prime Numbers Using Bit-wise sieve --------
//  static HashSet<Integer> primes = new HashSet<Integer>();
//  static BitSet bs = new BitSet(10000001);
//  static void sieve()
//  {
//    primes.add(2);
//    for(int i = 4; i<=10000000; i+=2)
//    {
//      bs.set(i,true);
//    }
//    
//    for(int i = 3; i<=10000000; i+=2)
//    {
//      if(!bs.get(i))
//      {
//        primes.add(i);
//        for(int j = 3; i*j<=10000000; j+=2)
//        {
//          bs.set(i*j,true);
//        }
//      }
//    }
//  }
  
// -------- Prefix Sum --------
// pref[r] - pref[l - 1]
// xor(l, r) = pref[r]^pref[l - 1]
  
// -------- Phi Function --------
  static int phi(int n) 
  { 
    int ret = n;  
    for(int i = 2; i*i <= n; i++) 
    { 
      if(n % i == 0)  
      { 
        while(n % i == 0) 
        {
          n /= i; 
        }
        ret -= ret / i; 
      } 
    } 
    
    if(n > 1) 
    {
      ret -= ret / n; 
    }
    return ret; 
  }
  
// -------- GCD of Two Numbers --------  
  static int gcd(int a, int b)
  {
    if(b == 0)
    {
      return a;
    }
    return gcd(b, a % b);  
  }
  
//  -------- Binary Search --------
  static int binarySearch(int [] arr, int x)
  {
    int low = 0;
    int high = arr.length - 1;
    
    while(low <= high)
    {
      int mid = (low + high) / 2;
      
      if(arr[mid] == x)
      {
        return mid;
      }
      else if(arr[mid] > x)
      {
        high = mid - 1;
      }
      else
      {
        low = mid + 1;
      }
    }
    return -1;
  }
  
  public static void main(String[]args) throws IOException
  {
    /*    
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader read = new BufferedReader(isr);
     */    
    Scanner read = new Scanner(System.in); 
    
    ArrayList<Long> sum = new ArrayList<Long>();
    ArrayList<Long> sort_sum = new ArrayList<Long>();
    ArrayList<Long> arr = new ArrayList<Long>();
    sum.add((long)0);
    sort_sum.add((long)0);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      arr.add(read.nextLong());
      sum.add(sum.get(i-1) + arr.get(i-1));
    }
    
    Collections.sort(arr);
    for(int i = 1; i<=n; i++)
    {
      sort_sum.add(sort_sum.get(i-1) + arr.get(i-1));
    }
    
    int q = read.nextInt();
    for(int i = 1; i<=q; i++)
    {
      int t = read.nextInt();
      int l = read.nextInt();
      int r = read.nextInt();
      
      if(t == 1)
      {
        System.out.println(sum.get(r) - sum.get(l - 1));
      }
      else
      {
        System.out.println(sort_sum.get(r) - sort_sum.get(l - 1));
      }
    }
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