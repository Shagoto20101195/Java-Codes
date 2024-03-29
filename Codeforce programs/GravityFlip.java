//Written by Shagoto
import java.util.*;
public class GravityFlip
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int [] a = new int[n];
    for(int i = 0; i<n; i++)
    {
      a[i] = read.nextInt();
    }
    
    Arrays.sort(a);
    for(int i = 0; i<n; i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
}