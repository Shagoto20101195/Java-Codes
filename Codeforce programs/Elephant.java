//Written by Shagoto
import java.util.Scanner;
public class Elephant
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int x = read.nextInt();
    
    if(x < 6)
    {
      System.out.println(1);
    }
    else
    {
      int count = 0;
      int pos = 0;
      
      for(pos = 0; pos+5 <= x; )
      {
        pos += 5;
        count++;
      }
      
      if(pos != x)
      {
        count++;
      }
      System.out.println(count);
    }
  }
}