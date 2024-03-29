//Written by Shagoto
import java.util.Scanner;
public class PerfectSquare
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int m = 1; m<=t; m++)
    {
      int n = read.nextInt();
      int [] num = new int [n];
      int product = 1;
      
      for(int i = 0; i<num.length; i++)
      {
        num[i] = read.nextInt();
        product *= num[i];
      }
      
      int checker = 0;
      for(int j = 0; j*j<=product; j++)
      {
        if(j*j == product)
        {
          checker = 1;
        }
      }
      
      if(checker == 1)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}