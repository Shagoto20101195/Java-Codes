import java.util.Scanner;
public class Problem24
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      System.out.print(i);
    }
    n = n - 1;
    for(int j = n; j>=1; j--)
    {
      System.out.print(j);
    }
    System.out.println();
  }
}