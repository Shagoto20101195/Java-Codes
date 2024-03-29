//Written by Shagoto
import java.util.Scanner;
public class NearlyLuckyNumber
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    char [] ch = (""+n).toCharArray();
    long count = 0;
    
    for(int i = 0; i<ch.length; i++)
    {
      if(ch[i] == '4' || ch[i] == '7')
      {
        count++;
      }
    }
    
    boolean check = true;
    long temp = count;
    while(count > 0)
    {
      if(count % 10 == 7 || count % 10 == 4)
      {
        count = count / 10;
      }
      else
      {
        check = false;
        break;
      }
    }
    
    if(check == true && temp > 0)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}