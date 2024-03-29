//Written by Shagoto
import java.util.*;
public class ThreePilesOfCandies
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long a = read.nextLong();
      long b = read.nextLong();
      long c = read.nextLong();
      System.out.println((a + b + c) / 2);
    }
  }
}