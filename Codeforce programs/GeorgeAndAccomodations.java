//Written by Shagoto
import java.util.Scanner;
public class GeorgeAndAccomodations
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int count = 0;
    
    for(int i = 1; i<=n; i++)
    {
      int p = read.nextInt();
      int q = read.nextInt();
      
      if(p < q && q - p >= 2)
      {
        count++;
      }
    }
    
    System.out.println(count);
  }
}