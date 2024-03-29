//Written by Shagoto
import java.util.Scanner;
public class LuckyDivision
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    char [] ch = (""+n).toCharArray();
    
    int count = 0;
    for(int i = 0; i<ch.length; i++)
    {
      if(ch[i] == '7' || ch[i] == '4')
      {
        count++;
      }
    }
    
    if(count == ch.length)
    {
      System.out.println("YES");
    }
    else if(n % 7 == 0 || n % 4 == 0 || n % 47 == 0 || n % 74 == 0)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}