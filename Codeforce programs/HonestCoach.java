//Written by Shagoto
import java.util.*;
public class HonestCoach
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int [] a = new int[n];
      for(int i = 0; i<n; i++)
      {
        a[i] = read.nextInt();
      }
      
      int min = 0;
      for(int i = 0; i<n; i++)
      {
        for(int j = i+1; j<n; j++)
        {
          if(i == 0 && j == 1)
          {
            min = (int)Math.abs(a[i] - a[j]);
          }
          else if((int)Math.abs(a[i] - a[j]) < min)
          {
            min = (int)Math.abs(a[i] - a[j]);
          }
        }
      }
      System.out.println(min);
    }
  }
}