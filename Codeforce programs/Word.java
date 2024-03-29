//Written by Shagoto
import java.util.Scanner;
public class Word
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    
    int uL = 0;
    int lL = 0;
    for(int i = 0; i<ch.length; i++)
    {
      int temp = (int)ch[i];
      
      if(temp >= 65 && temp <= 95)
      {
        uL++;
      }
      else if(temp >= 97 && temp <= 122)
      {
        lL++;
      }
    }
    
    if(uL > lL)
    {
      for(int i = 0; i<ch.length; i++)
      {
        int temp = (int)ch[i];
        
        if(temp >= 97 && temp <= 122)
        {
          ch[i] = Character.toUpperCase(ch[i]);
        }
      }
    }
    else
    {
      for(int i = 0; i<ch.length; i++)
      {
        int temp = (int)ch[i];
        
        if(temp >= 65 && temp <= 95)
        {
          ch[i] = Character.toLowerCase(ch[i]);
        }
      }
    }
    
    String ans = new String(ch);
    System.out.println(ans);
  }
}