//Written by Shagoto
import java.util.Scanner;
public class BearandBigBrother
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int a = read.nextInt();
    int b = read.nextInt();
    int year = 0;
    while(a<=b)
    {
      a = a * 3;
      b = b * 2;
      year += 1;
    }
    
    System.out.println(year);
  }
}