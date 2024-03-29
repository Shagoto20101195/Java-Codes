//Written by Shagoto
import java.util.Scanner;
public class BeautifulYear
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int y = read.nextInt();
    y++;
    for(int x = 1; x>0;)
    {
      char [] ch = (""+y).toCharArray();
      int count = 0;
      for(int i = 0; i<ch.length; i++)
      {
        for(int j = i+1; j<ch.length; j++)
        {
          if(ch[i] == ch[j])
          {
            count++;
            break;
          }
        }
      }
      
      if(count > 0)
      {
        y++;
      }
      else
      {
        System.out.println(y);
        break;
      }
    }
  }
}