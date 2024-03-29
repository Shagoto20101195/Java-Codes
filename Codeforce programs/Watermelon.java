//Written by Shagoto
import java.util.Scanner;
public class Watermelon
{  
  public static void main(String[]args)
  {
    Scanner read = new Scanner (System.in);
    
    int w = read.nextInt();
    
    if(w>=1 && w <=100)
    {
      if(w>2 && w % 2 == 0)
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