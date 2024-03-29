//Written by Shagoto
import java.util.Scanner;
public class Hulk
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    String s = "";
    for(int i = 1; i<=n; i++)
    {
      if(i % 2 == 1)
      {
        s += "I hate ";
        if(n > 1 && i < n)
        {
          s += "that ";
        }
      }
      else
      {
        s += "I love ";
        if(n > 1 && i < n)
        {
          s += "that ";
        }
      }
    }
    System.out.println(s+"it");
  }
}