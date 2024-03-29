//Written by Shagoto
import java.util.Scanner;
public class Football
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    int check1 = s.indexOf("1111111");
    int check2 = s.indexOf("0000000");
    
    if(check1 > -1 || check2 > -1)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}