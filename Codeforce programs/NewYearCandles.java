//Written by Shagoto
import java.util.*;
public class NewYearCandles
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int a = read.nextInt();
    int b = read.nextInt();
    
    int t = a;
    int remain = 0;
    while(a >= b)
    {
      remain = a % b;
      a /= b;
      t += a;
      a += remain;
    }
    
    System.out.println(t);
  }
}