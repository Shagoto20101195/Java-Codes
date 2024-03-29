//Written by Shagoto
import java.util.Scanner;
public class Candies
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      int n = read.nextInt();
      
      int k = 2;
      int sum = 1;
      
      for(int i = 1; i>0; k++)
      {
        int temp = (int)Math.pow(2, k-1);
        sum += temp;
        
        if(n % sum == 0)
        {
          break;
        }
      }
      
      System.out.println(n / sum);
    }
  }
}