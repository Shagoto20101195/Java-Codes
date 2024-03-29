//Written by Shagoto
import java.util.Scanner;
public class Bit
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int X = 0;
    int n = read.nextInt();
    
    if(n == 1)
    {
      for(int i = 0; i<2; i++)
      {
        String s1 = read.nextLine();
        if(s1.equals("++X") == true || s1.equals("X++") == true)
        {
          X++;
        }
        else if(s1.equals("--X") == true || s1.equals("X--") == true)
        {
          X--;
        }
      }
    }
    
    else
    {
      String s1 = read.nextLine();
      if(s1.equals("++X") == true || s1.equals("X++") == true)
      {
        X++;
      }
      else if(s1.equals("--X") == true || s1.equals("X--") == true)
      {
        X--;
      }
      
      for(int i = 0; i<n; i++)
      {
        String s = read.nextLine();
        
        if(s.equals("++X") == true || s.equals("X++") == true)
        {
          X++;
        }
        else if(s.equals("--X") == true || s.equals("X--") == true)
        {
          X--;
        }
      }
    }
    System.out.println(X);
  }
}