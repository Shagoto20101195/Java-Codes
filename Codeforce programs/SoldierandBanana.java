//Written by Shagoto
import java.util.Scanner;
public class SoldierandBanana
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    long k = read.nextLong();
    long n = read.nextLong();
    long w = read.nextLong();
    long total = 0;
    for(int i = 1; i<=w; i++)
    {
      total += (i*k);
    }
    
    if(total > n)
    {
      System.out.println(total - n);
    }
    else
    {
      System.out.println(0);
    }
  }
}