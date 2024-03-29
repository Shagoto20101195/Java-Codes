//Written by Shagoto
import java.util.Scanner;
public class CircleInSquare
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      double r = read.nextDouble();
      double area = (4 - Math.PI) * r * r;
      String ans = String.format("%.2f",area);
      System.out.printf("Case "+x+": "+ans);
      System.out.println();
    }
  }
}