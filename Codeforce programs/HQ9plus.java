//Written by Shagoto
import java.util.Scanner;
public class HQ9plus
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    char [] ch = s.toCharArray();
    
    int count = 0;
    for(int i = 0; i<ch.length; i++)
    {
      if(ch[i] == 'H' || ch[i] == 'Q' || ch[i] == '9')
      {
        count++;
      }
    }
    
    if(count > 0)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}