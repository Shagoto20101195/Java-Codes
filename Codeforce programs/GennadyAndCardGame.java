//Written by Shagoto
import java.util.*;
public class GennadyAndCardGame
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s1 = read.nextLine();
    String [] s = (read.nextLine()).split(" ");
    
    char [] ch = s1.toCharArray();
    boolean check = false;
    
    for(int i = 0; i<5; i++)
    {
      char [] temp = s[i].toCharArray();
      
      if(ch[0] == temp[0] || ch[1] == temp[1])
      {
        check = true;
        break;
      }
    }
    
    if(check)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}