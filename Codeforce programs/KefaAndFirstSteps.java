//Written by Shagoto
import java.util.Scanner;
public class KefaAndFirstSteps
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    long [] a = new long[n];
    for(int i = 0; i<a.length; i++)
    {
      a[i] = read.nextLong();
    }
    
    int streak = 1;
    int maxStreak = 1;
    for(int i = 1; i<a.length; i++)
    {
      if(a[i] >= a[i-1])
      {
        streak++;
        if(streak > maxStreak)
        {
          maxStreak = streak;
        }
      }
      else
      {
        streak = 1;
      }
    }
    
    System.out.println(maxStreak);
  }
}