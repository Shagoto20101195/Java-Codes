//Written by Shagoto
import java.util.Scanner;
public class InSearchofEasyProblem
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int count = 0;
    int [] a = new int[n];
    for(int i = 0; i<a.length; i++)
    {
      a[i] = read.nextInt();
      if(a[i] == 1)
      {
        count++;
      }
    }
    
    if(count > 0)
    {
      System.out.println("HARD");
    }
    else
    {
      System.out.println("EASY");
    }
  }
}