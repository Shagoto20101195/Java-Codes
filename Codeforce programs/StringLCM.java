// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class StringLCM
{
  static int gcd(int a, int b)
  {
    if(b == 0)
    {
      return a;
    }
    return gcd(b, a % b);  
  }
  
  static int lcm(int a, int b)
  {
    return (a * b) / gcd(a, b);
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t  = read.nextInt();
    read.nextLine();
    for(int x = 1; x<=t; x++)
    {
      String a = read.nextLine();
      String b = read.nextLine();
      
      int lcm = lcm(a.length(), b.length());
      String temp1 = "";
      String temp2 = "";
      
      for(int i = 0; i<lcm/a.length(); i++)
      {
        temp1 += a;
      }
      for(int i = 0; i<lcm/b.length(); i++)
      {
        temp2 += b;
      }
      
      if(temp1.equals(temp2))
      {
        System.out.println(temp1);
      }
      else
      {
        System.out.println(-1);
      }
    }
  }
}