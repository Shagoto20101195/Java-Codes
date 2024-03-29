//Written by Shagoto
import java.util.*;
public class AmusingJoke
{
  public static void main(String[]args)
  {
    Scanner read = new Scanner(System.in);
    
    String s1 = read.nextLine();
    String s2 = read.nextLine();
    String s3 = read.nextLine();
    
    if(s1.length() + s2.length() != s3.length())
    {
      System.out.println("NO");
    }
    else
    {
      ArrayList<Character> a = new ArrayList<Character>();
      for(int i = 0; i<s3.length(); i++)
      {
        a.add(s3.charAt(i));
      }
      
      for(int i = 0; i<s1.length(); i++)
      {
        if(a.contains(s1.charAt(i)))
        {
          a.remove(a.indexOf(s1.charAt(i)));
        }
      }
      
      for(int i = 0; i<s2.length(); i++)
      {
        if(a.contains(s2.charAt(i)))
        {
          a.remove(a.indexOf(s2.charAt(i)));
        }
      }
      
      if(a.size() == 0)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}