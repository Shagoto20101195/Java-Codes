//Written by Shagoto
import java.util.*;
public class ShortSubstring
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    read.nextLine();
    for(int x = 1; x<=t; x++)
    {
      String s = read.nextLine();
      
      String ans = "";
      char [] ch = s.toCharArray();
      
      for(int i = 0; i<ch.length; i++)
      {
        if(i == 0 || i == 1)
        {
          ans += ""+ch[i];
        }
        else if(i % 2 == 1)
        {
          ans += ""+ch[i];
        }
      }
      
      System.out.println(ans);
    }
  }
}