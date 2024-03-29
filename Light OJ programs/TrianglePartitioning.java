//Written by Shagoto
import java.util.*;
import java.io.*;
import java.lang.Math;
public class TrianglePartitioning
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
  
// -------- Binary to Decimal --------
  static int decimal(String s)
  {
    int ret = 0;
    for(int i = 0, j = s.length()-1; j>=0; i++, j--)
    {
      if(s.charAt(j) == '1')
      {
        ret |= (1<<i);
      }
    }
    return ret;
  }
  
// -------- Decimal to Binary --------
  static String binary(int x)
  {
    String ret = "";
    for(int i = 31; i>=0; i--)
    {
      int mask = (1<<i);
      if((x & mask) != 0)
      {
        ret += "1";
      }
      else
      {
        ret += "0";
      }
    }
    return ret;
  }
  
// -------- Prefix Sum --------
// If zero indexed, add 1  
// pref.add(0)  
// pref.get(r) - pref.get(l - 1)
// xor(l, r) = pref[r]^pref[l - 1]
  
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
  
  public static void main(String[]args) throws IOException
  {
/*    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader read = new BufferedReader(isr);
*/    
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      double ab = read.nextDouble();
      double ac = read.nextDouble();
      double bc = read.nextDouble();
      double ratio = read.nextDouble();
      
      double angle = Math.acos(((ab*ab) + (bc*bc) - (ac*ac)) / (2 * ab * bc) );
      double areaBig = 0.5 * ab * bc * Math.sin(angle);
      double areaSmall = areaBig / (1.0 + (1.0 / ratio));
      double de = Math.sqrt(areaSmall / areaBig * (bc*bc));
      double ans = areaSmall / (0.5 * de * Math.sin(angle));
      System.out.println("Case "+x+": "+ans);
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