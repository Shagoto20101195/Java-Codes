//Written by Shagoto
import java.util.*;
public class Decoding
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    String s = read.nextLine();
    String ans = "";
    
    if(s.length() == 1 || s.length() == 2)
    {
      System.out.println(s);
    }
    else if(s.length() % 2 == 1)
    {
      int count = 0;
      for(int i = 0; i<s.length(); i++)
      {
        if(i == 0)
        {
          ans = ans + s.charAt(i);
        }
        else if(count % 2 == 0)
        {
          ans = s.charAt(i) + ans;
          count++;
        }
        else
        {
          ans = ans + s.charAt(i);
          count++;
        }
      }
    }
    else
    {
      int count = 0;
      for(int i = 0; i<s.length(); i++)
      {
        if(i == 0)
        {
          ans = ans + s.charAt(i);
        }
        else if(count % 2 == 0)
        {
          ans = ans + s.charAt(i);
          count++;
        }
        else
        {
          ans = s.charAt(i) + ans;
          count++;
        }
      }
    }
    
    System.out.println(ans);
  }
}