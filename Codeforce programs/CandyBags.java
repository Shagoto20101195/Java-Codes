// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class CandyBags
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long total = (n*n) * (n*n + 1) / 2 / n;
    long start = 1;
    long end = n*n;
    for(int i = 1; i<=n; i++)
    {
      long sum = 0;
      while(sum != total)
      {
        System.out.print(start+" "+end+" ");
        sum += start + end;
        start++;
        end--;
      }
      System.out.println();
    }
  }
}