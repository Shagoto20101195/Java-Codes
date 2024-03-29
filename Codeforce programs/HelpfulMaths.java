//Written by Shagoto
import java.util.Scanner;
public class HelpfulMaths
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    if(s.length() == 1)
    {
      System.out.println(s);
    }
    else
    {
      char [] ch = s.toCharArray();
      
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      
      for(int i = 0; i<ch.length; i++)
      {
        if(ch[i] == '1')
        {
          count1++;
        }
        else if(ch[i] == '2')
        {
          count2++;
        }
        else if(ch[i] == '3')
        {
          count3++;
        }
      }
      
      for(int i = 1; i<=count1; i++)
      {
        System.out.print(1);
        if(i < count1)
        {
          System.out.print("+");
        }
      }
      if(count1 > 0 && (count2 > 0 || count3 >0))
      {
        if(count2 == 0 && count3 > 0)
        {
        }
        else
        {
          System.out.print("+");
        }
      }
      for(int i = 1; i<=count2; i++)
      {
        System.out.print(2);
        if(i < count2)
        {
          System.out.print("+");
        }
      }
      if((count1 > 0 || count2 > 0) && count3 > 0)
      {
        System.out.print("+");
      }
      for(int i = 1; i<=count3; i++)
      {
        System.out.print(3);
        if(i < count3)
        {
          System.out.print("+");
        }
      }
      System.out.println();
    }
  }
}