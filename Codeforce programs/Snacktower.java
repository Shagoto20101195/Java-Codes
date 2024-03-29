//Written by Shagoto
import java.util.*;
public class Snacktower
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] a = new int[n];
    int [] check = new int[n+1];
    int max = n;
    
    for(int i = 0; i<n; i++)
    {
      a[i] = read.nextInt();
    }
    
    for(int x = 0; x<n; x++)
    {
      check[a[x]] = 1;
      
      while(check[max] == 1)
      {
        System.out.print(max + " ");
        max--;
      }
      System.out.println();
    }
  }
}