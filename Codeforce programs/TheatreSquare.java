//Written by Shagoto
import java.util.*;
public class TheatreSquare
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long m = read.nextLong();
    long a = read.nextLong();
    System.out.println(((m + a - 1)/a)*((n + a - 1)/a));
  }
}