// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class kDivisibleSum
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int t = Integer.parseInt(read.nextLine());
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int k = read.nextInt();
      
      if(n % k == 0)
      {
        System.out.println(1);
      }
      else if(k % n == 0)
      {
        System.out.println(k / n);
      }
      else if(n > k)
      {
        System.out.println(2);
      }
      else
      {
        System.out.println(k / n + 1);
      }
    }
  }
}