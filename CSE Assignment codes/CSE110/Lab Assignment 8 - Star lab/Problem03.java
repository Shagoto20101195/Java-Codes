import java.util.Scanner;
public class Problem03
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int row = read.nextInt();
    int column = read.nextInt();
    
    for(int i = 1; i<=row; i++)
    {
      for(int j = 1; j<=column; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}