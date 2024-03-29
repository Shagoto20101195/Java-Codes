//Written by Shagoto
import java.util.Scanner;
public class JohnyLikesNumbers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long k = read.nextLong();
    
    if(n < k)
    {
      System.out.println(k);
    }
    else
    {
      if(n % k == 0)
      {
        System.out.println(n+k);
      }
      else
      {
        System.out.println((n/k + 1)*k);
      }
    }
  }
}