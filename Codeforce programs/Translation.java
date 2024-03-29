//Written by Shagoto
import java.util.Scanner;
public class Translation
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String t = read.nextLine();
    String s = read.nextLine();
    
    char [] chT = t.toCharArray();
    char [] chS = s.toCharArray();
    
    if(chT.length == chS.length)
    {
      int count = 0;
      for(int i = 0; i<chT.length; i++)
      {
        if(chT[i] == chS[chS.length - i - 1])
        {
          count++;
        }
      }
      
      if(count == chT.length)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
    else
    {
      System.out.println("NO");
    }
  }
}