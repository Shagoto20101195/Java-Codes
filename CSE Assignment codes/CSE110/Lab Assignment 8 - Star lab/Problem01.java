import java.util.Scanner;
public class Problem01
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      System.out.print(i);
    }
  }
}