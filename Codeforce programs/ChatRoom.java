//Written by Shagoto
import java.util.Scanner;
public class ChatRoom
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    
    int count = 1;
    String check = "";
    for(int i = 0; i<ch.length; i++)
    {
      if(ch[i] == 'h' && count == 1)
      {
        check += ch[i];
        count++;
      }
      else if(ch[i] == 'e' && count == 2)
      {
        check += ch[i];
        count++;
      }
      else if(ch[i] == 'l' && count == 3)
      {
        check += ch[i];
        count++;
      }
      else if(ch[i] == 'l' && count == 4)
      {
        check += ch[i];
        count++;
      }
      else if(ch[i] == 'o' && count == 5)
      {
        check += ch[i];
        count++;
      }
      else if(count == 6)
      {
        break;
      }
    }
    
    if(count == 6)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}