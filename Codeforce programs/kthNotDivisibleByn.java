//Written by Shagoto
import java.util.*;
public class kthNotDivisibleByn
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      int k = read.nextInt();
      
      if(k < n)
      {
        System.out.println(k);
      }
      else if(k == n)
      {
        System.out.println(k + 1);
      }
      else
      {
        System.out.println(k + (k-1)/(n-1));
      }
    }
  }
}