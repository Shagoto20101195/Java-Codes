//Written by Shagoto
import java.util.Scanner;
public class FormattingNumbers
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    if(n < 1000)
    {
      System.out.println(n);
    }
    else
    {
      char [] ch = (""+n).toCharArray();
      
      if(ch.length % 3 == 0)
      {
        String s = "";
        for(int i = 0; i<ch.length; i++)
        {
          s += ch[i];
          if(i % 3 == 2 && i < ch.length-1)
          {
            s += ",";
          }
        }
        System.out.println(s);
      }
      
      else if(ch.length % 3 == 1)
      {
        String s = "";
        for(int i = 0; i<ch.length; i++)
        {
          s += ch[i];
          if(i == 0)
          {
            s += ",";
          }
          else if(i % 3 == 0 && i < ch.length-1)
          {
            s += ",";
          }
        }
        System.out.println(s);
      }
      
      else if(ch.length % 3 == 2)
      {
        String s = "";
        for(int i = 0; i<ch.length; i++)
        {
          s += ch[i];
          if(i == 1)
          {
            s += ",";
          }
          else if(i % 3 == 1 && i < ch.length-1)
          {
            s += ",";
          }
        }
        System.out.println(s);
      }
    }
  }
}