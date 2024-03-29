//Written by Shagoto
import java.util.Scanner;
public class cAPSlOCK
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    int count = 0;
    
    for(int i = 0; i<ch.length; i++)
    {
      int temp = (int)ch[i];
      
      if(i == 0 && ((temp >= 65 && temp <= 97) || (temp >= 97 && temp <= 122)))
      {
        count++;
      }
      else if(i > 0 && (temp >= 65 && temp <= 95))
      {
        count++;
      }
    }
    
    if(count != ch.length)
    {
      System.out.println(s);
    }
    else
    {
      for(int i = 0; i<ch.length; i++)
      {
        int temp = (int)ch[i];
        
        if(i == 0 && (temp >= 97 && temp <= 122))
        {
          ch[i] = Character.toUpperCase(ch[i]);
        }
        else if(i == 0 && (temp >= 65 && temp <= 95))
        {
          ch[i] = Character.toLowerCase(ch[i]);
        }
        else if(i > 0 && (temp >= 65 && temp <= 95))
        {
          ch[i] = Character.toLowerCase(ch[i]);
        }
      }
      
      String ans = new String(ch);
      System.out.println(ans);
    }
  }
}