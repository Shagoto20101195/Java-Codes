//Written by Shagoto
import java.util.Scanner;
public class Magnets
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    read.nextLine();
    char lastChar = '0';
    int count = 1;
    
    for(int i = 1; i<=n; i++)
    {
      String s = read.nextLine();
      char [] ch = s.toCharArray();
      
      if(i == 1)
      {
        lastChar = ch[1];
      }
      else
      {
        if(lastChar == ch[0])
        {
          count++;
          lastChar = ch[1];
        }
      }
    }
    
    if(n == 1)
    {
      System.out.println(1);
    }
    else
    {
      System.out.println(count);
    }
  }
}