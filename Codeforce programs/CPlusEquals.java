//Written by Shagoto
import java.util.*;
public class CPlusEquals
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int a = read.nextInt();
      int b = read.nextInt();
      int n = read.nextInt();
      
      int sum = 0;
      int min = Math.min(a,b);
      int max = Math.max(a,b);
      int count = 0;
      
      while(sum <= n)
      {
        min += max;
        count++;
        sum = min;
        int temp1 = min;
        int temp2 = max;
        max = Math.max(temp1,temp2);
        min = Math.min(temp1,temp2);
      }
      
      System.out.println(count);
    }
  }
}