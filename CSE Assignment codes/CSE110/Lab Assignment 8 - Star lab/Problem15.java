import java.util.Scanner;
public class Problem15
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int le = read.nextInt();
    int wi = read.nextInt();
    
    for(int i = 1; i<=le; i++)
    {
      if(i == 1 || i==le)
      {
        for(int j = 1; j<=wi; j++)
        {
          System.out.print(j);
        }
        System.out.println();
      }
      else
      {
         System.out.print(1);
         for(int b = 1; b<=wi-2; b++)
         {
           System.out.print(" ");
         }
         System.out.print(wi);
         System.out.println();
      }
    }
  }
}