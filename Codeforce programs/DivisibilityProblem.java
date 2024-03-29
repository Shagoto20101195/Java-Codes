//Written by Shagoto
import java.util.Scanner;
public class DivisibilityProblem
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      long a = read.nextLong();
      long b = read.nextLong();
      
      if(a % b == 0)
      {
        System.out.println(0);
      }
      else
      {
        System.out.println(b - (a % b));
      }
    }
  }
}