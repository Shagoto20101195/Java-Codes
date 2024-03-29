//Written by Shagoto
import java.util.*;
public class EpicGame
{
  static int gcd(int a, int b)
  {
    if(b == 0)
    {
      return a;
    }
    return gcd(b, a%b);
  }
  
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int a = read.nextInt();
    int b = read.nextInt();
    int n = read.nextInt();
    
    int count = 0;
    while(n > 0)
    {
      if(count % 2 == 0)
      {
        n -= gcd(a,n);
      }
      else
      {
        n -= gcd(b,n);
      }
      count++;
    }
    
    if(count % 2 == 1)
    {
      System.out.println(0);
    }
    else
    {
      System.out.println(1);
    }
  }
}