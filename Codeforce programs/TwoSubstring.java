//Written by Shagoto
import java.util.*;
public class TwoSubstring
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in); 
    
    String s = read.nextLine();
    
    if(s.contains("AB") && s.substring(s.indexOf("AB") + 2).contains("BA"))
    {
      System.out.println("YES");
    }
    else if(s.contains("BA") && s.substring(s.indexOf("BA") + 2).contains("AB"))
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}