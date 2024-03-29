//Written by Shagoto
import java.util.Scanner;
public class Gameof15
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long m = 1;
    
    if(n == 0)
    {
      m = 1;
    }
    else
    {
      for(long i = 1; i<=n; i++)
      {
        m *= 15;
      }
    }
    long k = 100;
    long p = m % k;
    System.out.println(p);
  }
}