import java.util.*;
public class SpecialPermutation
{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      for(int i = n / 2 + 1; i<=n-1; i++)
      {
        System.out.print(i+" ");
      }
      System.out.print(n+" ");
      for(int i = n / 2; i>=1; i--)
      {
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }
}