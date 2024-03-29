//Written by Shagoto
import java.util.*;
public class CaptainFlintAndCrewRecruitment
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      if(n <= 30)
      {
        System.out.println("NO");
      }
      else if(n == 36)
      {
        System.out.println("YES");
        System.out.println("5 6 10 15");
      }
      else if(n == 40)
      {
        System.out.println("YES");
        System.out.println("6 10 15 9");
      }
      else if(n == 44)
      {
        System.out.println("YES");
        System.out.println("10 14 15 5");
      }
      else
      {
        System.out.println("YES");
        System.out.println("6 10 14 "+(n - 6 - 10 -14));
      }
    }
  }
}