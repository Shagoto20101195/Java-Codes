//Written by Shagoto
import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int t = read.nextInt();
    for(int x = 1; x<=t; x++)
    {
      String [] s = new String[5];
      int [] num = new int[5];
      int max = num[0];
      String react = "";
      
      if(x == 1)
      {
        read.nextLine();
        for(int i = 0; i<s.length; i++)
        {
          s[i] = read.nextLine();
          char [] ch = s[i].toCharArray();
          num[i] = ch[ch.length-1];
          
          if(num[i] > max)
          {
            max = num[i];
            react = s[i];
          }
        }
      }
      else
      {
        for(int i = 0; i<s.length; i++)
        {
          s[i] = read.nextLine();
          char [] ch = s[i].toCharArray();
          num[i] = ch[ch.length-1];
          
          if(num[i] > max)
          {
            max = num[i];
            react = s[i];
          }
        }
      }

      String [] part = react.split(" ");
      System.out.println("Case "+x+": "+part[0]);
    }
  }
}